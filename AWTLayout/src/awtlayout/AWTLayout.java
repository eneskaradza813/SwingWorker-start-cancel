package awtlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTLayout {

    public static void main(String[] args) {
         Frame f = new Frame();
        
       
        Panel headerPanel = new Panel(new FlowLayout());
        
        Button b1 = new Button("Page1");
        Button b2 = new Button("Page2");
        
        headerPanel.add(b1);
        headerPanel.add(b2);
        
        f.add(headerPanel, BorderLayout.PAGE_START);
        
        CardLayout layOut = new CardLayout();
        Panel mainPanel = new Panel(layOut);
        
        Panel panel1 = new Panel();
        Panel panel2 = new Panel();
        
        panel1.setBackground(Color.CYAN);
        panel2.setBackground(Color.ORANGE);
        
        mainPanel.add(panel1, "panel1");
        mainPanel.add(panel2, "panel2");
        
        b1.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 layOut.show(mainPanel, "panel1");
             }
         });
        b2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 layOut.show(mainPanel, "panel2");
             }
         });
        f.add(mainPanel, BorderLayout.CENTER);
        
        f.setSize(600, 400);
        f.setVisible(true);
        
        
    }

}
