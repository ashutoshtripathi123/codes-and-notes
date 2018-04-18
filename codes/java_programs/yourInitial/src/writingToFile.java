
import java.io.*;

public class writingToFile {

	public static void main(String[] args) throws IOException{
	{
		// TODO Auto-generated method stub
		File file = new File("Sample.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		fw.write("Sample file created and written into.....");
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(file);
		char [] a = new char[50];
		fr.read(a);
		for(char ch : a)
		{
			System.out.print(ch);
		}
		fr.close();
	}
	}
}
