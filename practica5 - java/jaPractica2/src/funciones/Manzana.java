/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author Yova
 */
public class Manzana {
    //Métodos de acceso
    // Public, private, protected, static
    String forma;
    private String color;
    private String sabor;
    private double tamanio;
    private double peso;
    private String especie;
    
    public Manzana(){
        this.forma ="rectangulo";
        this.color = "verde";
        this.sabor = "acido";
        this.tamanio = 12;
        this.peso = 0.3;
        this.especie = "washington";
    }
    
    public Manzana(String forma, String sabor, String color, double tamanio, double peso, String especie){
        this.forma = forma;
        this.sabor = sabor;
        this.color = color;
        this.tamanio = tamanio;
        this.peso = peso;
        this.especie = especie;
    }
    
    /**
     * Cambia el valor de la variable forma
     * @param forma 
     */
    public void setForma(String forma){
        this.forma = forma;
    }
    
    /**
     * Obtiene el valor de la variable forma
     * @return 
     */
    public String getForma(){
        return this.forma;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the sabor
     */
    public String getSabor() {
        return sabor;
    }

    /**
     * @param sabor the sabor to set
     */
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    /**
     * @return the tamanio
     */
    public double getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the especie
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * @param especie the especie to set
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
}
