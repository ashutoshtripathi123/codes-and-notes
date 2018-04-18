import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/*We're going to make our own Contacts application! The application must perform two types of operations:

    add name, where is a string denoting a contact name. This must store as a new contact in the application.
    find partial, where is a string denoting a partial name to search the application for. 
    It must count the number of contacts starting with and print the count on a new line.

Given sequential add and find operations, perform each operation in order.

Input Format

The first line contains a single integer, , denoting the number of operations to perform.
Each line of the subsequent lines contains an operation in one of the two forms defined above.

Constraints

    It is guaranteed that and contain lowercase English letters only.
    The input doesn't have any duplicate for the operation.

Output Format

For each find partial operation, print the number of contact names starting with on a new line.

Sample Input

4
add hack
add hackerrank
find hac
find hak

Sample Output

2
0

Explanation

We perform the following sequence of operations:

    Add a contact named hack.
    Add a contact named hackerrank.
    Find and print the number of contact names beginning with hac. 
    There are currently two contact names in the application and both of them start with hac, 
    so we print on a new line.
    Find and print the number of contact names beginning with hak. 
    There are currently two contact names in the application but neither of them start with hak, 
    so we print on a new line.
*/
/*PS: This is a brute force technique, and I am not using the tries data structure
 * which they are actually expecting in the solution. Because of this, during submission
 * I am getting an error "Terminated due to timeout" 
 * This problem should be solved again, using tries data structure*/
public class triesContact
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<String>ip = new ArrayList<String>();
		int numOfLines = input.nextInt();
		String str;
		int wordCount=0;
		for(int i=0;i<numOfLines*2;i++)
		{
			str = input.next();
			ip.add(str);

		}
		
		for(int i=0;i<ip.size();i++)
		{
			if(ip.get(i).equals("add"))
			{
				++i;
				continue;//nothing to do, infact skip by 2, as next string would be an addition to List
			}
			
			if(ip.get(i).equals("find"))
			{
				//now comes the funny part, increment the pointer by one, and find it in the List
				++i;
				String temp = ip.get(i);
				for(int j=1;j<ip.size() && j<i;j=j+2)
				{
					if(ip.get(j).contains(temp))
					{
						++wordCount;
					}
				}
				
				System.out.println(wordCount);
				wordCount=0;
			}
		}
	}

}
