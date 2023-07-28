import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_ex5 extends JFrame implements ActionListener{
    JButton b;
    public swing_ex5()
    {      
        b = new JButton("CLOSE");

        b.addActionListener(this);
        setLayout(new BorderLayout());
        add(b, BorderLayout.SOUTH);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        dispose();
    }
    public static void main(String[] args) {
        new swing_ex5();
    }
}
