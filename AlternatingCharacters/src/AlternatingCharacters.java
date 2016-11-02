import java.io.*;
import java.util.*;
import java.lang.*;
public class AlternatingCharacters 
{
	
	public static void main(String[] args)
	{
	Scanner reader = new Scanner(System.in);  
	System.out.println("Enter a number: ");
	int T = reader.nextInt(); 

	for(int i=0; i<T; i++)
	{
	int counter =0;
	Scanner reader1 = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String word = (String) reader1.nextLine();
	int length = word.length();
	//System.out.println(length);
	int j=1;
	while(j<length)
	{
	if (word.charAt(j-1)==word.charAt(j)) counter++;
	j++;
	}
	
	System.out.println(counter);
	}
	}
	
	
}
	

	
