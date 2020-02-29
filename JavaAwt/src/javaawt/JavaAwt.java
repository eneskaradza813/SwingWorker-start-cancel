package javaawt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JavaAwt {

    public static void main(String[] args) throws InterruptedException {

        
        MyWindow f = new MyWindow("This is container");
        f.setSize(300, 100);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
            
});
        
        for (int i = 0; i < 500; i++) {
            Thread.sleep(10);
             f.setLocation(i, i/2);
        }
        
        
       
        
        
        
        
        
        
        
    }

}
