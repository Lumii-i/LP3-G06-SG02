package actividades_s2_ac4;

public class TestComposicion {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Ana", "12345", 500);
        Persona persona2 = new Persona("Carlos", "67890", 1000);

        persona1.getCuenta().depositar(200);
        persona2.getCuenta().retirar(300);

        System.out.println(persona1);
        System.out.println(persona2);
    }
}
