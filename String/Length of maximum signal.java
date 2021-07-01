import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();int count=0;int max=0;
	    String s = sc.next();
	    for(int i=0;i<n;i++){
	        if(s.charAt(i) == '1'){
	            count++;
	            max=Math.max(max,count);
	        }
	        if(s.charAt(i) == '0'){
	            count = 0;
	        }
	    }
	    System.out.println(max);
	}//101111110
}
