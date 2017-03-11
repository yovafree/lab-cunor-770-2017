/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.util.Scanner;

/**
 *
 * @author Yova
 */
public class Principal2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        menu1();
    }
    
    public static void menu1(){
        int opt = 0;
        
        System.out.println("\n\n\n\n\n\n");
        do{
            System.out.println("Menú 1");
            System.out.println("1) Opción 1");
            System.out.println("2) Opción 2");
            System.out.println("3) Opción 3");
            System.out.println("4) Salir");
            opt = sc.nextInt();
            if (opt ==1){
                menu2();
            }
        }while(opt != 4);
    }
    
    public static void menu2(){
        int opt = 0;
        System.out.println("\n\n\n\n\n\n");
        do{
            System.out.println("Menú 2");
            System.out.println("1) Opción 1");
            System.out.println("2) Opción 2");
            System.out.println("3) Salir");
            opt = sc.nextInt();
        }while(opt != 3);
    }
}
