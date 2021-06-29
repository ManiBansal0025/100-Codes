import java.util.Map;
import java.util.HashMap;

public class Main{
  public static void main(String args[]){
    Map<String,Integer> map = new HashMap<>();
    
    map.put("one",1);
    map.put("two",2);
    map.put("three",3);
    map.put("four",4);
    map.put("five",5);
    
    System.out.println(map);
    //Output --> {four=4,one=1,two=2,three=3,five=5}
    
    System.out.println(map.get("three"));
    //Output --> 3
    
    System.out.println(map.get("seven"));
    //Output --> null
    map.put("four",8);
    System.out.println(map.get("four"));
    //Output --> 8
    
    System.out.println(map.containsKey("four"));
     //Output --> true
    System.out.println(map.containsKey("seven"));
    //Output --> false
    
    System.out.println(map.containsValue(3));
    //Output --> true
    System.out.println(map.containsValue(8));
    //Output --> true
     System.out.println(map.containsValue(4));
    //Output --> false
    
    map.remove("three");
    System.out.println(map);
    //Output --> {four=8,one=1,two=2,five=5}
    
     map.replace("one",1,10);
     System.out.println(map);
     //Output --> {four=8,one=10,two=2,five=5}
    
    map.remove("two",4);
    System.out.println(map);
    //Output --> {four=8,one=1,two=2,five=5}
    //will not remove 2 because the value of two is 2 not 4
    
    System.out.println(map.keySet());
    //Output --> {four,one,two,five}
    System.out.println(map.values());
    //Output --> {8,10,2,5}
  }
}
