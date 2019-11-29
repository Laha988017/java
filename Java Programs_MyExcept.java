import java.util.Scanner;
// A Class that represents use-defined expception
class MyException extends Exception
{
	public MyException(String s)
	{
		// Call constructor of parent Exception
		super(s);
	}
}

// A Class that uses above MyException
public class MyExcept
{
	// Driver Program
	public static void main(String args[])
	{	int age;
		Scanner sc=new Scanner(System.in);
		try
		{
			age=sc.nextInt();
			if(age<18)
			// Throw an object of user defined exception
				throw new MyException("Not Eligible to Vote");
			else
				System.out.println("Eligible to Vote");
		}
		catch (MyException ex)
		{
			//System.out.println("Caught");

			// Print the message from MyException object
			System.out.println(ex.getMessage());
		}
	}
}

