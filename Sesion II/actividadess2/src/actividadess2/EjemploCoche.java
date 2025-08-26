package actividadess2;

public class EjemploCoche {
    public static void main(String[] args) {
        // Crear objetos coche
        Coche cocheDeportivo = new Coche("Ferrari", "F8", 2008, 200000);
        Coche cocheTodoTerreno = new Coche("Toyota", "Land Cruiser", 2015, 60000);

        // Encender
        cocheDeportivo.encender();
        cocheTodoTerreno.encender();

        // Acelerar y frenar
        cocheDeportivo.acelerar();
        cocheTodoTerreno.frenar();

        // Apagar
        cocheDeportivo.apagar();
        cocheTodoTerreno.apagar();

        // Aplicar descuento
        if(cocheDeportivo.aplicarDescuento(5000))
            System.out.println("Se aplicó descuento al deportivo. Nuevo precio: " + cocheDeportivo.getPrecio());
        else
            System.out.println("No aplica descuento al deportivo.");
    }
}
