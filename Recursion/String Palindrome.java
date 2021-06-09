
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String s = sc.next();//civic
	    if(palind(s)){
	        System.out.println("String is Palindrome");
	    }
	    else{
	        System.out.println("String is not Palindrome");
	    }
	    
	}
	 static boolean palind(String s){
	    // if length is 0 or 1 then String is palindrome
        if(s.length() == 0 || s.length() == 1)
            return true;
        if(s.charAt(0) == s.charAt(s.length()-1))
            return palind(s.substring(1,s.length()-1));
        return false;
	}
	
}
