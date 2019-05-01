
/*
 * Author: Ed Taylor
 * Date:   04/28/2019
 * 
 * GUI Primer
 * 
 * This code is a JPanel 
 * with a basic shape and graphics image
 * 
 * The background color can be set when this class
 * is instantiated
 * 
 */

import java.awt.*;
import javax.swing.*;

public class CustomPanel extends JPanel
{
   // fields
   private Image tree = new ImageIcon("tree.gif").getImage();
  
   // constructors
   public CustomPanel(Color c) {
      super.setBackground(c);
   }
   
   // methods
   public void paint(Graphics g) {
   
      super.paintComponent(g);
      
      int width = getWidth(); // get width of panel
      int height = getHeight(); // get height of panel
    
      double xRatio = width/800.0;
      double yRatio = height/600.0;
      
      // cast the graphics object to a 
      // Graphics2D object to take advantage of the
      // Graphics2D methods and stuff
      Graphics2D g2 = (Graphics2D)g;
      g2.scale(xRatio,yRatio);
    
      // draw basic shape on the panel
      g2.setColor(Color.RED);
      g2.fillRect(200, 150, 400,300);
  
      //draw image on the panel
      g2.drawImage(tree, 200, 150, this);
      
      
   }

}
