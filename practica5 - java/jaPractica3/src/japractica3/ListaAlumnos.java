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

/**
 * Tarea 1: Crear un arreglo de números y 
 * generar otro arreglo con la inversa de ese arreglo.
 * @author Yova
 */
public class ListaAlumnos {
    
    static String[] alumnos;
    public static void main(String[] args){
        alumnos = new String[10];
        Scanner sc = new Scanner(System.in);
        
        for (int x = 1; x<alumnos.length-1;x++){
            alumnos[x] = sc.nextLine();
        }
        
        for (int x = 1; x<alumnos.length;x++){
             System.out.println("Alumno> " + alumnos[x]);
        }
    }
}
