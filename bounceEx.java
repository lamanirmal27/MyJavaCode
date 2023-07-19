import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class bounceEx extends JFrame implements ActionListener{
    JLabel n;
    JTextField tf;
    JButton ok;
    public bounceEx(){
        n = new JLabel("Name: ");
        tf = new JTextField(20);
        ok = new JButton("OK");
        ok.addActionListener(this);
        setLayout(null);
        n.setBounds(20, 20, 100, 20);
        tf.setBounds(110, 20, 120, 20);
        ok.setBounds(20, 110, 120, 20);
        add(n); add(tf); add(ok);
        setSize(1000, 800);
        setVisible(true); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name = tf.getText();
        JOptionPane.showMessageDialog(this, "Hello! " +name);
    }
    public static void main(String[] args) {
        new bounceEx();
    }
}
