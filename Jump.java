import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //10 
		int jump=0;
		while(n>0){
		    if(n%2 == 0){
		        n = n/2;
		        jump++;
		    }
		    else{
		        n = n-1;
		        jump++;
		    }
		}
		
		System.out.println(jump);
	}
}
