class Swap{
    static void swap(int x,int y){
        int temp;
        temp=x;
        x=y;
        y=temp;
        System.out.println("After Swapping in function, the values are a="+x+" b="+y);
    }
    public static void main(String[] args){
        int a=10,b=15;
        System.out.println("Initial values: a="+a+" b="+b);
        swap(a,b);
        System.out.println("After the swap the values in main(): a="+a+" b="+b);
        System.out.println("Thus,Java uses pass by value as the change occurring in function is not reflected back to main()");
    }
}