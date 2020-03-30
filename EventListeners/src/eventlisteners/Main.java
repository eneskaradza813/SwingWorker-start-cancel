package eventlisteners;

import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.HierarchyBoundsAdapter;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Main {

  
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JFrame frame1 = new JFrame();
        JLabel size = new JLabel();
        frame.add(size);
        JLabel location = new JLabel();
        frame.add(location);
        JLabel mousePosition = new JLabel();
        frame.add(mousePosition);
        JButton button = new JButton("Send to other form");
        frame.add(button);
        
        
        button.addHierarchyListener(new HierarchyListener() {
            @Override
            public void hierarchyChanged(HierarchyEvent e) {
                System.out.println("Container changed");
           }
        });
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.remove(button);
                frame.repaint();
                frame1.add(button);
           }
        });
        
        button.addHierarchyBoundsListener(new HierarchyBoundsListener() {
            @Override
            public void ancestorMoved(HierarchyEvent e) {
                System.out.println("ancesorMoved");
            }

            @Override
            public void ancestorResized(HierarchyEvent e) {
                System.out.println("ancestorResized");
            }
        });
        
        frame.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
              Component component = e.getComponent();
              size.setText("Width: " + component.getWidth() + " Height: " + component.getHeight());
              
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                Component component = e.getComponent();
                location.setText("X; " + component.getLocationOnScreen().x + "Y: " + component.getLocationOnScreen().y);
                        
           }

            @Override
            public void componentShown(ComponentEvent e) {
                JOptionPane.showMessageDialog(null, "Window is shown");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                JOptionPane.showMessageDialog(null, "Window is hidden");
            }
        });
        
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
               // System.out.println(e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
           }
        });
        
        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
           }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse left control");
            }
        });
        frame.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                mousePosition.setText("Mouse x: " + e.getXOnScreen() + "Mouse y: " + e.getYOnScreen());
            }
        });
        frame.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                if(e.getWheelRotation() > 0)
                {
                    frame.setLocation(frame.getLocation().x, frame.getLocation().y+5);
                    
                }else
                {
                    frame.setLocation(frame.getLocation().x, frame.getLocation().y-5);
                }
            }
        });
        
        
        frame1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setSize(600, 400);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        
        
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
                
       
    }

}
