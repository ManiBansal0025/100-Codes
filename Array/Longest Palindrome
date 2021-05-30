import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n = sc.nextInt();int num; int temp;
		int arr[] = new int[n];
		int mod = 0;
		String rev = "";
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		        if(arr[i]>arr[j]){
		            temp = arr[i];
		            arr[i] = arr[j];
		            arr[j] = temp;
		        }   
		    }
		}
		for(int i=n-1;i>=0;i--){
		    num = arr[i];
		    rev = "";
		    while(num != 0){
		        mod = num%10;
		        rev = rev + Integer.toString(mod);
		        num = num/10;
		    }
		    
		    if(arr[i] == Integer.parseInt(rev)){
		        System.out.println(rev+" "+ "is Palindrome");
		        break;
		    }
		}
		
	}
}
