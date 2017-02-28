/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import funciones.Cuadrado;
import funciones.Manzana;
import java.util.Scanner;

/**
 *
 * @author Yova
 */
public class Principal {
    
    public static void main(String[] args){
//        Manzana manzana1 = new Manzana("redonda","dulce", "rojo", 12, 0.4, "californiana");
//        Manzana manzana2 = new Manzana();
//        System.out.println("manzana1");
//        System.out.println(manzana1.getColor());
//        System.out.println(manzana1.getEspecie());
//        System.out.println(manzana1.getForma());
//        System.out.println(manzana1.getPeso());
//        System.out.println(manzana1.getSabor());
//        System.out.println(manzana1.getTamanio());
//        
//        System.out.println("manzana2");
//        
//        System.out.println(manzana2.getColor());
//        System.out.println(manzana2.getEspecie());
//        System.out.println(manzana2.getForma());
//        System.out.println(manzana2.getPeso());
//        System.out.println(manzana2.getSabor());
//        System.out.println(manzana2.getTamanio());
//        
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo de un cuadrado");
        
        System.out.println("Ingrese la altura en metros");
        double base = sc.nextDouble();
       
        System.out.println("Ingrese la base en metros");
        double altura = sc.nextDouble();
        
        Cuadrado cuadrado1 = new Cuadrado();
        
        cuadrado1.setAltura(altura);
        cuadrado1.setBase(base);
        
        System.out.println("El perímetro sería: " + cuadrado1.perimetro() + " mtrs.");
        System.out.println("El área sería: " + cuadrado1.area() + "mtrs2");
    }
}
