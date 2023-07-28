import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_ex1 extends JFrame implements ActionListener{
    JLabel l1, l2;
    JTextField t1, t2;
    JButton b;
    public swing_ex1()
    {
        l1 = new JLabel("Username");
        l2 = new JLabel("Password:");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b = new JButton("Login");
        setLayout(new FlowLayout());
        add(l1); add(t1);
        add(l2); add(t2);
        b.addActionListener(this);
        add(b);
        setSize(400, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name = t1.getText();
        String pass = t2.getText();
        if(name.equals("Admin") && pass.equals("PTF@112022"))
        {
            JOptionPane.showMessageDialog(this, "Login Sucsess");
        }
        else
            JOptionPane.showMessageDialog(this, "Login Failed");
    }
    public static void main(String[] args) {
        new swing_ex1();
    }
}