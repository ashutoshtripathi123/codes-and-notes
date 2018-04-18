import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*First, create a file in Notepad containing three integers separated by some whitespace. 
 * Save it as "nums.txt" in the same folder as your code.*/
public class sumThreeNumsFromFile {
	public static void main(String [] args) throws IOException
	{
		File file = new File("nums.txt");
		FileReader fr = new FileReader(file);
		char[]a=new char [50];
		fr.read(a);
		int sum=0;
		for(char ch : a)
		{
			//System.out.print(ch);
			if(ch != ' ' && ch != '\0')
				sum = sum + Integer.parseInt(Character.toString(ch));
			
		}
		System.out.println(sum);
		fr.close();
	}

}
