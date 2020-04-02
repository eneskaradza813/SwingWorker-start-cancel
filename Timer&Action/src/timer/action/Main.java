package timer.action;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {

    static Integer elapsed = 0;
    
    public static void main(String[] args) {

       JFrame frame = new JFrame();
       frame.setLayout(new FlowLayout());
       
        Timer timer = new Timer(1000, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               frame.setTitle("Time elapsed: " + (elapsed++).toString() );
           }
       });
        timer.start();
       
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600, 400);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);
       
       
        
        
    }

}
