import java.util.ArrayList;
public class Unboxing {
  public static void main(String[] args)
  {
    Character character = 'a';
    char a = character;
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    arrayList.add(25);
    int num = arrayList.get(0);
    System.out.println(num);
  }
}
