/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasbasicasok;

import java.awt.Graphics;

/**
 *
 * @author Iván
 */
public class BasicasOK {
    public static void HacerCuadradoOK(Graphics g, int x1, int y1, int alto, int largo)
    {
        g.drawRect(x1, y1, alto, largo);
    }
    
    /* Define el area */
    public static area2() 
    {
        double largo,area;
       largo=teclado.nextInt();
       area=largo*largo;
    }
    
    /* Define el perimetro */
    public static perimetro2()
    {    
        double largo,perimetro;
       largo=teclado.nextInt();
       perimetro=largo*largo*largo*largo;
    }    

}
