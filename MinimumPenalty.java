import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //10 
		int sub=0,add=0,count=0;
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int j=n-1;j>0;j--){
		    sub = Math.abs(arr[j] - arr[j-1]);
		    add = add+sub;
		    count++;
		}
		System.out.println(count);
	}
}
