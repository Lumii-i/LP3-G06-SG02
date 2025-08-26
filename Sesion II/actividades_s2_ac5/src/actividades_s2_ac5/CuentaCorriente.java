package actividades_s2_ac5;

//Subclase CuentaCorriente
public class CuentaCorriente extends Cuentas {
 private int retiros;
 private final int limiteRetiros = 3;
 private final double costoExtra = 3.0;

 public CuentaCorriente(String numeroCuenta, double saldo){
     super(numeroCuenta, saldo);
     this.retiros = 0;
 }

 @Override
 public void retirar(double monto){
     super.retirar(monto);
     retiros++;
     if(retiros > limiteRetiros){
         super.retirar(costoExtra);
         System.out.println("Se aplicó comisión de S/.3 por exceso de retiros.");
     }
 }

 @Override
 public void consultar(){
     retiros = 0; // Se reinician los retiros
     System.out.println("Saldo cuenta corriente: " + saldo);
 }
}
