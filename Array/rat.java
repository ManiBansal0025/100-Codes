import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int rat = sc.nextInt();int sum=0,count=0;
	    int unit = sc.nextInt();
	    int required = rat*unit;
	    int arr[] = {5,6,1,5,7};
	    for(int i=0;i<arr.length;i++){
	        sum = sum+arr[i];
	        count++;
	        if(sum >= required){
	            break;
	        }
	    }
		System.out.println(sum);
		System.out.println(count);
	}
}
