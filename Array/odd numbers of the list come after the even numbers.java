import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();int count=0;int k=0;
	    int arr[] = new int[n];
	    int newarr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        if(arr[i]%2 == 0){
	            newarr[k++] = arr[i];
	        }
	    }
	    for(int j=0;j<n;j++){
	        if(arr[j]%2 != 0){
	            newarr[k++] = arr[j];
	        }
	    }
	    for(int i=0;i<n;i++){
	        System.out.print(newarr[i]+" ");
	    }
	}
}
