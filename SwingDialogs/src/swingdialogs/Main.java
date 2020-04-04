package swingdialogs;

import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        int yourSide = JOptionPane.showOptionDialog(null, "Choose your ride", "option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new String[] {"Millenium falcon", "X-Wing","B-Wing", "y-Wing", "Imperial Battlecruiser"}, null);
        if(yourSide == -1)
        
            JOptionPane.showMessageDialog(null, "You haven't choosen any vehicle");
            else if(yourSide < 5)
                JOptionPane.showMessageDialog(null, "You have choosen bright side vehicle");
            else
                JOptionPane.showMessageDialog(null, "You have choosen dark side vehicle");
            
        
        
        
        
    }

}
