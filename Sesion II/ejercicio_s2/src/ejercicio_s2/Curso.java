package ejercicio_s2;

import java.util.ArrayList;

public class Curso {

    private String nombreCurso;
    private Profesor profesor; // agregación: un curso "tiene un" profesor
    private ArrayList<Estudiante> estudiantes; // agregación: curso tiene lista de estudiantes

    public static final int CAPACIDAD_MAXIMA = 10; // constante

    public Curso(String nombreCurso, Profesor profesor) {
        this.nombreCurso = nombreCurso;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void inscribirEstudiante(Estudiante e) {
        if (estudiantes.size() < CAPACIDAD_MAXIMA) {
            estudiantes.add(e);
            System.out.println(e.nombre + " se inscribió en " + nombreCurso);
        } else {
            System.out.println("Curso lleno, no se pudo inscribir.");
        }
    }

    public void mostrarInfoCurso() {
        System.out.println("Curso: " + nombreCurso + " - Profesor: " + profesor.nombre);
        System.out.println("Estudiantes inscritos: " + estudiantes.size());
    }
}

