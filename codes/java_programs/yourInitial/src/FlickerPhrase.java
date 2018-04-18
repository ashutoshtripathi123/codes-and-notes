import java.util.Random;

public class FlickerPhrase
{
	public static void main( String[] args )
	{
		Random rng = new Random();
		int r;
		
		//for ( int i=0; i<100000; i++ )
		{
			r = 1 + rng.nextInt(5);
			// Write five if statements here.
			// If r is 1, then call the function named 'first'.
			// If r is 2, then call the function named 'second', and so on.
			

			// Optional: after the if statements are over, add in a slight delay.
		}

		first();
		second();
		third();
		fourth();
		fifth();
		
	}

	public static void first()
	{
		System.out.print("I                               \r");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void second()
	{
		System.out.print("  pledge                        \r");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void third()
	{
		System.out.print("         allegiance             \r");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fourth()
	{
		System.out.print("                    to the      \r");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void fifth()
	{
		System.out.print("                           flag.\r");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
