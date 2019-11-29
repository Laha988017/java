import java.util.*;
class Student{
        private int roll_no,marks;
        private String name,dept;
        private static double avg;
        public static void calc_avg(Student[] ob,int n){
            int sum=0;
            for(int i=0;i< n;i++)
                sum+=ob[i].marks;
            avg= (double)sum/(double)n;
        }
        public void Input_details(Student[] ob,int n){
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<n;i++){
		ob[i]=new Student();
                System.out.println("\nEnter Student's Name:");
                ob[i].name=sc.nextLine();
                System.out.println("\nEnter Student's Roll No.:");
                ob[i].roll_no=sc.nextInt();
                sc.nextLine();
                System.out.println("\nEnter Student's Department:");
                ob[i].dept=sc.nextLine();
                System.out.println("\nEnter Student's Marks:");
                ob[i].marks=sc.nextInt();
                sc.nextLine();
            }
        }
        public void View_details(Student[] ob,int n){
            calc_avg(ob,n);
            Student max=ob[0],min=ob[0];
            for(int i=0;i<n;i++){
                if(ob[i].marks>max.marks)
                    max=ob[i];
                if(ob[i].marks<min.marks)
                    min=ob[i];
            }
            System.out.println("\nStudent with highest marks is:"+max.name);
            System.out.println("\nStudent with lowest marks is:"+min.name);
            System.out.println("\nStudent(s) with above average marks are:");
            for(int i=0;i<n;i++){
                if(ob[i].marks>avg)
                    System.out.println("\n"+ob[i].name); 
            }
        }
        public static void main(String[] args){
            int n=0;
            Scanner sc=new Scanner(System.in);
            System.out.println("\nEnter the number of students:");
            n=sc.nextInt();
            sc.nextLine();
            Student st[]=new Student[n];
            Student call_ob=new Student();
            call_ob.Input_details(st,n);
            call_ob.View_details(st,n);
        }
}

