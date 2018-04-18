import java.util.Scanner;
public class scannerExample 
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		int age;
		String height;
		double weight;
		
		System.out.print("Age ?") ;
		age = keyboard.nextInt();
		System.out.print("Height ?");
		height = keyboard.next();
		System.out.print("Weight ?");
		weight = keyboard.nextDouble();
		System.out.println("Age = "+age+", Height = "+height+" and Weight = "+weight);
		System.out.println("Punch in something, maybe an integer");
		keyboard.nextInt();
	}
}
