import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n= sc.nextInt();int temp=0; int mul=0;
		System.out.println("Enter the sum");
		int sum= sc.nextInt();
		System.out.println("Enter the value");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		
		//Sorting array
		for(int i=0;i<arr.length;i++){
		    for(int j=i+1;j<arr.length;j++){
		        if(arr[i]>arr[j]){
		            temp=arr[i];
		            arr[i]=arr[j];
		            arr[j]=temp;
		        }
		    }
		}
		
		for(int i=0;i<n;i++){
		        if(arr[i]+arr[i+1]<n){
		            mul = arr[i]*arr[i+1];
		            break;
		    }
		}
		System.out.println(mul);
	}
}
