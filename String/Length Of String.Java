import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int count=0;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the string");
	    String num = sc.nextLine();
	    for(char c : num.toCharArray()){
	        count++;
	    }
		System.out.println(count);
	}
}
