import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the limit");
	    int n = sc.nextInt();int temp=0;
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	     int sum=0;
	     for(int i=0;i<n;i++){
	         for(int j=i+1;j<n;j++){
	             if(arr[i]>arr[j]){
	                 temp = arr[i];
	                 arr[i] = arr[j];
	                 arr[j] = temp;
	             }
	         }
	     }
	     int x = arr[(int)n/2];
	   for(int i=0;i<n;i++){
	       arr[i] = Math.abs(arr[i]-x);
	       sum = sum + arr[i];
	   }
	      
	            System.out.println(sum);
	   
	}
}
