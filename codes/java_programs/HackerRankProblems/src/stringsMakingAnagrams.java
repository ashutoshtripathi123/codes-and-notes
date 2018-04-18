import java.util.Scanner;


/*
 Alice is taking a cryptography class and finding anagrams to be very useful. 
 We consider two strings to be anagrams of each other if the first string's letters
  can be rearranged to form the second string. In other words, both strings must contain
  the same exact letters in the same exact frequency
  For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

Alice decides on an encryption scheme involving two large strings where encryption is 
dependent on the minimum number of character deletions required to make the two strings anagrams. 
Can you help her find this number?

Given two strings, and , that may or may not be of the same length, determine the minimum number
 of character deletions required to make and anagrams. Any characters can be deleted from 
 either of the strings.

Input Format

The first line contains a single string, .
The second line contains a single string, .

Constraints

It is guaranteed that and consist of lowercase English alphabetic letters (i.e., through ).

Output Format

Print a single integer denoting the number of characters you must delete to make the two 
strings anagrams of each other.

Sample Input

cde
abc

Sample Output

4

 * */
public class stringsMakingAnagrams {

	static int length1;
	static int length2;
	
	public static void lastIndexOfUCL(StringBuilder str) {        
	    for(int i=str.length()-1; i>=0; i--) {
	        if(Character.isUpperCase(str.charAt(i))) {
	        	System.exit(-1);
	        }
	    }
	}
	
	/*Take each character of s1, and parse through s2*/
	public static void parseString(StringBuilder s1, StringBuilder s2)
	{
		int count=0;
		boolean matchFlag=false;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					matchFlag=true;
					s2.setCharAt(j, '1');
					break;
				}
			}
			if(matchFlag)
			{
				++count;
				matchFlag=false;
			}
			
		}
		
		System.out.println(length1+length2-(2*count));
	}
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		StringBuilder first = new StringBuilder(input.nextLine());
		StringBuilder second = new StringBuilder(input.nextLine());

		length1 = first.length();
		length2 = second.length();
		
		lastIndexOfUCL(first);
		lastIndexOfUCL(second);
		/*this is needed as an improvement in algo, why take each alphabet of longer
		 * string, and parse the shorter to check for match, instead, take each alphabet of
		 * shorter string and check for its presence in longer
		 * */
		if(length1>=length2)
		{
			parseString(second, first);
		}
		else
		{
			parseString(first, second);
		}
		input.close();
	}
}
