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
	     for(int i=0;i<n;i++){
	         for(int j=i+1;j<n;j++){
	             if(arr[i]>arr[j]){
	                 temp = arr[i];
	                 arr[i] = arr[j];
	                 arr[j] = temp;
	             }
	         }
	     }
	   for(int i=0;i<n;i++){
	       System.out.print(arr[i]+" ");
	   }
	   //2, 3, 2, 5, 6, 2, 3, 9, 5, 6
	   
	}
}
