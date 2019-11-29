package MyPack2;
import MyPackage.*;
class C extends A{
    public C(){
        super(1,2,3,4);
    }
    public static void main(String args[]){
        A ob=new A(1,2,3,4);
        C ob1=new C();
        System.out.println(ob.x+" "+ob.y+" "+ob1.z+" "+ob.w);
    }
}
