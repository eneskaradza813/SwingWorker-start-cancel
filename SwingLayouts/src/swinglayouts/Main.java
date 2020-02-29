package swinglayouts;

import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.setLayout(layout);
        
        
        JButton button1 = new JButton("Button1");
        JButton button2 = new JButton("Button2");
        JButton button3 = new JButton("Button3");
        JButton button4 = new JButton("Button4");
        
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(button1).addComponent(button2).addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(button3).addComponent(button4)));
        layout.setVerticalGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(button1).addComponent(button2).addComponent(button3)).addComponent(button4));
        
        
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
        
    }

}
