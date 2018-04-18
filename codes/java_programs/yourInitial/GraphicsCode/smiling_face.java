import java.awt.*;
import javax.swing.JFrame;

public class smiling_face extends Canvas
{
	public void paint(Graphics g)
	{
		// labels
		g.setColor(Color.black);
		g.setFont(new Font(null));
		for ( int X=0; X<800; X += 50 )
		    g.drawString( String.valueOf(X), X, 50 );
		for ( int Y=100; Y<600; Y += 50 )
		    g.drawString( String.valueOf(Y), 28, Y );
		// lines
		g.setColor(Color.lightGray);
		for ( int X=0; X<800; X += 50 )
		    g.drawLine(X,0,X,599);    // horizontal
		for ( int Y=0; Y<600; Y += 50 )
		    g.drawLine(0,Y,799,Y);    // vertical		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame win = new JFrame("Smiling Face");
		win.setSize(800, 600);
		win.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
		smiling_face canvas = new smiling_face();
		win.add(canvas);
		win.setVisible(true);
	}

}
