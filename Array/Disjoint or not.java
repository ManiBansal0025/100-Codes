import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int flag=0;
		int arr[] = new int [n];
		int arr1[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    arr1[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(arr[i] == arr1[j]){
		            flag=1;
		            break;
		        }
		    }
		}
		if(flag==1){
		    System.out.println("Not Disjoint");
		}
		else{
		    System.out.println("Disjoint");
		}
	}
}
