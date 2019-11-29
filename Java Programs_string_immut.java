class string_immut{  
     public static void main(String args[]){  
       String s="Good";  
       s.concat("Food");
	System.out.println("Concatenating string with word 'Food'");  
       System.out.println(s);
	System.out.println("printed 'Good' because strings are immutable objects");
	System.out.println("Now Replacing previous value with the concatenated one.Now it will print the concatenated string");   
      s=s.concat("Food");
   System.out.println(s);
 }  
  
}  
  
