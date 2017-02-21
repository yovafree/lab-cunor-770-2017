/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author Yova
 */
public class calculadora {
    static int num1, num2, op;
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        imprimirMenu();
        op = sc.nextInt();
        
        
        System.out.println("Ingrese el primer número");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = sc.nextInt();
        
        if (op == 1){
            System.out.println("La suma es: "+suma(num1,num2));
        }else if (op==2){
            System.out.println("La resta es: "+(num1-num2));
        }else if (op==3){
            System.out.println("La multiplicación es: "+(num1*num2));
        }else if (op==4){
            System.out.println("La división es: "+(num1/num2));
        }
    }
    
    public static void imprimirMenu(){
        System.out.println("Menú");
        System.out.println("1) Suma");
        System.out.println("2) Resta");
        System.out.println("3) Multiplicación");
        System.out.println("4) División");
        System.out.println("Ingrese la operación");
    }
    //Los parámetros pueden ser por: referencia y valor
    public static int suma(int n1, int n2){
        int resu = n1 + n2;
        return resu;
    }
}
