import java.util.Scanner;
import java.io.*;
class ioshow{
	public static void main(String args[])throws IOException{
		int num1;
		float num2;
		String str;
		Scanner sc=new Scanner(System.in);
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr); 
		System.out.println("\nUsing Scanner for Inputs");
		System.out.println("\nEnter an integer:");
		num1=sc.nextInt();
		sc.nextLine();
		System.out.println("\nEnter an float value:");
                num2=sc.nextFloat();
                sc.nextLine();
		System.out.println("\nEnter an String value:");
                str=sc.nextLine();
		System.out.println("Integer:"+num1+" Float:"+num2+" String:"+str);
		System.out.println("\nUsing BufferedReader for Inputs");
		str="";
		while(true){
			str+=br.readLine();
			if(str.endsWith("."))
				break;
		}
		System.out.println("Obtained string:"+str);
		System.out.println("\nReading and Writing on file");
		FileWriter fw=new FileWriter("Myfile.txt");
		FileReader fr=new FileReader("Myfile.txt");
		fw.write(str);
		fw.close();
		int i;
		while((i=fr.read())!=-1)
			System.out.print((char)i);
		fr.close();
	}
}
