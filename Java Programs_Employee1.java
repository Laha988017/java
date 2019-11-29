public class Employee{

    int emp_id;
    float salary;
    String name;
    String desig;
    public static int emp_count; 
    Employee(String n){
	emp_count++;
	name=n;
        emp_id=emp_count;
        salary=30000;
        desig="fresher";
    }
    Employee(String n,float s,String d){
	emp_count++;
        name=n;
        emp_id=emp_count;
        salary=s;
        desig=d;
    }
    Employee(){
	emp_count++;
        name="XYZ";
        emp_id=emp_count;
        salary=25000;
        desig="temporary-member";
    }
    public Employee Compare_sal(Employee emp){
	if(this.salary>emp.salary)
		return this;
	else
		return emp;
    }
    public static void setemp_count(int i){
	emp_count=i;
    }
    void inc_sal(){
	System.out.println("Salary of "+name+" before increment:"+salary);
	salary=salary+3000;
	System.out.println("After increment: "+salary);
    }
    void inc_sal(float perc){
	System.out.println("Salary of "+name+" before increment:"+salary);
	salary=(1+(perc/100))*salary;
	System.out.println("After increment: "+salary);
    }
    public static void main(String args[]){
        Employee emp1=new Employee();
	Employee emp2=new Employee("ABC");
	Employee maxemp=new Employee();
	emp1.inc_sal();
	emp2.inc_sal(5);
	maxemp=emp1.Compare_sal(emp2);
	System.out.println(maxemp.name+" has higher salary");
    }
}
