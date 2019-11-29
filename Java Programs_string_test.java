import java.io.*;
import java.util.*;
public class string_test{
	public static void main(String[] args) throws IOException{
		String str1,str2;
		Integer n=10;
		char[] char_str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 1st string:");
		str1=sc.nextLine();
		System.out.println("Enter 2nd string:");
		str2=sc.nextLine();
		System.out.println("The character at index 3 of 1st string:" + str1.charAt(3));
		System.out.println("Comparing strings using compareTo()" + str1.compareTo(str2));
		System.out.println("Using equals():" + str1.equals(str2));
		System.out.println("Using equalsIgnorecase()" + str1.equalsIgnoreCase(str2));
		System.out.println("Index of character 'a' in 2nd string:" + str2.indexOf('a'));
		System.out.println("Length of 2nd string:" + str2.length());
		System.out.println("Printing a substring from 2nd string:" + str2.substring(1,4));
		char_str= str1.toCharArray();
		System.out.println("Using toString():" + n.toString());
		System.out.println("Printing 1st string in all lowercase:" + str1.toLowerCase());
		System.out.println("Printing 2nd string in all uppercase:" + str2.toUpperCase());
		System.out.println("Using trim() function on 1st string:" + str1.trim());
		System.out.println("Using valueOf() function:" + Integer.valueOf(n));
		System.out.println("Converting first string to character array:");
		for(int i=0;i<str1.length();i++)
			System.out.print(char_str[i]);

	}
}
