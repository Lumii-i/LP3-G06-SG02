package actividades_s2_ac4;

public class Cuenta {
    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getNumeroCuenta() { return numeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { this.numeroCuenta = numeroCuenta; }

    public double getSaldo() { return saldo; }
    public void depositar(double monto) { saldo += monto; }
    public void retirar(double monto) {
        if(saldo >= monto) saldo -= monto;
        else System.out.println("Fondos insuficientes.");
    }

    @Override
    public String toString(){
        return "Cuenta N° " + numeroCuenta + " - Saldo: " + saldo;
    }
}
