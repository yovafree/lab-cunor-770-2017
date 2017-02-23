/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import funciones.FunCiclos;
import java.util.Scanner;

/**
 *
 * @author Yova
 */

//Determinar si un número es primo, debe de utilizar una función :D
public class ciclos {
    static Scanner sc = new Scanner(System.in);
    static FunCiclos fc = new FunCiclos(); 
    /**
     * Tarea: Sábado 25 Febrero
     * 1) imprimir X números del componente decimal
     * del número PI, lo determina el usuario.
     * 2) Crear los metodos para mayor, menor y exponente utilizando While y Do While
     * 3) Crear un menú para cada opción.
    */
    
    public static void main(String[] args){
        //Ciclo For - Para
        
        System.out.println("Ingrese la cantidad de números: ");
        int h = sc.nextInt();
        fc.fibonacci(h);
        
        /*int m = sc.nextInt();
        exponente(h,m);*/
        
        //menor(h);
        //mayor(h);
        //fibonacci(h);
        /*for(int n=0;n<=h;n=n+2){
            System.out.println("El valor es: " + n);
        }*/
    }
    
}