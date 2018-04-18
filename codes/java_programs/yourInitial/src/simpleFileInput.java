import java.io.BufferedReader;
import java.io.FileReader;


public class simpleFileInput {

	public static void main(String args[]) throws Exception
	{
		FileReader fr = new FileReader("C:\\Users\\212429464.LOGON\\java_programs\\yourInitial\\names.txt");
		char ch[] = new char[100];
		fr.read(ch);
		fr.close();
		for(char a : ch)
		{
			System.out.print(a);
		}
	}
	
}
