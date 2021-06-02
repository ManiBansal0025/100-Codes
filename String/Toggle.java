import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
	    String s1 = sc.nextLine();
      String s2 = "";
	    for(int i=0;i<s1.length();i++){
        char c = s1.charAt(i);
        if(c==c.toUpperCase()){
          c = c.toLowerCase();
          s2=s2.append(c);
	    }
        else if (c==c.toLowerCase()){
          c = c.toUpperCase();
          s2=s2.append(c);
        }
        
		System.out.println(s2);
	}
}
