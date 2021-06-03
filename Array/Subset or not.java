import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the first array limit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int flag=0;
		int arr[] = new int [n];
		int arr1[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter the second array limit");
		int m = sc.nextInt();
		for(int i=0;i<m;i++){
		    arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        if(arr[i] == arr1[j]){
		            i++;
		            flag++;
		        }
		    }
		}
		if(flag==m){
		    System.out.println("Subset");
		}
		else{
		    System.out.println("No Subset");
		}
	}
}
