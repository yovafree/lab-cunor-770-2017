/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japractica3;

/**
 *
 * @author Yova
 */

/**
 * Tarea 2) Hacer la matriz transpuesta de la matriz identidad.
 * @author Yova
 */
public class Matrix {
    
    public static void main(String[] args){
        int[][] matriz1 = new int[10][10];
        
        for (int x = 0; x<10;x++){
            for (int y = 0;y<10;y++){
                if (x == y)
                {
                    matriz1[x][y] = 1;
                }else{
                    matriz1[x][y] = 0;
                }
                
            }
        }
        
         for (int x = 0; x<10;x++){
            for (int y = 0;y<10;y++){
                System.out.print("" + matriz1[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
}
