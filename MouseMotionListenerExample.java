import java.awt.*;  
import java.awt.event.*;

import javax.swing.JLabel;  
public class MouseMotionListenerExample extends Frame implements MouseMotionListener{ 
    JLabel label; 
    MouseMotionListenerExample(){  
        addMouseMotionListener(this);  
        label = new JLabel("Label, WTF!", JLabel.CENTER);
        add(label);
        setSize(500,700);   
        setVisible(true);
    }  
public void mouseDragged(MouseEvent e) {  
    label.setText("Mouse dragged"); 
}  
public void mouseMoved(MouseEvent e) {
    label.setText("Mouse moved");
}  
  
public static void main(String[] args) {  
    new MouseMotionListenerExample();  
}  
}  