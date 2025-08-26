package actividades_s2_ac5;

//Subclase CuentaAhorro
public class CuentaAhorro extends Cuentas {
 private double tasaInteres;
 private double saldoMinimo;

 public CuentaAhorro(String numeroCuenta, double saldo, double tasaInteres){
     super(numeroCuenta, saldo);
     this.tasaInteres = tasaInteres;
     this.saldoMinimo = saldo;
 }

 @Override
 public void retirar(double monto){
     super.retirar(monto);
     if(saldo < saldoMinimo) saldoMinimo = saldo;
 }

 @Override
 public void consultar(){
     double interes = saldoMinimo * tasaInteres;
     depositar(interes);
     saldoMinimo = saldo;
     System.out.println("Interés aplicado. Nuevo saldo: " + saldo);
 }
}

