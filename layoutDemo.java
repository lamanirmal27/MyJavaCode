import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class layoutDemo extends JFrame implements ActionListener 
{
    JButton rb, gb;
    public layoutDemo()
    {
        rb = new JButton("Red");
        gb = new JButton("Green");

        rb.addActionListener(this);
        gb.addActionListener(this);
        setLayout(new BorderLayout());
        add(rb, BorderLayout.SOUTH);
        add(gb, BorderLayout.NORTH);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == rb)
            this.getContentPane().setBackground(Color.red);
        else if(e.getSource() == gb)
            this.getContentPane().setBackground(Color.green);
    }
    public static void main(String[] args) {
        new layoutDemo();
    }
}
