class mut{  
     public static void main(String args[]){  
       String s="cake";  
       s.concat("pastry");//concat() method appends the string at the end  
       System.out.println(s);//will print cake because strings are immutable objects  
      s=s.concat("pastry"); //replacing value of s altogether
   System.out.println(s); // now it will print cakepastry
 }  
  
}  
  
