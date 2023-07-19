import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class componentDemo extends JFrame implements ActionListener
{
    JLabel nl, gl, tl, cl;
    JTextField nt;
    JRadioButton mr, fr;
    JComboBox<String> tc;
    JCheckBox jc, oc, cc;
    JButton jb;
    JTextArea jt;
    public componentDemo()
    {
        nl = new JLabel("Name: ");
        gl = new JLabel("Gender: ");
        tl = new JLabel("Time: ");
        cl =new JLabel("Course: ");
        nt = new JTextField(20);
        mr = new JRadioButton("Male");
        fr = new JRadioButton("Female");
        String[] course = {"Morning", "Day"};
        tc = new JComboBox<>(course);
        jc = new JCheckBox("Java");
        oc = new JCheckBox("Oracle");
        cc = new JCheckBox("C++");
        ButtonGroup bg = new ButtonGroup();
        bg.add(mr); bg.add(fr);
        jb = new JButton("OK");
        jb.addActionListener(this);
        jt = new JTextArea(10, 30);
        add(nl); add(nt); add(gl); add(mr);
        add(fr); add(tl); add(tc); add(cl);
        add(jc); add(oc); add(cc); add(jb);
        add(jt); setLayout(new FlowLayout());
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e)
    {
        String name = nt.getText();
        String gender = "Female";
        if(mr.isSelected())
            gender = "Male";
        String course = "";
        if(jc.isSelected())
            course += "Java";
        if(oc.isSelected())
            course += "Oracle";
        if(cc.isSelected())
            course += "C++";
        String time = (String) tc.getSelectedItem();
        jt.append("Name:" +name);
        jt.append("\nGender: "+gender);
        jt.append("\nCourse: "+course);
        jt.append("\nTime: "+time);
    }
    public static void main(String[] args) {
        new componentDemo();
    }
}
