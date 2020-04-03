package drag.drop;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.DefaultListModel;
import javax.swing.DropMode;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        JTextField field1 = new JTextField(50);
        JTextField field2 = new JTextField(50);
        
        JList jList = new JList();
        
        DefaultListModel defaultListModel = new DefaultListModel();
        defaultListModel.addElement("Blackbery");
        defaultListModel.addElement("SAmsung");
        jList.setTransferHandler(new MyTransferHandler());
        jList.setDropMode(DropMode.INSERT);
        jList.setModel(defaultListModel);
        
        JScrollPane jScrollPane = new JScrollPane(jList);
        jScrollPane.setPreferredSize(new Dimension(100, 100));
        
        
        field1.setDragEnabled(true);
        field2.setDragEnabled(true);
        jList.setDragEnabled(true);
        
        
        frame.add(field1);
        frame.add(field2);
        frame.add(jScrollPane);
        
        
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        
    }

}
