/*
 * Author: Ed Taylor
 * Date:   04/28/2019
 * 
 * GUI Primer: Layout Managers.  
 * 
 * Objectives
 * - Create a Window
 * - Create components to add to a window
 * - Add and layout components using Layout manager
 * 
 * Project Class files needed to run properly:
 * -TheLayoutManagerProgram.java
 * -CustomWindow.java
 * -CustomPanel.java
 * 
 * This class is the main program
 * 
 * Check this tutorial out to learn more about how layout managers work
 * https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html#grid
 * 
 */
 
 
import java.awt.*;
import javax.swing.*;

public class TheLayoutManagerProgram
{
   public static void main(String[] args)
   {
       
      // create a window frame (according to the company's branding guidelines
      CustomWindow mainScreen = new CustomWindow ("Main Screen");
      
      // create components (widgets) to add to the window.  this can be panels, buttons, images, etc.
      // in this case a new panel     
      CustomPanel mainPanel1 = new CustomPanel(Color.WHITE); // create a panel to add to window
      CustomPanel mainPanel2 = new CustomPanel(Color.BLUE); // create a panel to add to window
      CustomPanel mainPanel3 = new CustomPanel(Color.YELLOW); // create a panel to add to window 
      CustomPanel mainPanel4 = new CustomPanel(Color.CYAN); // create a panel to add to window 
      JButton button1 = new JButton("button 1"); // create a button to add to a window
      
      
      // *****experiment 1: add the panels to the frame no layout
      Container windowContainer = mainScreen.getContentPane();// get the window's container
      windowContainer.add(mainPanel1); // add the panel to the window
      windowContainer.add(mainPanel2); // add the panel to the window
      windowContainer.add(mainPanel3); // add the panel to the window
      windowContainer.add(mainPanel4); // add the panel to the window
      
      // *****
      
//      // *****experiment 2: add the panels to the frame with grid layout
//      Container windowContainer = mainScreen.getContentPane();// get the window's container
//      GridLayout grid = new GridLayout(2,2);
//      windowContainer.setLayout(grid);
//      windowContainer.add(mainPanel1); // add the panel to the window
//      windowContainer.add(mainPanel2); // add the panel to the window
//      windowContainer.add(mainPanel3); // add the panel to the window
//      windowContainer.add(mainPanel4); // add the panel to the window
//      windowContainer.add(button1);// add the button to the window
//      // *****
      
//      // *****experiment 3: add the panels to the frame flow  layout
//      Container windowContainer = mainScreen.getContentPane();// get the window's container
//      FlowLayout flow = new FlowLayout();
//      windowContainer.setLayout(flow);
//      windowContainer.add(mainPanel1); // add the panel to the window
//      windowContainer.add(mainPanel2); // add the panel to the window
//      windowContainer.add(mainPanel3); // add the panel to the window
//      windowContainer.add(mainPanel4); // add the panel to the window
//      windowContainer.add(button1);// add the button to the window
//      // *****
      
//      // *****experiment 4: add the panels to the border layout
//      Container windowContainer = mainScreen.getContentPane();// get the window's container
//      BorderLayout border = new BorderLayout();
//      windowContainer.setLayout(border);
//      //mainPanel1.setPreferredSize(new Dimension(50,50));
//      windowContainer.add(mainPanel1, BorderLayout.SOUTH); // add the panel to the window
//      //mainPanel2.setPreferredSize(new Dimension(50,50));
//      windowContainer.add(mainPanel2, BorderLayout.EAST); // add the panel to the window
//      //mainPanel3.setPreferredSize(new Dimension(50,50));
//      windowContainer.add(mainPanel3, BorderLayout.CENTER); // add the panel to the window
//      //mainPanel4.setPreferredSize(new Dimension(50,50));
//      windowContainer.add(mainPanel4, BorderLayout.WEST); // add the panel to the window
//      //button1.setPreferredSize(new Dimension(50,50));
//      windowContainer.add(button1, BorderLayout.NORTH);// add the button to the window
//      // *****
      
      // make the window visible
      mainScreen.setVisible(true);
      // *****
   }

}
