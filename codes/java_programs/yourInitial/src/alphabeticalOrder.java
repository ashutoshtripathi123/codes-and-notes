import java.util.Scanner;
public class alphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lastName;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Last Name");
		lastName = keyboard.next();
		//int ret;
		if(lastName.compareTo("J")<=0)
		{
			if(lastName.compareTo("C")<=0)
			{
				System.out.println("No Wait");
			}
			else
				System.out.println("Little Wait");
		}
		else if(lastName.compareTo("S")<=0)
		{
			if(lastName.compareTo("P")<=0)
			{
				System.out.println("Little More Wait");
			}
			else
				System.out.println("Little More More Wait");			
		}
		else
			System.out.println("Long Wait");
	}

}
