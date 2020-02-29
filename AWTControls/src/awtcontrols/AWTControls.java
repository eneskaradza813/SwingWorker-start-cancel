package awtcontrols;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AWTControls {

    public static void main(String[] args) throws InterruptedException {

        Frame frame = new Frame();
        frame.setLayout(new FlowLayout());
        
        CheckboxGroup checkboxGroup = new CheckboxGroup();
        
        Checkbox checkbox = new Checkbox("My check", checkboxGroup, true);
        Checkbox checkbox1 = new Checkbox("My check1", checkboxGroup, false);
        Checkbox checkbox2 = new Checkbox("My check2", checkboxGroup, false);
        
       /* checkbox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Checkbox checkbox = (Checkbox)e.getSource();
                if(checkbox.getState())
                {
                    checkbox.setLabel("clicked");
                    
                }else{
                    checkbox.setLabel("unchecked");
                }
                
            }
        });*/
        
        
        frame.add(checkbox);
        frame.add(checkbox1);
        frame.add(checkbox2);
        
        
        frame.setSize(500, 400);
        frame.setVisible(true);
        
                
     

       
       
      
       
     
        
       
    }

}
