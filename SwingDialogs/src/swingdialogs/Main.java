package swingdialogs;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    static JFrame f;
    static JColorChooser jcc;
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        
        f = new JFrame();
        f.setSize(300, 300);
        f.setLayout(new FlowLayout());
        
        jcc = new JColorChooser();
        
        JDialog dialog = JColorChooser.createDialog(null, "Choose color", true, jcc, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = jcc.getColor();
                f.getContentPane().setBackground(c);
           }
        }, null);
        dialog.setVisible(true);
        
        f.setVisible(true);
       
        
        
        
        
        
        
    }

}
