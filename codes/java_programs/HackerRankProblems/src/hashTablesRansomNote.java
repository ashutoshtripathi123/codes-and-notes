/*A kidnapper wrote a ransom note but is worried it will be traced back to him. 
 * He found a magazine and wants to know if he can cut out whole words from it and use 
 * them to create an untraceable replica of his ransom note. 
 * The words in his note are case-sensitive and he must use whole words available in the magazine, 
 * meaning he cannot use substrings or concatenation to create the words he needs.

Given the words in the magazine and the words in the ransom note, print Yes if he can
 replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

Input Format

The first line contains two space-separated integers describing the respective values of 
(the number of words in the magazine) and (the number of words in the ransom note).
The second line contains space-separated strings denoting the words present in the magazine.
The third line contains space-separated strings denoting the words present in the ransom note.

Constraints

    .
    Each word consists of English alphabetic letters (i.e., to and to ).
    The words in the note and magazine are case-sensitive.

Output Format

Print Yes if he can use the magazine to create an untraceable replica of his ransom note; 
otherwise, print No.

Sample Input 0

6 4
give me one grand today night
give one grand today

Sample Output 0

Yes

Sample Input 1

6 5
two times three is not four
two times two is four

Sample Output 1

No

*/
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class hashTablesRansomNote {

	static int magWordsNums, noteWordsNums;
	static Hashtable<Integer, String>mag;
	static String magazine, note;
	
	public static void stringParse(String source)
	{
		ArrayList<Integer>inputOne = new ArrayList<Integer>();
		
		for(String str: source.split(" ") )
		{
			inputOne.add(Integer.parseInt(str));
		}
		
		magWordsNums = inputOne.get(0);
		noteWordsNums = inputOne.get(1);
	}
	
	public static void addToHash()
	{
		int key=0;
		for(String str: magazine.split(" "))
		{
			mag.put(key, str);
			++key;
		}
	}
	
	public static void searchHash()
	{
		int count=0;
		Set<Integer>key = mag.keySet();
		
		for(String str: note.split(" "))
		{
			if(mag.containsValue(str))
			{
				// add the logic of popping the string from mag hash here, it would be
				// helpful in case of collision strings found
				//Please note, given a value, you cannot retrieve the key value directly
				// like how we retrieve the value if we have the key
				++count; 
				//mag.replace(, "REPLACE");
				for(Integer k:key)
				{
					if(str.equals(mag.get(k)))
					{
						mag.remove(k);
						break; //this break is needed here so that you don't end up removing
							   //all the duplicate entries from hash if the str matches the string in hash 
					}
				}
				
				
			}
			else
			{
				count = 0; //No need to go ahead, as this string itself not found
				break;
			}
		}

		if(count==noteWordsNums)
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String one = input.nextLine();
		magazine = input.nextLine();
		note = input.nextLine();
		mag = new Hashtable<Integer, String>();
		stringParse(one);
		input.close();
		addToHash();
		searchHash();
	}
}
