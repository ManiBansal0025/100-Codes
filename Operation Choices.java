import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the operation");
		int c = sc.nextInt();
		System.out.println("Enter the value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		switch(c){
		    case 1: 
		        System.out.println(a+b);
		        break;
		    case 2: 
		        System.out.println(a-b);
		        break;
		    case 3: 
		        System.out.println(a*b);
		        break;
		    case 4: 
		        System.out.println(a/b);
		        break;
		    default:
		        System.out.println("Wrong Choice");
	    }
		
	}
}
