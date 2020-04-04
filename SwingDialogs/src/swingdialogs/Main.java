package swingdialogs;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        String a = JOptionPane.showInputDialog("First operand");
        String b = JOptionPane.showInputDialog("Second operand");
        
        JOptionPane.showMessageDialog(null, a + "+" + b + "= " + (Integer.parseInt(a) + Integer.parseInt(b)));
            
        
        
        
        
    }

}
