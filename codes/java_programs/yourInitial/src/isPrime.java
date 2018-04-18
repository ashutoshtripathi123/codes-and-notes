import java.util.Scanner;


public class isPrime {
	
	public static void main(String[] args)
	{
		System.out.println("Give a number:");
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		if(input == 2)
		{
			System.out.println("Prime");
			System.exit(0);
		}
		boolean result = checkIsPrime(input);
		
		if(result == false)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
	}

	public static boolean checkIsPrime( int n )
	{
		int num=2;
		for(;num<n-1;num++)
		{
			if(n%num==0)
			{
				return false;
			}
		}
		return true;
	}
}
