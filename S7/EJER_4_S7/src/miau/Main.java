package miau;

import java.io.File;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File f;
            if (args.length > 0) {
                f = new File(args[0]);
            } else {
                Scanner sc = new Scanner(System.in);
                System.out.print("Ruta del archivo a analizar: ");
                f = new File(sc.nextLine().trim());
            }
            if (f == null || !f.exists() || !f.isFile() || !f.canRead()) {
                System.out.println("Archivo inválido o no legible.");
                return;
            }

            ContadorPalabras cp = new ContadorPalabras();
            ContadorPalabras.Resultado R = cp.procesar(f, 10);

            System.out.println("==== CONTADOR DE PALABRAS ====");
            System.out.println("Archivo: " + f.getAbsolutePath());
            System.out.println("Total de líneas: " + R.lineas);
            System.out.println("Total de palabras: " + R.palabras);
            System.out.println("Total de caracteres (sin fin de línea): " + R.caracteresSinFinDeLinea);
            System.out.printf(Locale.ROOT, "Promedio de palabras por línea: %.3f%n", R.promedioPalabrasPorLinea);
            System.out.println("Palabras más frecuentes (top " + R.top.size() + "):");
            int i = 1;
            for (Map.Entry<String,Integer> e : R.top) {
                System.out.printf(Locale.ROOT, "%2d) %-20s %d%n", i++, e.getKey(), e.getValue());
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
