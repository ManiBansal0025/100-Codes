import java.util.Map;
import java.util.HashMap;

public class Demo{
  public static void main(String args[]){
    Map<String,Integer> num = new HashMap<>();
    
    num.put("one",1);
    num.put("two",2);
    num.put("three",3);
    
    System.out.println(num);
  }
}
