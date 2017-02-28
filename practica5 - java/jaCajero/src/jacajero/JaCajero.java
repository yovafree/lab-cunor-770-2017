/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacajero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Yova
 */
public class JaCajero {

    public static void main(String args[]) {
        InputStreamReader isr;
        isr = new InputStreamReader(System.in);
        BufferedReader br;
        br = new BufferedReader(isr);
        double dSaldoInicial, dCant;

        args = new String[1];
        args[0] = "1000";

        int iOpcn;

        if (args.length == 0) {
            System.out.println("ERROR!, debe proporcionar argumentos!");
            System.out.println("Uso: java cajero ");
            return;
        }
        Double d = new Double(args[0]);
        dSaldoInicial = d.doubleValue();
        if (dSaldoInicial <= 0) {
            System.out.println("ERROR!, el saldo debe ser al menos de 1.00");
            System.out.println("Uso: java cajero ");
            return;
        }
        _Cajero miCajero = new _Cajero(dSaldoInicial);
        iOpcn = -1;
        do {
            try {
                System.out.println("-----------------------------------");
                System.out.println("- CAJERO AUTOMATICO BANCO CUNOR -");
                System.out.println("-----------------------------------");
                System.out.println(" 1. Consultar saldo");
                System.out.println(" 2. Depositar");
                System.out.println(" 3. Retirar");
                System.out.println(" 0. Terminar");
                System.out.println("-----------------------------------");
                System.out.print("Teclea el numero de la opcion que desee: ");
                iOpcn = Integer.parseInt(br.readLine());
                System.out.println("\n\n\n");
                System.out.println("\n*----------------------------------------------*");
                switch (iOpcn) {
                    case 1: // Consultar saldo
                        System.out.println("* CONSULTA DE SALDO *");
                        System.out.println("*----------------------------------------------*");
                        System.out.println("El saldo de la cuenta es: " + miCajero.Saldo());
                        break;
                    case 2: // Hacer un deposito
                        System.out.println("* DEPOSITAR EN LA CUENTA *");
                        System.out.println("*----------------------------------------------*");
                        System.out.print("Escriba la cantidad a depositar: ");
                        d = new Double(br.readLine());
                        dCant = d.doubleValue();
                        miCajero.Deposita(dCant);
                        break;
                    case 3: // Hacer un retiro
                        System.out.println("* RETIRAR DE LA CUENTA *");
                        System.out.println("*----------------------------------------------*");
                        System.out.print("El saldo de la cuenta es: " + miCajero.Saldo()
                                + "\nEscriba la cantidad a retirar:");
                        d = new Double(br.readLine());
                        dCant = d.doubleValue();
                        miCajero.Retira(dCant);
                        break;
                    case 0:
                        System.out.println("*----------------------------------------*");
                        System.out.println("* Gracias por visitar al cajero feliz :) *");
                        System.out.println("*----------------------------------------*");
                        System.out.println("\n\n\n");
                        return;
                } // fin del switch
                System.out.println("*----------------------------------------------*");
                System.out.println("Presiona Enter para continuar...");
                br.readLine();
            } // fin del try
            catch (Exception ex) {
                System.out.println("\n\n\n");
                System.out.println("--o--o--o--o--o--o--o--o--o--");
                System.out.println("- Error! Numero incorrecto -");
                System.out.println("--o--o-A-o--o--o--o--o--o--o--");
                System.out.println("\n\n\n");
            } // fin del catch
        } while (iOpcn != 0);
    } // fin de main   
}
