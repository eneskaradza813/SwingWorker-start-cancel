package look.feel;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.metal.OceanTheme;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        

        JFrame frame = new JFrame();
        
        JButton button1 = new JButton("Cross-platform - default");
        frame.add(button1);
        button1.setActionCommand("cross - def");
        
        JButton button4 = new JButton("Cross-platform - ocean");
        frame.add(button4);
        button1.setActionCommand("cross - ocean");
        
        JButton button2 = new JButton("System");
        button2.setActionCommand("system");
        frame.add(button2);
        
        
        JButton button3 = new JButton("Motif");
        button3.setActionCommand("motif");
        frame.add(button3);
        
        
        
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(e.getActionCommand().equals("cross - def"))
                    {
                        MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
                        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    }
                    if(e.getActionCommand().equals("cross - ocean"))
                    {
                        MetalLookAndFeel.setCurrentTheme(new OceanTheme());
                        UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                    }
                    if(e.getActionCommand().equals("system"))
                    {
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    }
                    if(e.getActionCommand().equals("motif"))
                    {
                        UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                    }
                }
                catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException exc){
                    System.out.println(exc.toString());
                }
                SwingUtilities.updateComponentTreeUI(frame);
           }
        };
        button1.addActionListener(actionListener);
        button2.addActionListener(actionListener);
        button3.addActionListener(actionListener);
        button4.addActionListener(actionListener);
        
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
    }

}
