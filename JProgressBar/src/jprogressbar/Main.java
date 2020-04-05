package jprogressbar;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;

public class Main {

    public static void main(String[] args) {

        
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        JProgressBar jbp = new JProgressBar();
        frame.add(jbp);
        
        SwingWorker sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                while(jbp.getValue()<jbp.getMaximum())
                {
                    int currValue = jbp.getValue();
                    jbp.setValue(currValue + 1);
                    jbp.setString("I am far from the end");
                    jbp.setValue(currValue + 1);
                    if(currValue>jbp.getMaximum()/3)
                        jbp.setString("I am closer now...");
                    if(currValue>(jbp.getMaximum()/3)*2)
                        jbp.setString("Just about finish...");
                    Thread.sleep(100);
                    
                }
                JOptionPane.showMessageDialog(jbp, "Job done");
                return null;
            }
        };
        sw.execute();
        jbp.setBorderPainted(false);
        jbp.setStringPainted(true);
        jbp.setIndeterminate(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 400);
        frame.setVisible(true);
        
        
    }

}
