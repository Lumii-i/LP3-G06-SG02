package actividades_s2_ac5;

//Clase base
public class Cuentas {
 protected String numeroCuenta;
 protected double saldo;

 public Cuentas(String numeroCuenta, double saldo){
     this.numeroCuenta = numeroCuenta;
     this.saldo = saldo;
 }

 public void depositar(double monto){
     saldo += monto;
 }

 public void retirar(double monto){
     if(saldo >= monto) saldo -= monto;
     else System.out.println("Fondos insuficientes.");
 }

 public double getSaldo(){ return saldo; }
 public String getNumeroCuenta(){ return numeroCuenta; }

 public void consultar(){
     // Comportamiento genérico
     System.out.println("Saldo actual: " + saldo);
 }
}

