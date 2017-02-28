/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jacajero;

/**
 *
 * @author Yova
 */
public class _Cajero {

    double saldo;

    public _Cajero(double sal_ini) {
        this.saldo = sal_ini;
    } // fin del constructor

    public double Saldo() {
        return this.saldo;
    }

    public void Deposita(double d) {
        if (d <= 0) {
            System.out.println("No existen pesos negativos... no se hizo nada");
            return;
        }
        this.saldo += d;
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }

    public void Retira(double r) {
        if (r <= 0) {
            System.out.println("No existen pesos negativos... no se hizo nada");
            return;
        }
        if (this.saldo < r) {
            System.out.println("La cantidad a retirar es mayor que el saldo disponible... no se hizo nada");
            return;
        }
        this.saldo -= r;
        System.out.println("El saldo de la cuenta es: " + this.saldo);
    }
}
