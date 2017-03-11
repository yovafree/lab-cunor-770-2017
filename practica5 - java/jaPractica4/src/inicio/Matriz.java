/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

/**
 *
 * @author Yova
 */
public class Matriz {
    static int[][] mat;
    
    public static void main(String[] args){
        int tam = 12;
        
        mat = new int[tam][tam];
        
        llenar(tam);
        
        for (int x = 0; x<mat.length;x++){
            for (int y = 0;y<mat.length;y++){
                System.out.print("" + mat[x][y] + " ");
            }
            System.out.print("\n");
        }
    }
    
    public static void llenar(int tam){
        int cont = 0;
        int cont2 = 1;
        for (int x = 0;x<tam;x++){
            cont++;
            cont2 = cont+1;
            for (int y = tam-1;y>=0;y--){
                cont2--;
                if (cont2 > 0){
                    mat[x][y] = cont2;
                }else{
                    mat[x][y] = 0;  
                }
                
            }
        }
    }
}
