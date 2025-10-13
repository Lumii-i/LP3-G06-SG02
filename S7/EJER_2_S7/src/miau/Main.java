package miau;

//MainMVC.java
public class Main {
 public static void main(String[] args) {
     EmpleadoRepo repo = new EmpleadoRepo("empleados.csv");
     EmpleadoControl ctl = new EmpleadoControl(repo);
     EmpleadoVista view = new EmpleadoVista();

     // Carga inicial y despliegue (PDF)
     ctl.cargarYMostrar(); // leerEmpleados() + mostrar en consola

     while (true) {
         view.menu();
         int op = view.pedirEntero("Opción: ");
         switch (op) {
             case 1 -> ctl.listar().forEach(System.out::println);
             case 2 -> {
                 int num = view.pedirEntero("Número: ");
                 String nom = view.pedirTexto("Nombre: ");
                 double sue = view.pedirDouble("Sueldo: ");
                 System.out.println(ctl.agregarEmpleado(num, nom, sue)); // agregarEmpleado()
             }
             case 3 -> {
                 int num = view.pedirEntero("Número a buscar: ");
                 var e = ctl.buscarEmpleado(num);                         // buscarEmpleado()
                 System.out.println(e != null ? e : "No encontrado.");
             }
             case 4 -> {
                 int num = view.pedirEntero("Número a eliminar: ");
                 System.out.println(ctl.eliminarEmpleado(num));           // eliminarEmpleado()
             }
             case 0 -> { System.out.println("¡Adiós!"); return; }
             default -> System.out.println("Opción inválida.");
         }
     }
 }
}
