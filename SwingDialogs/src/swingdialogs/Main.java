package swingdialogs;

import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

public class Main {

    public static void main(String[] args) {

        JFileChooser fileChoser = new JFileChooser();
        
        
        fileChoser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory())
                {
                    return true;
                }
                String fn = f.getName();
                String e = "";
                
                int i = fn.lastIndexOf(".");
                if(i>0 && i < fn.length() -1)
                {
                    e = fn.substring(i + 1).toLowerCase();
                    
                }
                return e.equals("png");
                }

            @Override
            public String getDescription() {
                return "png images";
            }
        });
        
        
        
        
        int response = fileChoser.showOpenDialog(null);
        
       switch(response)
       {
           case JFileChooser.CANCEL_OPTION:
               break;
           default:
               JOptionPane.showMessageDialog(null, fileChoser.getSelectedFile().getPath());
               break;
               
       }
    }

}
