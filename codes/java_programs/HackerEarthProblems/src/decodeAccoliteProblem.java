/*Decode

Given an encrypted message, Erwin encodes it the following way:

Removes the median letter of the word from the original word and appends it to the end of the encrypted word and repeats the process until there are no letters left.

A median letter in a word is the letter present in the middle of the word and if the word length is even, the median letter is the left one out of the two middle letters.

Given an encoded string, write a program to decode it.

Input Format:

The first line of input contains T, the number of test cases.
Each test case contains a String S, denoting the encoded word.

Output Format:

Print the decoded word for each test case in a separate line.

Constraints

1≤T≤100

1≤|S|≤100000

Sample Input

2

wrien

reen

Sample Output

erwin

eren

Explanation

In the first test case, Erwin encoded the String "erwin".
 At first, he wrote down the letter 'w' after which the string became "erin", he then wrote down 'r' 
 and the remaining string was "ein", he then wrote 'i' and the string became "en" and so on he wrote 
 down 'e' and 'n' to get the encoded string as "wrien".*/

import java.io.*;
import java.util.*;

public class decodeAccoliteProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testCases=input.nextInt();
		int i=0;
		
		StringBuilder str;
		StringBuilder output ;
		
		for(int t=0;t<testCases;t++)
		{
			str = new StringBuilder(input.next());
			output = new StringBuilder(str.length());
			int count=0;

			final int originalLength = str.length();

			/*Run the decode algo twice on input*/
			int length = str.length();
			int median=0;
			while(count < originalLength)
			{
				median = 0;
				if(length%2!=0)
				{
					median=length/2;
				}
				else
				{
					median = (length/2) - 1;
				}
				//System.out.println("Count = "+ count +" Median = "+median + " char at source = " +str.charAt(median) + " length = " + str.length());
				output.append(str.charAt(median));
				str.deleteCharAt(median);
				++count;
				length=str.length();
			}
			
			System.out.println(output);
			str = new StringBuilder(0);
			/*Repeat the above logic here again*/
			str = new StringBuilder(output.length());
			
			for(i=0;i<=output.length()-1;i++)
			{
				str.append(output.charAt(i));
			}
			
			output.setLength(0);
			output = new StringBuilder(originalLength);
			count=0;
			length = str.length();
			median=0;
			while(count < originalLength)
			{
				median = 0;
				if(length%2!=0)
				{
					median=length/2;
				}
				else
				{
					median = (length/2) - 1;
				}
				//System.out.println("Count = "+ count +" Median = "+median + " char at source = " +str.charAt(median) + " length = " + str.length());
				output.append(str.charAt(median));
				str.deleteCharAt(median);
				++count;
				length=str.length();
			}			
			
			System.out.println(output);
		}
		
		input.close();
	}

}
