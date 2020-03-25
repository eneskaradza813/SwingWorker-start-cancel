package swingdialogs;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

       int answer = JOptionPane.showOptionDialog(null, "Do you agree", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        switch(answer)
        {
            case JOptionPane.NO_OPTION :
                JOptionPane.showMessageDialog(null, "You don't agree");
                break;
            case JOptionPane.YES_NO_OPTION :
                JOptionPane.showMessageDialog(null, "You agree");
                break;
            case -1:
                JOptionPane.showMessageDialog(null, "You closed the window");
                break;
        }
        
    }

}
