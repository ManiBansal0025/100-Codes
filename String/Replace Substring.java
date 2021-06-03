import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Enter the old String");
		String oldstr = sc.next();
		System.out.println("Enter the new String");
		String newstr = sc.next();
		String replaceString = s.replaceAll(oldstr,newstr);
		System.out.println(replaceString);
	}
}
