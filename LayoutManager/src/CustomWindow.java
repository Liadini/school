/*
 * Author: Ed Taylor
 * Date:   04/28/2019
 * 
 * GUI Primer
 * 
 * An example of how to manage a common look-and-feel for a program's 
 * branding guidelines.
 * 
 * If you change your look-and-feel for windows, you only need to change
 * this class 
 */

import java.awt.*;
import javax.swing.*;

public class CustomWindow extends JFrame
{
   public CustomWindow(String name) 
   {
      // establish window set-up defaults according to your
      // program's branding guidelines
      //
      super.setTitle(name);
      super.setBounds(300, 300, 800, 600); // set the default window size
      //...
      // other window properties can be set here
      //
      super.getContentPane().setBackground(Color.WHITE); // set background color to white
      super.setResizable(true); // the window can be resized
      super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // this happens with window is closed
      super.setVisible(true);
   }

}
