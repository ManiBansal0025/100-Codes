import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n= sc.nextInt();
		boolean isDigit = false,isCharacter = false,isSpace = false;
		char arr[] = sc.next().toCharArray(); 
		for(int i=0;i<n;i++){
		    if(n<=4){
		        break;
		    }
		    else if(arr[0]>='0' && arr[0]<='9'){
		        break;
		    }
		    else{
		        if(arr[i] != ' ' || arr[i] != '/'){
		            isSpace = true;
		        }
		        if(arr[i] >= 'A' && arr[i]<='Z' ){
		            isCharacter = true;
		        }
		        if(arr[i] >= '0' && arr[i]<='9' ){
		            isDigit = true;
		        }
		    }
		}
		if(isDigit == true && isCharacter == true && isSpace == true){
		    System.out.println("Valid Password");
		   
		}
		else{
		    System.out.println("Invalid Password");
		    
		}
	}
}
