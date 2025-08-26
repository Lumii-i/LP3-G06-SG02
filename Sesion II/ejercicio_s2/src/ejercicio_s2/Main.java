package ejercicio_s2;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear profesores
        Profesor prof1 = new Profesor("Mario Santillana", "mario.s@ucsm.edu.pe", "Ing. de Sistemas");
        Profesor prof2 = new Profesor("Ana Torres", "ana.t@ucsm.edu.pe", "Ing. de Sistemas");
        Profesor prof3 = new Profesor("Ana Torres", "ana.t@ucsm.edu.pe", "Ing. de Sistemas");
        // Crear cursos y asignar profesores
        Curso curso1 = new Curso("Lenguajes de Programación III", prof1);
        Curso curso2 = new Curso("Fundamentos de S. I.", prof2);
        Curso curso3 = new Curso("Computacion en Red I", prof3);

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Luciana Molina", "luciana.molina@estudiante.ucsm.edu.pe", "2024000035");
        Estudiante e2 = new Estudiante("Aileen Zegarra", "aileen.zegarra@estudiante.ucsm.edu.pe", "2024003693");
        Estudiante e3 = new Estudiante("Carlos Pérez", "carlos.perez@estudiante.ucsm.edu.pe", "2024001111");

        // Inscribir estudiantes en cursos
        curso1.inscribirEstudiante(e1);
        curso1.inscribirEstudiante(e2);
        curso2.inscribirEstudiante(e3);

        // Lista de cursos
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);

        // Mostrar información de cada curso
        System.out.println("\n--- CURSOS DISPONIBLES ---");
        for (Curso c : cursos) {
            c.mostrarInfoCurso();
            System.out.println("--------------------------");
        }
    }
}


