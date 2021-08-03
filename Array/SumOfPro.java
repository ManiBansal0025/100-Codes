import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	    int n = sc.nextInt();int mul=0;int sum=0;
	    
	    int arr1[] = {22,7,1,-5,5,-2};
	    int arr2[] = {4,-1,21,12,10,-3};
	    int i=0;
	    for(int j=n-1;j>=0;j--){
	        mul = arr1[i++]*arr2[j];
	        sum = sum+mul;
	            //System.out.print(mul+" ");
	        }
	    System.out.println(sum);
	}
}
