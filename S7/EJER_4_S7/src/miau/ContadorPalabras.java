package miau;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.*;

/** Lógica del contador de palabras. */
public class ContadorPalabras {

    public static class Resultado {
        public long lineas;
        public long palabras;
        public long caracteresSinFinDeLinea;
        public double promedioPalabrasPorLinea;
        public List<Map.Entry<String, Integer>> top;
    }

    /** Procesa el archivo y devuelve las métricas solicitadas. */
    public Resultado procesar(File file, int topN) throws IOException {
        long lineas = 0, palabras = 0, charsSinEOL = 0;
        Map<String, Integer> freq = new HashMap<>();

        try (BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8)) {
            String s;
            while ((s = br.readLine()) != null) {
                lineas++;
                charsSinEOL += s.length();

                StringBuilder token = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    if (Character.isLetterOrDigit(c)) {
                        token.append(Character.toLowerCase(c));
                    } else if (token.length() > 0) {
                        palabras++;
                        freq.merge(token.toString(), 1, Integer::sum);
                        token.setLength(0);
                    }
                }
                if (token.length() > 0) { // token al final
                    palabras++;
                    freq.merge(token.toString(), 1, Integer::sum);
                }
            }
        }

        List<Map.Entry<String, Integer>> lista = new ArrayList<>(freq.entrySet());
        lista.sort((a, b) -> {
            int c = Integer.compare(b.getValue(), a.getValue());
            return (c != 0) ? c : a.getKey().compareTo(b.getKey());
        });
        if (topN > 0 && lista.size() > topN) lista = lista.subList(0, topN);

        Resultado r = new Resultado();
        r.lineas = lineas;
        r.palabras = palabras;
        r.caracteresSinFinDeLinea = charsSinEOL;
        r.promedioPalabrasPorLinea = (lineas > 0) ? (double) palabras / lineas : 0.0;
        r.top = lista;
        return r;
    }
}

