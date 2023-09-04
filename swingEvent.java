import javax.swing.*;
import java.awt.event.*;

public class swingEvent extends JFrame	implements MouseListener {
	public JLabel label;
	
	public swingEvent()
	{
		setSize(400, 400);
		setTitle("JAVA SWING- JFRAME detetcts mouse events");
		label = new JLabel("No mouse event captured", JLabel.CENTER);
		add(label);
		addMouseListener(this);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void mousePressed(MouseEvent e) {
		label.setText("Mouse Pressed");
	}
	public void mouseEntered(MouseEvent e) {
		label.setText("Mouse Entered");
	}
	public void mouseClicked(MouseEvent e) {
		label.setText("Mouse Clicked");
	}
	public void mouseExited(MouseEvent e) {
		label.setText("Mouse exited");
	}
	public void mouseReleased(MouseEvent e) {
		label.setText("Mouse released");
		
	}
    public static void main(String[] args)
	{
		new swingEvent();
	}
}
