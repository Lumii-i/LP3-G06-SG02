package miau;

//EmpleadoView.java
import java.util.*;

public class EmpleadoVista {
 private final Scanner sc = new Scanner(System.in);

 public int pedirEntero(String texto) {
     while (true) {
         try { System.out.print(texto); return Integer.parseInt(sc.nextLine().trim()); }
         catch (Exception e) { System.out.println("Ingrese un entero válido."); }
     }
 }
 public double pedirDouble(String texto) {
     while (true) {
         try { System.out.print(texto); return Double.parseDouble(sc.nextLine().trim()); }
         catch (Exception e) { System.out.println("Ingrese un número válido."); }
     }
 }
 public String pedirTexto(String texto) {
     System.out.print(texto);
     return sc.nextLine().trim();
 }

 public void menu() {
     System.out.println("""
         \n== Menú ==
         1) Listar
         2) Agregar
         3) Buscar por número
         4) Eliminar por número
         0) Salir""");
 }
}
