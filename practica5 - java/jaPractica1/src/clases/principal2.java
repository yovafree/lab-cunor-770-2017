/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Yova
 */

//Permite determinar el mayor de 5 números.
public class principal2 {
    static int num1, num2, num3, num4, num5;
    public static void main(String[] args){
        // Operadores lógicos, AND, OR NOT
        // AND = &&
        // OR = ||
        // NOT = !
        num1 = 45;
        num2 = 80;
        num3 = 10;
        num4 = 8;
        num5 = 1000000;
        if (num1>num2 && num1>num3 && num1>num4 && num1>num5){
            System.out.println("El mayor es num1: " + num1);
        }else if(num2>num3 && num2>num4 && num2>num5){
            System.out.println("El mayor es num2: "+ num2);
        }else if(num3>num4 && num3>num5){
            System.out.println("El mayor es num3: " + num3);
        }else if(num4>num5){
            System.out.println("El mayor es num4: " + num4);
        }else{
            System.out.println("El mayor es num5: " + num5);
        }
        
        //El menor de 5 números
        if (num1<num2 && num1<num3 && num1<num4 && num1<num5){
            System.out.println("El menor es num1: " + num1);
        }else if(num2<num3 && num2<num4 && num2<num5){
            System.out.println("El menor es num2: "+ num2);
        }else if(num3<num4 && num3<num5){
            System.out.println("El menor es num3: " + num3);
        }else if(num4<num5){
            System.out.println("El menor es num4: " + num4);
        }else{
            System.out.println("El menor es num5: " + num5);
        }
        
    }
}
