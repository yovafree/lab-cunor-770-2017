/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japractica3;

import java.util.Scanner;

/**
 *
 * @author Yova
 */
public class JaPractica3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Ingrese la cantidad de espacios del arreglo: ");
        int tot = sc.nextInt();
        int[] arrEnteros = new int[tot];       
        
        for (int x=0;x<arrEnteros.length;x++){
            System.out.print("Ingrese el valor en posición " + x + ": ");
            arrEnteros[x] = sc.nextInt();
        }
        
        
        for (int x=0;x<arrEnteros.length;x++){
            suma = suma + arrEnteros[x];
        }
        
        System.out.println("El promedio es: " + (suma/arrEnteros.length));
    }
    
}
