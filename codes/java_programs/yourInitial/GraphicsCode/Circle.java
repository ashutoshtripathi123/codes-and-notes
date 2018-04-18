
import java.awt.*;
import javax.swing.JFrame;

public class Circle extends Canvas 
{
	public void paint(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillArc(50, 50, 50, 50, 0, 360);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame win = new JFrame("Circle Draw");
		win.setSize(300,300);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle canvas = new Circle();
		win.add(canvas);
		win.setVisible(true);

	}

}
