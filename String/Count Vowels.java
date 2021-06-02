import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		for(int i=0;i<s.length();i++){
		    if(s.charAt(i) == 'a' ||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'
		    ||s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U')
		    {
		        count++;
		    }
		}
		System.out.println("No of Vowels "+count);
	}
}
