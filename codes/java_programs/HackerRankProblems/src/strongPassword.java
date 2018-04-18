import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class strongPassword {

    static int minimumNumber(int strLen, String password) {
        // Return the minimum number of characters to make the password strong
    	final String numbers = "0123456789";
    	final String lower_case = "abcdefghijklmnopqrstuvwxyz";
    	final String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	final String special_characters = "!@#$%^&*()-+";
    	int vote[]={0,0,0,0};
    	int result=0;
    	for(int i=0;i<strLen;i++)
    	{
    		char c = password.charAt(i);
    		if(numbers.indexOf(Character.toString(c))>=0)
    		{
    			vote[0]=1;
    			continue;
    		}
    		else if(lower_case.indexOf(Character.toString(c))>=0)
    		{
    			vote[1]=1;
    			continue;
    		}
    		else if(upper_case.indexOf(Character.toString(c))>=0)
    		{
    			vote[2]=1;
    			continue;
    		}
    		else if(special_characters.indexOf(Character.toString(c))>=0)
    		{
    			vote[3]=1;
    			continue;
    		}    		
    		
    	}
    	
    	/*now check the string length, and number of votes missed, that should be returned*/
    	int i=0;
    	int res=0;
    	while(i<vote.length)
    	{
    		if(vote[i]==0)
    		{
    			++res;
    		}
    		++i;
    	}
    	
    	if(strLen < 6)
    	{
    		result =  (6-strLen);
    	}
    	
    	if(result>res)
    		return result;
    	else
    		return res;
    	
    	//return result;
    	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int strLen = in.nextInt();
        String password = in.next();
        int answer = minimumNumber(strLen, password);
        System.out.println(answer);
        in.close();
    }
}
