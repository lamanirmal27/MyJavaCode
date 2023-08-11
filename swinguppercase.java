import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swinguppercase extends JFrame implements ActionListener{
   JLabel l1, l2;
   JTextField t1, t2;
   JButton b;
    public swinguppercase(){
        l1 = new JLabel("string1");
        l2 = new JLabel("string 2");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("UP");
        setLayout(new FlowLayout());
        add(l1); add(t1);
        add(l2); add(t2);
        b.addActionListener(this);
        add(b);
        setSize(400, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1 = t1.getText();
        String s2 = t2.getText();
        System.out.println(s1.toUpperCase() + " " + s2.toUpperCase());
    }
    public static void main(String[] args) {
        new swinguppercase();
    }
    
}
