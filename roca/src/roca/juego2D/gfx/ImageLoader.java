/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roca.juego2D.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author JuanManuel
 */
public class ImageLoader {
    
    public static BufferedImage loadImage(String path){
        try {
            return ImageIO.read(ImageLoader.class.getResource(path));
        } catch (IOException ex) {
            Logger.getLogger(ImageLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }   
    
    
}
