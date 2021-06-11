import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the limit");
	    int n = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        while(arr[i]%2 == 0){
	            arr[i] = arr[i]/2;
	        }
	        while(arr[i]%3 == 0){
	            arr[i] = arr[i]/3;
	        }
	    }
	    for(int i=1;i<n;i++){
	        if(arr[i]!=arr[0]){
	            System.out.println("No");
	        }
	        else{
	            System.out.println("Yes");
	        }
	    }
	}
}
