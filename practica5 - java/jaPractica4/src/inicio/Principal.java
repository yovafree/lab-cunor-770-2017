/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

/**
 * Recursividad con devolución y sin devolución.
 * @author Yova
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Exponente: " + exponente(1,2,10));
        
        //fibonacci(0,1,10);
        
        if (primo(107,1,0) == 2){
            System.out.print("Es primo");
        }else{
            System.out.print("No es primo");
        }
    }
    
    public static double exponente(double valor, int base, int exponente){
        if (exponente > 0){
            valor = valor * base;
            exponente--;
            valor = exponente(valor, base, exponente);
        }
        return valor;
    }
    
    public static void fibonacci(int valx, int valy, int n){
        if (n > 0){
            valx = valx + valy;
            valy = valx - valy;
            System.out.print(valx + ", ");
            n--;
            fibonacci(valx,valy,n);
        }
    }
    
    //Ejercicio en clase, Verificar mediante recursividad si un número es primo.
    
    public static int primo(int num, int aux, int val){
        if (aux<=num){
            if ((num % aux) == 0){
                val++;
            }
            aux++;
            val = primo(num,aux,val);
        }
        return val;
    }
}
