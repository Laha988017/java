public class Employee{
    
    int emp_id;String name;int salary;String desig;
    Employee(String n){
	    name=n;
        emp_id=101;
        salary=30000;
        desig="fresher";
    }
    Employee(String n,int s,String d){
        name=n;
        emp_id=102;
        salary=s;
        desig=d;
    }
    Employee(){
        name="surya";
        emp_id=103;
        salary=25000;
        desig="temporary-member";
    }
    public static void main(String args[]){
        int max,i;
        String n="";
        Employee[] a=new Employee[3];
        a[0]=new Employee("Surya");
        a[1]=new Employee("Surya",40000,"executive");
        a[2]=new Employee();
        System.out.println("id: "+a[0].emp_id +" "+"name: "+a[0].name+" "+"salary: "+a[0].salary+" "+"designation: "+a[0].desig);
        System.out.println("id: "+a[1].emp_id +" "+"name: "+a[1].name+" "+"salary: "+a[1].salary+" "+"designation: "+a[1].desig);
        System.out.println("id: "+a[2].emp_id +" "+"name: "+a[2].name+" "+"salary: "+a[2].salary+" "+"designation: "+a[2].desig);
        max=a[0].salary;
        for(i=0;i<3;i++){
            if(a[i].salary>max){
                max=a[i].salary;
                n=a[i].name;}

            }
        System.out.println("max salary: "+max+"name: "+n);
    }
}
