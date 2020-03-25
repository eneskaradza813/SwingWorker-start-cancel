package swingdialogs;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

      JFrame frame = new JFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(new Dimension(600, 400));
      frame.setLocationRelativeTo(null);
      
      
       Color backroundColor =  JColorChooser.showDialog(null, "Chose color", Color.yellow);
        
       if(backroundColor != null)
       {
           frame.getContentPane().setBackground(backroundColor);
       }
       frame.setVisible(true);
       
    }

}
