import java.util.*;
public class arr
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //8 
		int sub=0,add=0;
		int arr1[] = new int[n];
		int newarr[] = new int [n];
		for(int i=0;i<n;i++){
		    arr1[i] = sc.nextInt();//8 4 5 3 2 6 9 1
		}
		int c=0;
		for(int j=0;j<n;j++){
			add = 0;sub=0;
		    for(int k=j+1;k<n;k++){
		       if(arr1[j]>arr1[k]){
		        add = add+arr1[k];
		        }
		       else if(arr1[j]<arr1[k]){
		        sub = sub+arr1[k];
		        } 
		    }
		    newarr[c++] = add*sub;
		}
		for(int i=0;i<n;i++) {
			System.out.println(newarr[i]);
		}
		sc.close();
	}
}
