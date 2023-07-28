import javax.swing.*;

public class swing_ex3 extends JFrame {
    JButton b;
    public swing_ex3()
    {
        super("PROGRAMMING TECHNOLOGY");
        b = new JButton("BE");
        add(b);

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new swing_ex3();
    }
}
