package javaawt;

import java.awt.Frame;
import java.awt.Label;

public class MyWindow extends Frame {

    public MyWindow(String title)
    {
        this.setTitle(title);
        this.add(new Label("this is component"));
                
    }
    
    
    
    
    
    
}
