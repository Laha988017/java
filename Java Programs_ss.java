import java.util.*;
class ss
{
public static void main(String args[])
{
String s, s1=""; char c1; int c, i, j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string and we shall see magic!!");

	s = sc.nextLine();
while(true)
{
	System.out.println("Select which API method you want to see illustrated\n0. EXIT\n1.charAt()\n2.compareTo()\n3.equals()\n4.equalsIgnoreCase()\n5.indexOf\n6.length()\n7.substring()\n8.toCharArray()\n9.toLowerCase()\n10.toString()\n11.toUpperCase()\n12.trim()\n13.valueOf()");
	c = sc.nextInt();
	
	switch(c)
	{
	case 1:
	System.out.println("charAt() it is! Ok, choose a position of which you want the character for (strings start from 0!)");
	i = sc.nextInt();
	System.out.println("The character at position "+i+" in the string "+s+" is "+s.charAt(i));
	break;
	case 2:
	System.out.println("compareTo() it is! Ok, type in another string so we can do the comparing with '" +s+"' ");
	s1 = sc.nextLine();
	System.out.println("The result is "+s.compareTo(s1)+" ");
	break;
	case 3:
	System.out.println("equals() it is! Ok, enter another string to check the condition with '"+s+"'");
	s1 = sc.nextLine();
	System.out.println("The result is "+s.equals(s1)+" ");
	break;
	case 4:
	System.out.println("equalsIgnoreCase() it is! Ok, enter another string without worrying about case to check the condition with '"+s+"'");
        s1 = sc.nextLine();
        System.out.println("The result is "+s.equalsIgnoreCase(s1)+" ");
        break;
	case 5:
	System.out.println("indexOf() it is! Ok, enter a character to find index of in '"+s+"'");
        c1 = (sc.next().charAt(0));
        System.out.println("The result is "+s.indexOf(c1)+" ");
        break;
	case 6:
	System.out.println("length() it is! Ok, the length of '"+s+"' is "+s1.length());
        break;
	case 7:
	System.out.println("substring() it is! Ok, enter the positions(start and end)  in '"+s+"' from where you want a substring");
        i = sc.nextInt();
	j = sc.nextInt();
        System.out.println("The result is "+s.substring(i,j)+" ");
	break;
	case 8:
	System.out.println("toCharArray() it is! Well... we can't show that it's actually converted to a char array so... just believe us ok?");
	break;
	case 9:
	System.out.println("toLowerCase() it is! Well, lower case of '"+s+"' is "+s.toLowerCase());
	break;
	case 10:
	System.out.println("Believe me when I say that I converted something to string- but there isn't a way to prove it to you, the user");
	break;
	case 11:
	System.out.println("toUpperCase() it is! Well, upper case of '"+s+"' is "+s.toUpperCase());
        break;
	case 12:
	s1 = s.trim();
	System.out.println("Trimmed string is (no way you, the user could figure out, but still) "+s.trim()+" and its length is "+s1.length());
	break;
	case 13:
	System.out.println("I converted a char array into string using valueOf and this is it, please believe me :"+s);
	break;
	case 0:
	System.exit(0);
	break;
	default:
	System.out.println("wrong.");
	}

}
}
}
