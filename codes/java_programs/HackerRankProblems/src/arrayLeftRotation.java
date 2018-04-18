import java.util.ArrayList;
import java.util.Scanner;


/*A left rotation operation on an array of size shifts each of the array's elements unit to the left. 
 * For example, if left rotations are performed on array , then the array would become .

Given an array of integers and a number, , perform left rotations on the array. 
Then print the updated array as a single line of space-separated integers.

Input Format

The first line contains two space-separated integers denoting the respective values of
 (the number of integers) and (the number of left rotations you must perform).
The second line contains space-separated integers describing the respective 
elements of the array's initial state.

Constraints

Output Format

Print a single line of space-separated integers denoting the final state of the array after 
performing left rotations.

Sample Input

5 4
1 2 3 4 5

Sample Output

5 1 2 3 4
*/
public class arrayLeftRotation 
{

	public static void stringParse(String source, ArrayList<Integer> output)
	{
		for(String str:source.split(" "))
		{
			output.add(Integer.parseInt(str));
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String one, two;
		ArrayList <Integer>arr1 = new ArrayList<Integer>();//this will at max have 2 elements
		ArrayList <Integer>arr2 = new ArrayList<Integer>();//this can have many elements
		one = input.nextLine(); //gives number of elements in ArrayList and the number of rotations needed
		two = input.nextLine(); //stores the array

		stringParse(one, arr1);
		stringParse(two,arr2);
		int numberOfRotations = arr1.get(1);
		for(;numberOfRotations>0;--numberOfRotations)
		{
			int temp = arr2.get(0);
			arr2.remove(0);
			arr2.add(temp);
		}
		
		for(int temp=0;temp<arr2.size();++temp)
		{ 
			System.out.print(arr2.get(temp) + " ");
		}
	}

}
