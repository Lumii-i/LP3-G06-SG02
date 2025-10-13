package miau;

import java.io.IOException;
import java.util.*;

public class EmpleadoControl {
 private final EmpleadoRepo repo;
 private final Map<Integer, Empleado> mapa = new LinkedHashMap<>();

 public EmpleadoControl(EmpleadoRepo repo) {
     this.repo = repo;
 }

 // Carga inicial y muestra en consola (requisito del PDF)
 public void cargarYMostrar() {
     try {
         List<Empleado> todos = repo.leerEmpleados(); // leerEmpleados()
         mapa.clear();
         for (Empleado e : todos) mapa.put(e.getNumero(), e);
         if (mapa.isEmpty()) {
             System.out.println("(Sin empleados cargados)");
         } else {
             System.out.println("Empleados almacenados:");
             listar().forEach(System.out::println);
         }
     } catch (IOException e) {
         System.out.println("Error al leer archivo: " + e.getMessage());
     }
 }

 public List<Empleado> listar() { return new ArrayList<>(mapa.values()); }

 public String agregarEmpleado(int numero, String nombre, double sueldo) {
     if (mapa.containsKey(numero)) return "Ya existe un empleado con ese número.";
     mapa.put(numero, new Empleado(numero, nombre, sueldo));
     return persistir("Empleado agregado correctamente.", "No se pudo agregar");
 }

 public Empleado buscarEmpleado(int numero) { return mapa.get(numero); }

 public String eliminarEmpleado(int numero) {
     if (mapa.remove(numero) == null) return "No existe ese número.";
     return persistir("Empleado eliminado correctamente.", "No se pudo eliminar");
 }

 private String persistir(String ok, String fail) {
     try {
         repo.guardarTodos(listar());
         return ok;
     } catch (IOException ex) {
         return fail + " (E/S): " + ex.getMessage();
     }
 }
}

