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

//Determinar si un número es primo, debe de utilizar una función :D
public class ciclos {
    public static void main(String[] args){
        //Ciclo For - Para
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        
        for(int n=0;n<=h;n=n+2){
            System.out.println("El valor es: " + n);
        }
    }
}
