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
public class principal {
    static int num1=2, num2=3, num3=4, num4=6, num5=8;
    
    // Tipos de datos
    // int Enteros
    // char caracteres solo acepta 1 caracter
    // String para cadenas de texto
    // Boolean para verdaderos y falsos
    // Double para punto flotante
    // float para punto flotante doble precisión
    
    // Programa mayor de 3 números
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        num1= 14;
        num2= 25;
        num3= 26;
        
        //Operadores de comparación
        // >, <, >=, <=, ==, ===
        
        if (num1>num2){
            if (num1>num3){
                System.out.println("El mayor es: " + num1);
            }else{
                System.out.println("El mayor es: " + num3);
            }
        }else{
            if(num2>num3){
                System.out.println("El mayor es: " + num2);
            }else{
                System.out.println("El mayor es: " + num3);
            }
            
        }
        
        /*float resu = num1 / num2;
        System.out.println("La división es: " + resu);
        */
    }
    
}
