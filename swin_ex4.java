import javax.swing.*;
import java.awt.event.*;

public class swin_ex4 extends JFrame implements ActionListener{
    JButton b;
    public swin_ex4()
    {
        b = new JButton("Press");
        b.addActionListener(this);
        add(b);

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        JOptionPane.showMessageDialog(this, "Hello Java");
    }
    public static void main(String[] args) {
        new swin_ex4();
    }
}
