package MyPackage;
public class A{
    public int x;
    private int y;
    protected int z;
    int w;
    public A(int a,int b,int c,int d){
        x=a;
        y=b;
        z=c;
        w=d;
    }
    public static void main(String args[]){
        A ob=new A(1,2,3,4);
        System.out.println(ob.x+" "+ob.y+" "+ob.z+" "+ob.w);
    }
}
