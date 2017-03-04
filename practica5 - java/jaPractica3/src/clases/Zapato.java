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
public class Zapato {

    private String codigo;
    private String marca;
    private double talla;
    private String color;
    private String material;
    private double precio;
    private double existencia;
    
    /**
     * Constructor vacío, no recibe parámetros cuando se crea una instancia
     */
    public Zapato(){
        
    }
    
    /**
     * Constructor que recibe parámetros, es necesario enviarlos cuando se crea una instancia
     * del objeto.
     * @param codigo
     * @param marca
     * @param talla
     * @param color
     * @param precio
     * @param existencia 
     */
    public Zapato(String codigo, String marca, double talla, String color, double precio, double existencia){
        this.codigo = codigo;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    /**
     * Constructor sobrecargado, recibe 3 parámetros
     * @param codigo
     * @param marca
     * @param precio 
     */
    public Zapato(String codigo, String marca, double precio){
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
    }
    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the talla
     */
    public double getTalla() {
        return talla;
    }

    /**
     * @param talla the talla to set
     */
    public void setTalla(double talla) {
        this.talla = talla;
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
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the existencia
     */
    public double getExistencia() {
        return existencia;
    }

    /**
     * @param existencia the existencia to set
     */
    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

}
