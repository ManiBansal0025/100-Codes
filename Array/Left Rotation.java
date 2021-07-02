import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n= sc.nextInt();int k=0;
	    int rot = sc.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i] = sc.nextInt();
	    }
	    int newarr[] = new int[n];
	    for(int i=rot;i<n;i++){
	        newarr[k++] = arr[i];
	    }
	    for(int i=0;i<rot;i++){
	        newarr[k++] = arr[i];
	    }
		for(int i=0;i<n;i++){
		    System.out.print(newarr[i]+" ");
		}
	}
}
