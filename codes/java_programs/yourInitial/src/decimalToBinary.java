import java.util.ArrayList;
import java.util.Scanner;

/*Given a decimal number. Write a program to convert it into equivalent binary number.

Input:
First line of input contains a single integer T which denotes the number of test cases. 
First line of each test case contains a single integer N which represents a decimal value.

Output:
For each test case, print the binary equivalent of the given decimal value N.

Constraints:
1<=T<=100
1<=N<=100

Example:
Input:
3
7
10
33
Output:
111
1010
100001*/

public class decimalToBinary {

	public static void main(String[] args) 
	{
		int T=0;
		Scanner num = new Scanner(System.in);
		T=num.nextInt();
		if((T>100) || (T < 0))
		{
			System.exit(0);
		}


		// take the number of testCases
		int testCases[] = new int[T];
		for(int i=0;i<T;i++)
		{
			testCases[i]=num.nextInt();
			if(testCases[i] > 100 || testCases[i] < 0)
			{
				System.exit(0);
			}
		}
		
		for(int i=0;i<T;i++)
		{
			ArrayList<Integer>bin = new ArrayList<Integer>();
			do
			{
				bin.add(testCases[i]%2);
				testCases[i]=testCases[i]/2;
			}while(testCases[i] != 0);
			
			//Put the Logic here to print an Array List in Reverse Order
			for(int j = bin.size()-1;j>=0;--j)
			{
				System.out.print(bin.get(j));
			}
			System.out.println();
			
		}
		
	}

}
