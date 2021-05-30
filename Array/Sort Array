import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();int temp;
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
		 System.out.print("Sorted Array: ");
		for(int j=0;j<n;j++){
		    System.out.print( arr[j]+" " );
		}
	}
}
