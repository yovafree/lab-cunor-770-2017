/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japractica3;

import clases.Persona;
import java.util.Scanner;

/**
 *
 * @author Yova
 */
public class Arrays {
    static Persona[] arrPersonas;
    
    public static void main(String[] args){
        arrPersonas = new Persona[10];
        Scanner sc = new Scanner(System.in);
        for (int x=0;x<arrPersonas.length;x++){
            arrPersonas[x] = new Persona();
            
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.next();
            arrPersonas[x].setNombre(nombre);
            System.out.println("Ingrese el sexo: ");
            String sexo = sc.next();
            arrPersonas[x].setSexo(sexo);
            System.out.println("Ingrese el edad: ");
            double edad = sc.nextDouble();
            arrPersonas[x].setEdad(edad);
        }
        
        for (int x=0;x<arrPersonas.length;x++){
            System.out.println("Nombre: " + arrPersonas[x].getNombre());
        }
        
    }
}
