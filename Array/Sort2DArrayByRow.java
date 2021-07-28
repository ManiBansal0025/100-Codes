import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int arr[][] = new int[n][m];
	    for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            arr[i][j] = sc.nextInt();
	        }
	    }
	    int p[][] = Array2d(n,m,arr);
		for(int i=0;i<n;i++){
	        for(int j=0;j<m;j++){
	            System.out.print(p[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
	public static int[][] Array2d(int n,int m,int arr[][]){
	    int temp=0;
	    for(int k=0;k<n;k++){
	        for(int i=0;i<m;i++){
	            for(int j=i+1;j<m;j++){
	                if(arr[k][i]>arr[k][j]){
	                    temp = arr[k][i];
	                    arr[k][i] = arr[k][j];
	                    arr[k][j] = temp;
	                }
	            }
	        }
	    }
	    return arr;
	}
}
