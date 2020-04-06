package niti;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import static javafx.scene.input.KeyCode.T;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;

public class Main {

    public static void main(String[] args) throws InterruptedException, InvocationTargetException {

        Runnable myGUI = new Runnable() {
            @Override
            public void run() {
                JFrame f = new JFrame();
                JButton button = new JButton("click");
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SwingWorker sw = new SwingWorker<String, String>() {
                            @Override
                            protected void done() {
                                try{
                                    System.out.println(get());
                                }
                                catch(InterruptedException ex){}
                                catch(ExecutionException ex){}
                                }
                            
                            @Override
                            protected String doInBackground() throws Exception {
                                int i = 0;
                                while(true)
                                {
                                    Thread.sleep(1000);
                                    publish("not done yet, i am on" + i++);
                                }
                                 }

                            @Override
                            protected void process(List<String> chunks) {
                                System.out.println(chunks.get(0));
                                 }
                            
                        };
                        sw.execute();
                         }
                });
                        
                        
                        
                        
                        
                f.add(button);
                f.setSize(300, 300);
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 }
        };
        SwingUtilities.invokeAndWait(myGUI);
        
    }

}
