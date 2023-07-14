//Java swing example that performs sqare of the input number
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class calculator extends JFrame implements ActionListener {
    JLabel l, l1,l3;
    JTextField num1, num2, result;
    JButton plus, minus , mul, clear;

    public calculator() {
        l = new JLabel("Num: ");
        l1 = new JLabel("Num1: ");
        l3 = new JLabel("Result: ");
        num1 = new JTextField(20);
        num2 = new JTextField(20);
        result = new JTextField(20);
        plus = new JButton("+");
        minus = new JButton("-");
        mul = new JButton("*");
        clear = new JButton("Refresh");

        setLayout(new FlowLayout());
        add(l);
        add(num1);
        add(l1);
        add(num2);
        add(l3);
        add(result);

        plus.addActionListener(this);
        minus.addActionListener(this);
        mul.addActionListener(this);
        clear.addActionListener(this);

        add(plus);
        add(minus);
        add(mul);
        add(clear);

        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == plus) {
            String n = num1.getText();
            String n1 = num2.getText();
            int ni = Integer.parseInt(n);
            int ni1 = Integer.parseInt(n1);
            int pl = ni + ni1;
            result.setText("" + pl);
        } 
        else if(e.getSource() == minus)
        {
         String n = num1.getText();
            String n1 = num2.getText();
            int ni = Integer.parseInt(n);
            int ni1 = Integer.parseInt(n1);
            int mn = ni - ni1;
            result.setText("" + mn);   
        }
        else if(e.getSource() == mul)
        {
         String n = num1.getText();
            String n1 = num2.getText();
            int ni = Integer.parseInt(n);
            int ni1 = Integer.parseInt(n1);
            int ml = ni * ni1;
            result.setText("" + ml);   
        }
        
        else if (e.getSource() == clear) {
            num1.setText("");
            num2.setText("");
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new calculator();
    }
}
