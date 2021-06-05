import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int limit = 35;
	    char arr[] = {'1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P',
	    'Q','R','S','T','U','V','W','X','Y','Z'};
	    String var ="";int quo =0; int rem=0;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the division");
		int n = sc.nextInt();
		System.out.println("Enter the value");
		int num = sc.nextInt();
		while(num>0){
		    quo = num/n;
		    rem = num%n;
		    var = Character.toString(arr[rem-1])+var;
		    num = quo;
		}
		System.out.println(var);
	}
}
