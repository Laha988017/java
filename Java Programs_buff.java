import java.io.*;
import java.util.*;
class buff
{
public static void main(String args[])
{
String s2, s1=""; int c, i,j;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter string to work on"); 	
	s2 = sc.nextLine();
	StringBuffer s = new StringBuffer(s2);
	while(true)
	{
	System.out.println("Choose:\n0.EXIT\n1.capacity()\n2.append()\n3.delete\n4.deleteCharAt()");
	c = sc.nextInt();
	switch(c)
	{
	case 0:
	System.exit(0);
	break;
	case 1:
	int q = s.capacity();
        System.out.println("Capacity of string is:" + q);
    	break;
	case 2:
	System.out.println("Write something to append");
	sc.nextLine();
	s1 = sc.nextLine();
	s.append(s1);
	System.out.println("New String is: "+s);
	break;
	case 3:
	System.out.println("Write start and end position of what you want to delete"); 
        i = sc.nextInt();
	j = sc.nextInt();
        s.delete(i,j);
        System.out.println("New String is: "+s); 
 	break;
	case 4:
	System.out.println("Write position of what you want to delete"); 
        i = sc.nextInt();
        s.deleteCharAt(i);
        System.out.println("New String is: "+s); 
	break;
	}
}
}

}
