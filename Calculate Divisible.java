import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		System.out.println("Enter the value");
		int m = sc.nextInt();
		int n = sc.nextInt();
		for(int i=m;i<=n;i++){
		    if(i%3 == 0 && i%5 == 0){
		        sum = sum+i;
		    }
		 }
		    System.out.println(sum);
		
	}
}
