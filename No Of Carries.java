import java.util.*;
public class Main
{
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter number one");
		int num = sc.nextInt(); 
		System.out.println("Enter number second");
		int num2 = sc.nextInt(); int count=0,s=0,p=0,sum=0,carry=0;
		while(num>0){
		    p = num%10;
		    s = num2%10;
		    sum = p+s+carry;
		    if(sum>9){
		        carry = sum/10;
		        count++;
		    }
		    num = num/10;
		    num2 = num2/10;
		}
		    System.out.print(count);
	}
}
