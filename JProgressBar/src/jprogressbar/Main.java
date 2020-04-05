package jprogressbar;

import java.awt.FlowLayout;
import java.util.Hashtable;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.SwingWorker;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {

    public static void main(String[] args) {

        
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        JSlider jsl = new JSlider(0, 1000, 1000);
        frame.add(jsl);
        jsl.setMajorTickSpacing(100);
        jsl.setMinorTickSpacing(25);
        jsl.setPaintTicks(true);
        jsl.setPaintLabels(true);
        Hashtable<Integer, JLabel> labels = new Hashtable<Integer, JLabel>();
        labels.put(0, new JLabel("Start"));
        labels.put(500, new JLabel("Middle"));
        labels.put(1000, new JLabel("End"));
        jsl.setLabelTable(labels);
        jsl.setPaintLabels(true);
        
        
        jsl.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.println(((JSlider)e.getSource()).getValue());
            }
        });
        
        jsl.setOrientation(JSlider.VERTICAL);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 400);
        frame.setVisible(true);
        
        
    }

}
