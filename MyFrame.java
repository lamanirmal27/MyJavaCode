//Java swing example that performs sqare of the input number
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyFrame extends JFrame implements ActionListener {
    JLabel l, l1;
    JTextField num, sqrt;
    JButton ok, clear;

    public MyFrame() {
        l = new JLabel("Number: ");
        l1 = new JLabel("Square: ");
        num = new JTextField(20);
        sqrt = new JTextField(20);
        ok = new JButton("OK");
        clear = new JButton("Refresh");

        setLayout(new FlowLayout());
        add(l);
        add(num);
        add(l1);
        add(sqrt);

        ok.addActionListener(this);
        clear.addActionListener(this);

        add(ok);
        add(clear);

        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ok) {
            String n = num.getText();
            int ni = Integer.parseInt(n);
            int sq = ni * ni;
            sqrt.setText("" + sq);
        } else if (e.getSource() == clear) {
            num.setText("");
            sqrt.setText("");
        }
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
