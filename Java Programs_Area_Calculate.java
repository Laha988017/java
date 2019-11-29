class shape{
    double dim1,dim2;
}
class circle extends shape{
    circle(double x){
        super();
        dim1=x;
    }
    circle(){
	super();
	dim1=0;
    }
    double area(){
        return (Math.PI*dim1*dim1);
    }
}
class rectangle extends shape{
    rectangle(double x,double y){
        super();
        dim1=x;
        dim2=y;
    }
    rectangle(){
	super();
	dim1=0;
	dim2=0;
    }
    double area(){
        return (dim1*dim2);
    }
}
class Area_Calculate{
    final void display(circle c,rectangle r){
        System.out.println("Area of Circle:"+c.area());
        System.out.println("Area of Rectangle:"+r.area());
    }
    public static void main(String args[]){
        circle c=new circle(3.5);
        rectangle r=new rectangle(3.5,6.5);
        Area_Calculate ob=new Area_Calculate();
        ob.display(c,r);
    }
}
