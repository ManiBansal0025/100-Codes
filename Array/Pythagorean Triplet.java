import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[] = {3, 4, 1, 9,5, 56, 7, 9, 12};
		  int n = arr.length;
		Arrays.sort(arr);
		for(int i=0; i+2<n; i++){
		   int pyth = (arr[i+1]*arr[i+1]) + (arr[i]*arr[i]);
		   int res = arr[i+2] * arr[i+2];
		   if(pyth == res){
		       System.out.println(arr[i] + "^2" + " + " + arr[i+1] + "^2" + " = " + arr[i+2] +"^2");
		   }
		}
	}
}
