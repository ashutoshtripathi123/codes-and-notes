import java.awt.Container;
import javax.swing.*;


public class Frame613 extends JFrame
{
	public Frame613()
	{
		setTitle("613 Rocks !");
		setSize(300,200);
		setLocation(100,200);
		
		Panel613 panel = new Panel613();
		Container cp = new Container();
		cp.add(panel);
	}
}
