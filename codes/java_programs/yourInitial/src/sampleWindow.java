import javax.swing.*;
public class sampleWindow extends JFrame
{
	public static void main(String [] args)
	{
		JFrame f = new sampleWindow();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		f.setTitle("Pop Up");
		f.setVisible(true);
		System.out.println("Done!!!");
	}
}
