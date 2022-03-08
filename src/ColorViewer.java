

import javax.swing.*;




/**
 * Program Description 
 * @author Program Author
 * @version 01.06.2021
*/ 
public class ColorViewer
{


   private static final int FRAME_WIDTH = 300;
   private static final int FRAME_HEIGHT = 400;

   public static void main(String[] args)
   {
      JFrame frame = new ColorFrame();

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.setVisible(true);
   }
   
}

