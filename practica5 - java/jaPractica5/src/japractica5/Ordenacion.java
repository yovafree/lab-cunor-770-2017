/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package japractica5;

/**
 *
 * @author Yova
 */
public class Ordenacion {
    static int mat[];
    static Persona arrPersonas[];
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        mat = new int[10];
//        mat[0] = 45;
//        mat[1] = -1;
//        mat[2] = 99;
//        mat[3] = 3;
//        mat[4] = 35;
//        mat[5] = -1;
//        mat[6] = -8;
//        mat[7] = 5;
//        mat[8] = 100;
//        mat[9] = 99;
//        
//        imprimir();
//        
//        burbuja();
//        imprimir();
        inicializar();
//        impPersonas();
//        burbujaPersonas();
//        impPersonas();
        busqPersona("CaRLoS".toLowerCase());
    }
    
    public static void inicializar(){
        arrPersonas = new Persona[10];
        arrPersonas[0] = new Persona(3,"Andrea");
        arrPersonas[1] = new Persona(2,"Jesús");
        arrPersonas[2] = new Persona(4,"Marlon");
        arrPersonas[3] = new Persona(5,"Daniel");
        arrPersonas[4] = new Persona(1,"Carlos");
        arrPersonas[5] = new Persona(100,"Andrés");
        arrPersonas[6] = new Persona(75,"Joaquin");
        arrPersonas[7] = new Persona(43,"Gustavo");
        arrPersonas[8] = new Persona(33,"Juan");
        arrPersonas[9] = new Persona(38,"Pan");
    }
    
    public static void impPersonas(){
        for (Persona arrPersona : arrPersonas) {
            System.out.println(arrPersona.codigo + " " + arrPersona.nombre);
        }
    }
    
    public static void busqPersona(String nombre){
        int cont = 0;
        int indx = 0;
        for (Persona arrPersona : arrPersonas) {
            
            if (nombre.equals(arrPersona.nombre.toLowerCase())){
                indx = cont;
            }
            cont++;
        }
        System.out.println(arrPersonas[indx].codigo + " " + arrPersonas[indx].nombre);
    }
    
    public static void burbujaPersonas(){
        for (int x=1;x<arrPersonas.length;x++){
            for (int y=0;y<arrPersonas.length-1;y++){
                
                if (arrPersonas[y].codigo > arrPersonas[y+1].codigo){
                    Persona temp = arrPersonas[y];
                    arrPersonas[y] = arrPersonas[y+1];
                    arrPersonas[y+1] = temp;
                }
            }
        }
    }
    
    public static void burbuja(){
        Boolean bEscape = false;
        int intContador = 1;
        for (int x=1;x<mat.length;x++){
            bEscape = false;
            intContador++;
            for (int y=0;y<mat.length-1;y++){
                
                if (mat[y] < mat[y+1]){
                    int temp = mat[y];
                    mat[y] = mat[y+1];
                    mat[y+1] = temp;
                    bEscape = true;
                }
            }
            
            if (bEscape == false){
                x = mat.length+1;
            }
        }
        System.out.println("Se repitió " + intContador);
    }
    
    public static void imprimir(){
        for(int x=0;x<10;x++){
            System.out.println(mat[x]);
        }
    }
    
}
