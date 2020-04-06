package jtabblle;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        String[] columns = {"id", "Name","Password"};
        Object[][] rows = {
            {1, "Peter", 123},
            {2, "Sally", 234},
            {3, "Ross", 234}  
            
        };
        MyRenderer renderer = new MyRenderer();
        
        JTable jTable = new JTable(rows, columns);
        jTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        jTable.setColumnSelectionAllowed(true);
        jTable.getColumnModel().getColumn(1).setCellRenderer(new MyRenderer());
        jTable.getColumnModel().getColumn(1).setCellEditor(new MyEditor());
       /* jTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(e.getValueIsAdjusting())
                {
                    ListSelectionModel lsm = (ListSelectionModel)e.getSource();
                    System.out.println(jTable.getModel().getValueAt(lsm.getMinSelectionIndex(), 1)); 
                           
                }
            }
        });*/
        
        
        JScrollPane jScrollPane = new JScrollPane(jTable);
        jScrollPane.setPreferredSize(new Dimension(400, 300));
        frame.add(jScrollPane);
       
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setSize(600, 400);
        frame.setVisible(true);
        
        
    }

}
