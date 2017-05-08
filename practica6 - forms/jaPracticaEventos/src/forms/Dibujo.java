/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Yova
 * 
 * Extendemos del objeto canvas
 */
public final class Dibujo extends Canvas{
    int tam = 20;
    int totFil = 17;
    int totCol = 10;
    int[][] mat;
    // Redimensionamos el objeto
    public Dibujo(){
        this.setSize (350, 350);
        mat = new int[totCol][totFil];
        iniMatriz();
    }
    
    
    public void iniMatriz(){
        for(int x = 0; x<totCol;x++){
            for(int y = 0; y<totFil;y++){
                mat[x][y] = 0;
            }
        }
    }
    
    // Pintamos en nuestro canvas o lienzo
    @Override
    public void paint(Graphics g){
        Color c;
        int posX = 0;
        int posY = 0;
        int cambio = 0;
        for(int y = 0; y<totFil;y++){
            for(int x = 0; x<totCol;x++){
                if (cambio == 0){
                    cambio = 1;
                    g.setColor(Color.RED);
                    g.fillRect((tam*x), (tam*y), tam, tam);
                    g.setColor(Color.BLACK);
                    g.drawString("" + mat[posX][posY], (tam*x)+3, (tam*y)+tam-3);
                }else{
                    cambio = 0;
                    g.setColor(Color.BLACK);
                    g.fillRect((tam*x), (tam*y), tam, tam);
                    g.setColor(Color.RED);
                    g.drawString("" + mat[posX][posY], (tam*x)+3, (tam*y)+tam-3);
                }
            }
            if (cambio == 0){
                cambio = 1;
            }else{
                cambio = 0;
            }
        }
        
    }
}
