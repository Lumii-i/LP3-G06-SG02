package actividades_s2_ac3;

public class TestAgregacion {
    public static void main(String[] args) {
        Motor motor1 = new Motor("V8", 500);
        Automovil auto1 = new Automovil("Ford", "Mustang", motor1);

        Motor motor2 = new Motor("Diesel", 200);
        Automovil auto2 = new Automovil("Toyota", "Hilux", motor2);

        System.out.println(auto1);
        System.out.println(auto2);
    }
}

