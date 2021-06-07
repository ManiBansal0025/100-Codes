import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    char choice = '\u0000'; int sum=0;
		System.out.println("Enter the string");
		String str = sc.next();
		char arr[] = str.toCharArray();
		for(int i=1;i<arr.length;i+=2){
		    choice = arr[i];
		    if(choice == 'A'){
		        if(arr[i-1] == 1 && arr[i+1]==1){
		            sum = 1;
		        }
		        else{
		            sum = 0;
		        }
		    }
		    else if(choice == 'B'){
		        if(arr[i-1] == arr[i+1]){
		            sum = 0;
		        }
		        else{
		            sum = 1;
		        }
		    }
		    else if(choice == 'C'){
		        if(arr[i-1] == 0 && arr[i+1]==0){
		            sum = 0;
		        }
		        else{
		            sum = 1;
		        }
		        
		    }
		}
	
		System.out.println(sum);
	}
}
