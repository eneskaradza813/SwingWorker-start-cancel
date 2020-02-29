package mythread;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyThread extends Thread {

    public boolean decrement;
    
    private boolean active;
    
    public MyThread(boolean decrement)
    {
       this.decrement = decrement;
       this.active = true;
    }
    public void stopThread()
    {
        this.active = false;
    }
    @Override
    public void run() {
       int i = -1;
        
        if(this.decrement)
        {
            i = 10;
        }
        while(active)
        {
            if(this.decrement)
            {
                if(i < 1)
                {
                    break;
                }
                i--;
            }
            else
            {
                if(i > 8)
                {
                    break;
                }
                i++;
            }
            System.out.println(i);
           try {
               Thread.sleep(500);
           } catch (InterruptedException ex) {
               Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
           }
        }
    }

    
}
