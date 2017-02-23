/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Yova
 */
public class FunCiclos {
    Scanner sc = new Scanner(System.in);
    
    /**
     * Método que permite generar el ciclo Fibonacci con For
     * @param num 
     */
    public void fibonacci(int num){
        int n1 = 0;
        int n2 = 1;
        
        for (int x = 1; x <= num;x++){
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println("Fibo: "+n2);
        }
    }
    
    /**
     * Fibonacci con While
     * @param num 
     */
    public void fibonacciWhile(int num){
        int n1 = 0;
        int n2 = 1;
        int aux = 1;
        
        while(aux<=num){
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println("Fibo: "+n2);
            
            aux++;
        }
    }
    
    public void fibonacciDoWhile(int num){
        int n1 = 0;
        int n2 = 1;
        int aux = 1;
        
        do{
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println("Fibo: "+n2);
            
            aux++;
        }while(aux<=num);
    }
    
    public void mayor(int num){
        int numMayor = 0;
        
        for (int x=1;x<=num;x++){
            int n;
            System.out.println("Ingrese el valor a comparar: ");
            n = sc.nextInt();
            
            if (n > numMayor){
                numMayor = n;
            }
        }
        
        System.out.println("El mayor es: " + numMayor);
    }
    
    public void menor(int num){
        int numMenor = 0;
        
        for (int x=1;x<=num;x++){
            int n;
            System.out.println("Ingrese el valor a comparar: ");
            n = sc.nextInt();
            
            if (n < numMenor){
                numMenor = n;
            }
        }
        
        System.out.println("El menor es: " + numMenor);
    }
    
    /**
     * Genera el resultado de una potencia sin utilizar operadores de potencia.
     * @param base
     * @param exp 
     */
    public void exponente(int base, int exp){
        int aux = 1;
        for (int x = 1; x<=exp;x++){
            aux = aux * base;
        }
        
        System.out.println("El resultado es: " + aux);
    }
}
