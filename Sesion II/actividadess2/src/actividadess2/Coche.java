package actividadess2;

public class Coche { 
    // Atributos
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private double precio;
    private boolean enMarcha;

    // Constructor por defecto
    public Coche(){ 
        this.marca = "Desconocida";
        this.modelo = "Genérico";
        this.añoFabricacion = 2000;
        this.precio = 10000;
        this.enMarcha = false;
    } 

    // Constructor con parámetros
    public Coche(String marca, String modelo, int añoFabricacion, double precio){ 
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precio = precio;
        this.enMarcha = false;
    } 

    // Método aplicar descuento
    public boolean aplicarDescuento(double descuento){ 
        if(this.añoFabricacion < 2010){
            this.precio -= descuento;
            return true;
        }
        return false;
    }

    // Métodos de comportamiento
    public void encender(){
        this.enMarcha = true;
        System.out.println(modelo + " encendido.");
    }

    public void apagar(){
        this.enMarcha = false;
        System.out.println(modelo + " apagado.");
    }

    public void acelerar(){
        if(enMarcha)
            System.out.println(modelo + " acelerando...");
        else
            System.out.println(modelo + " está apagado, no puede acelerar.");
    }

    public void frenar(){
        if(enMarcha)
            System.out.println(modelo + " frenando...");
        else
            System.out.println(modelo + " está apagado, no puede frenar.");
    }

    // Getters y Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAñoFabricacion() { return añoFabricacion; }
    public void setAñoFabricacion(int añoFabricacion) { this.añoFabricacion = añoFabricacion; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
}
