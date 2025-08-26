package ejercicio_s2;

abstract class Persona {
    protected String nombre;
    protected String email;

    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public abstract void mostrarInfo(); // método abstracto
}

class Estudiante extends Persona {
    private String codigo;

    public Estudiante(String nombre, String email, String codigo) {
        super(nombre, email);
        this.codigo = codigo;
    }

    @Override
    public void mostrarInfo() { // polimorfismo (sobrescritura)
        System.out.println("Estudiante: " + nombre + " - Código: " + codigo);
    }
}

class Profesor extends Persona {
    private String carrera;

    public Profesor(String nombre, String email, String carrera) {
        super(nombre, email);
        this.carrera = carrera;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Profesor: " + nombre + " - Carrera: " + carrera);
    }
}