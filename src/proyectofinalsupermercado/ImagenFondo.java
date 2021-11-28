package proyectofinalsupermercado;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenFondo extends JPanel {
    private Image imagen;
    ImageIcon imagenIcono;
    public ImagenFondo(String ruta) {
        imagenIcono = new ImageIcon(ruta);
    }
    
    public void paint(Graphics g) {
         
        imagen = imagenIcono.getImage();

        g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
        setOpaque(false);
        super.paint(g);
    }
}
