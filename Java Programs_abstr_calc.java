abstract class figure{
	abstract double area();
	abstract double volume();
}
class cube extends figure{
	private double side;
	cube(double a){
		side=a;
	}
	double area(){
		return (6*side*side);
	}
	double volume(){
		return (side*side*side);
	}
}
class cuboid extends figure{
	private double len,bre,hei;
	cuboid(double a,double b,double c){
		len=a;
		bre=b;
		hei=c;
	}
	double area(){
		return(2*((len*bre)+(bre*hei)+(hei*len)));
	}
	double volume(){
		return(len*bre*hei);
	}
}
class abstr_calc{
	public static void main(String args[]){
		cube cu=new cube(3.5);
		cuboid cub=new cuboid(3.5,4.5,5);
		System.out.println("Area of the cube:"+cu.area());
		System.out.println("Area of the cuboid:"+cub.area());
		System.out.println("Volume of the cube:"+cu.volume());
		System.out.println("Volume of the cuboid:"+cub.volume());
	}
}
