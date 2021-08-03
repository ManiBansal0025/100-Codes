import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	    int n = sc.nextInt();int max=0;int sum=0;
	    
	    int arr[] = {52,66,64,36,45,24,32};
	    for(int i=n-1;i>=0;i--){
	        if(arr[i]>max){
	            max = arr[i];
	            sum = sum+max;
	            System.out.print(max+" ");
	        }
	    }
	    System.out.println(sum);
	}
}
