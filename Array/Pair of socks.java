import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();int count=0;
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<n-1;i++){
	        for(int j=i+1;j<n;j++){
	            if(arr[i] == arr[j] && arr[i] != -1){
	                count++;
	                arr[j] = -1;arr[i] = -1;
	            }
	        }
	    }
		System.out.println(count);
	}
}
