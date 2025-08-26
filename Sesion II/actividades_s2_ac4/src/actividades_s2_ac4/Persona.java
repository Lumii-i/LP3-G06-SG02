package actividades_s2_ac4;

public class Persona {
    private String nombre;
    private Cuenta cuenta; // Composición: una persona siempre tiene una cuenta

    public Persona(String nombre, String numeroCuenta, double saldoInicial){
        this.nombre = nombre;
        this.cuenta = new Cuenta(numeroCuenta, saldoInicial);
    }

    public String getNombre() { return nombre; }
    public Cuenta getCuenta() { return cuenta; }

    @Override
    public String toString(){
        return "Persona: " + nombre + ", " + cuenta.toString();
    }
}

