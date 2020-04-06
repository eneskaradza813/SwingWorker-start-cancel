package jtree;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeModelListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeCellRenderer;

public class Main {

    public static void main(String[] args) {

        
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        
        
        
        
        
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Food");
        DefaultMutableTreeNode fruit = new DefaultMutableTreeNode("Fruit");
        fruit.add(new DefaultMutableTreeNode("Aplle"));
        fruit.add(new DefaultMutableTreeNode("Peach"));
        fruit.add(new DefaultMutableTreeNode("Grape"));
        
        DefaultMutableTreeNode vegetables = new  DefaultMutableTreeNode("Vegetebles");
        vegetables.add(new DefaultMutableTreeNode("Carrot"));
        vegetables.add(new DefaultMutableTreeNode("Onion"));
        vegetables.add(new DefaultMutableTreeNode("Potato"));
        
        DefaultMutableTreeNode meat = new DefaultMutableTreeNode("Meat");
        meat.add(new DefaultMutableTreeNode("Pork"));
        meat.add(new DefaultMutableTreeNode("Turkey"));
        meat.add(new DefaultMutableTreeNode("Chicken"));
        
        root.add(fruit);
        root.add(vegetables);
        root.add(meat);
        
        
        
        JTree jtree = new JTree(root);
        JScrollPane sp = new JScrollPane(jtree);
        sp.setPreferredSize(new Dimension(200, 200));
        frame.add(sp);
        jtree.addTreeSelectionListener(new TreeSelectionListener() {
            @Override
            public void valueChanged(TreeSelectionEvent e) {
                DefaultMutableTreeNode tn = (DefaultMutableTreeNode)((JTree)e.getSource()).getLastSelectedPathComponent();
                if(tn.isLeaf())
                    System.out.println(e.getPath());
            }
        });
        
        jtree.setCellRenderer(new TreeCellRenderer() {
            @Override
            public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded, boolean leaf, int row, boolean hasFocus) {
                JLabel l = new JLabel("My" + value.toString());
                return l;
            }
        });
        
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }

}
