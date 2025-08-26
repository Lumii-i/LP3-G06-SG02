package actividades_s2_ac5;

import java.util.Scanner;

public class TestBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cuentas[] cuentas = new Cuentas[2];
        cuentas[0] = new CuentaAhorro("001", 1000, 0.05);
        cuentas[1] = new CuentaCorriente("002", 1500);

        boolean salir = false;
        while(!salir){
            System.out.println("\n--- MENÚ BANCO ---");
            System.out.println("D) Depositar");
            System.out.println("R) Retirar");
            System.out.println("C) Consultar");
            System.out.println("S) Salir");
            System.out.print("Opción: ");
            char opcion = sc.next().toUpperCase().charAt(0);

            switch(opcion){
                case 'D':
                    System.out.print("Ingrese número de cuenta: ");
                    String numD = sc.next();
                    System.out.print("Monto a depositar: ");
                    double montoD = sc.nextDouble();
                    for(Cuentas c : cuentas){
                        if(c.getNumeroCuenta().equals(numD)){
                            c.depositar(montoD);
                            System.out.println("Depósito realizado. Nuevo saldo: " + c.getSaldo());
                        }
                    }
                    break;
                case 'R':
                    System.out.print("Ingrese número de cuenta: ");
                    String numR = sc.next();
                    System.out.print("Monto a retirar: ");
                    double montoR = sc.nextDouble();
                    for(Cuentas c : cuentas){
                        if(c.getNumeroCuenta().equals(numR)){
                            c.retirar(montoR);
                            System.out.println("Nuevo saldo: " + c.getSaldo());
                        }
                    }
                    break;
                case 'C':
                    for(Cuentas c : cuentas){
                        System.out.println("Cuenta " + c.getNumeroCuenta());
                        c.consultar();
                    }
                    break;
                case 'S':
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }
        sc.close();
    }
}
