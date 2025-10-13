package miau;

public class Empleado {
 private int numero;
 private String nombre;
 private double sueldo;

 public Empleado(int numero, String nombre, double sueldo) {
     this.numero = numero;
     this.nombre = nombre;
     this.sueldo = sueldo;
 }

 public int getNumero() { return numero; }
 public String getNombre() { return nombre; }
 public double getSueldo() { return sueldo; }

 public void setNombre(String nombre) { this.nombre = nombre; }
 public void setSueldo(double sueldo) { this.sueldo = sueldo; }

 @Override
 public String toString() {
     return String.format("N°:%d  Nombre:%s  Sueldo:%.2f", numero, nombre, sueldo);
 }

 // Helpers CSV
 public String aCsv() {
     return numero + "," + nombre.replace(",", " ") + "," + sueldo;
 }
 public static Empleado deCsv(String linea) {
     String[] p = linea.split(",", -1);
     int num = Integer.parseInt(p[0].trim());
     String nom = p[1].trim();
     double sue = Double.parseDouble(p[2].trim());
     return new Empleado(num, nom, sue);
 }
}
