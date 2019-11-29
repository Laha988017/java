public class Calculator{
     public static void main(String args[]){
     float result=0;
     switch(args[1]){
         case"+":result=Integer.parseInt(args[0])+Integer.parseInt(args[2]);
                break;
          case "-":result=Integer.parseInt(args[0])-Integer.parseInt(args[2]);
                break;
          case "*":result=Integer.parseInt(args[0])*Integer.parseInt(args[2]);

                break;
          case "/":result=Integer.parseInt(args[0])/Integer.parseInt(args[2]);

                break;
      }
      System.out.println("result: "+result);

      }

}
