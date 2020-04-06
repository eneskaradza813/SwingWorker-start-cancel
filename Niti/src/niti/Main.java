package niti;

import java.awt.FlowLayout;
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

    static SwingWorker sw;
    public static void main(String[] args) throws InterruptedException, InvocationTargetException {

       Runnable myGUI = new Runnable() {
           @Override
           public void run() {
               JFrame f = new JFrame();
               f.setLayout(new FlowLayout());
               
               JButton button = new JButton("Start");
               JButton btnC = new JButton("Cancel");
               button.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       sw = new SwingWorker<String, String>() {
                           @Override
                           protected void done() {
                               try{
                                   if(!isCancelled())
                                       System.out.println(get());
                                   else
                                       System.out.println("canceled");
                               }
                               catch(InterruptedException exc){}
                               catch(ExecutionException exc){}
                                }
                           
                           @Override
                           protected String doInBackground() throws Exception {
                               int in = 0;
                               while(!isCancelled())
                               {
                                   Thread.sleep(1000);
                                   int i = 0;
                                   publish("not done yet, i am on" + i++);
                               }
                               return "I am done";
                                }

                           @Override
                           protected void process(List<String> chunks) {
                               System.out.println(chunks.get(0));
                                }
                           
                       };
                       sw.execute();
                        }
               });
               btnC.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       sw.cancel(true);
                        }
               });
               
               
               f.add(button);
               f.add(btnC);
               f.setSize(300, 300);
               f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               f.setVisible(true);
               
                }
       };
                
        SwingUtilities.invokeAndWait(myGUI);
    }

}
