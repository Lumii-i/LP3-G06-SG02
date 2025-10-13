package miau;

//EmpleadoRepo.java
import java.io.*;
import java.util.*;

public class EmpleadoRepo {
 private final File archivo;

 public EmpleadoRepo(String ruta) { this.archivo = new File(ruta); }

 // leerEmpleados(): devuelve todos los empleados del archivo
 public List<Empleado> leerEmpleados() throws IOException {
     List<Empleado> lista = new ArrayList<>();
     if (!archivo.exists()) return lista; // vacío
     try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
         for (String s; (s = br.readLine()) != null; ) {
             s = s.trim();
             if (s.isEmpty() || s.startsWith("#")) continue;
             lista.add(Empleado.deCsv(s));
         }
     }
     return lista;
 }

 // guarda toda la lista (persistencia simple)
 public void guardarTodos(List<Empleado> lista) throws IOException {
     if (archivo.getParentFile()!=null) archivo.getParentFile().mkdirs();
     try (PrintWriter pw = new PrintWriter(new FileWriter(archivo))) {
         for (Empleado e : lista) pw.println(e.aCsv());
     }
 }
}

