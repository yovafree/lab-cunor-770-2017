/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japractica3;
import clases.Zapato;
import java.util.Scanner;
/**
 *
 * @author Yova
 */
public class InvZapatos {
    static Zapato[] zapatos;
    static int contador;
    static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args){
        int op = 1;
        contador = 0;
        
        zapatos = new Zapato[5];
        
        do{
            System.out.println("1) Ingresar al inventario");
            System.out.println("2) Leer inventario");
            System.out.println("0) Salir");
            op = sc.nextInt();
            
            if (op == 1){
                AgregarZapato();
            }
        }while(op > 0);
    }
    
    public static void AgregarZapato(){
        zapatos[contador] = new Zapato();
        System.out.println("Ingrese la marca:");
        String marca = sc.next();
        zapatos[contador].setMarca(marca);
        
        System.out.println("Ingrese el color:");
        String color = sc.next();
        zapatos[contador].setColor(color);
        
        contador++;
    }
}
