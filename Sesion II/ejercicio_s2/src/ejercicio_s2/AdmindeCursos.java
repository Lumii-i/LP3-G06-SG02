package ejercicio_s2;

import java.util.ArrayList;

public class AdmindeCursos {


public class CursosDisponibles {
    public static void main(String[] args) {
        // Creamos la lista de cursos
        ArrayList<String> cursos = new ArrayList<>();

        // Agregamos cursos manualmente
        cursos.add("Lenguajes de la Programacion III");
        cursos.add("Fundamentos de S. I.");
        cursos.add("Computacion en Red I");

        // Mostramos los cursos disponibles
        System.out.println("Cursos disponibles:");
        for (String curso : cursos) {
            System.out.println("- " + curso);
        }
    }
}
}

