import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swing_ex2 extends JFrame implements ActionListener{
    JButton b;
    public swing_ex2()
    {
        super("WOW, IT'S BEAUTIFUL");      
        b = new JButton("SUBMIT");

        b.addActionListener(this);
        setLayout(new BorderLayout());
        add(b, BorderLayout.SOUTH);

        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        this.getContentPane().setBackground(Color.red);
    }
    public static void main(String[] args) {
        new swing_ex2();
    }
    
}
