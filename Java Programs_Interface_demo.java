interface Area{
	int area();
}
interface Volume{
	int volume();
}
abstract class Shape{
	private int a;
	Shape(int x){
		a=x;
	}
	abstract void display();
	public int area(){
		return (6*a*a);
	}
    	public int volume(){
        	return (a*a*a);
    	}
}
class cube extends Shape implements Area,Volume{
	private int a;
	cube(int x){
		super(x);
		a=x;
	}
	void display(){
		System.out.println("Area="+this.area());
        	System.out.println("Volume="+this.volume());
    }
}
class Interface_demo{
	public static void main(String args[]){
		cube ob=new cube(3);
		ob.display();
	}
}
