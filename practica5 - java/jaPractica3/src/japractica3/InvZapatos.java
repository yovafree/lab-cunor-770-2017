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
    
    /**
     * Método main, inicializa la ejecución del programa
     * @param args 
     */
    public static void main(String[] args){
        int op = 1;
        contador = 0;
        
        //Creamos una nueva instancia del objeto, una array de 100 posiciones de tipo zapato.
        zapatos = new Zapato[100];
        
        //Llenamos el inventario inicial
        LlenarInvInicial();
        
        //Mostramos el menú de opciones
        do{
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("1) Ingresar al inventario");
            System.out.println("2) Leer inventario");
            System.out.println("3) Buscar un zapato, por código");
            System.out.println("0) Salir");
            op = sc.nextInt();
            
            //Permite decidir a que opción ir. 
            if (op == 1){
                //Se hace una llamada al método Agregar Zapato
                AgregarZapato();
            }else if(op == 2){
                //Se hace una llamada al método Leer Inventario.
                LeerInventario();
            }
        }while(op > 0);
    }
    
    /**
     * Método Leer Inventario, imprime en pantalla todo el inventario
     * hasta dónde se ha llenado el array de zapatos. 
     * Utiliza la variable contador como límite de los registros ingresados al array.
     */
    public static void LeerInventario(){
        for (int x=1; x<contador; x++){
            System.out.print("COD: " +zapatos[x].getCodigo());
            System.out.print(" Marca: " +zapatos[x].getMarca());
            System.out.print(" Color: " +zapatos[x].getColor());
            System.out.print(" Precio: " +zapatos[x].getPrecio());
            System.out.println(" Existencia: " +zapatos[x].getExistencia());
        }
        String pausa = sc.next();
    }
    
    /**
     * Método que permite agregar un registro al inventario de zapatos.
     */
    public static void AgregarZapato(){
        
//        zapatos[contador].setCodigo(""+contador);
        
        System.out.println("Ingrese la marca:");
        String marca = sc.next();
//        zapatos[contador].setMarca(marca);
        
        System.out.println("Ingrese el color:");
        String color = sc.next();
//        zapatos[contador].setColor(color);
        
        System.out.println("Ingrese la talla:");
        double talla = sc.nextDouble();
//        zapatos[contador].setTalla(talla);
        
        System.out.println("Ingrese el precio:");
        double precio = sc.nextDouble();
//        zapatos[contador].setPrecio(precio);
        
        System.out.println("Ingrese la cantidad de existencia:");
        double exs = sc.nextDouble();
        
        //Se instancia un objeto utilizando uno de los constructores
        //se envían los parámetros para crear el objeto.
        zapatos[contador] = new Zapato(""+contador, marca, talla, color, precio, exs);
//        zapatos[contador].setExistencia(exs);
        
        contador++;
    }
    
    /**
     * Se llena el inventario inicialmente, se utiliza el constructor sobrecargado para crear los objetos.
     */
    public static void LlenarInvInicial(){
        // Se utiliza la forma de suma abreviada ++ con el contador.
        zapatos[contador] = new Zapato(""+(contador++), "Adidas", 35.2, "Negro", 450.00, 250);
        zapatos[contador] = new Zapato(""+(contador++), "Puma", 25.2, "Blancos", 650.00, 30);
        zapatos[contador] = new Zapato(""+(contador++), "Nike", 40, "Negro con rojo", 850.00, 25);
        zapatos[contador] = new Zapato(""+(contador++), "Puma", 41, "Blanco", 950.00, 30);
        zapatos[contador] = new Zapato(""+(contador++), "Diadora", 48, "Verde aqua", 750.00, 30);
        zapatos[contador] = new Zapato(""+(contador++), "Reebok", 37.5, "Gris", 550.00, 75);
    }
}
