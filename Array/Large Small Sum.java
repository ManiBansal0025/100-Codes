import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int n= sc.nextInt();
		System.out.println("Enter the value");
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i] = sc.nextInt();
		}
		int even[] = new int[n];
		int odd[]=new int[n];
		int sum=0; int temp=0;
		
		int je=1,ko=0;
		even[0] = arr[0];
	    for(int i=1;i<n;i++){
		    if(i%2==0){
		        even[je] = arr[i];
		        je++;
		    }
		    else{
		        odd[ko]=arr[i];
		        ko++;
		    }
		}
		
		//Sorting even
		for(int i=0;i<je;i++){
		    for(int j=i+1;j<je;j++){
		        if(even[i]>even[j]){
		            temp=even[i];
		            even[i]=even[j];
		            even[j]=temp;
		        }
		    }
		}
		
		//Sorting odd
		for(int i=0;i<ko;i++){
		    for(int j=i+1;j<ko;j++){
		        if(odd[i]>odd[j]){
		            temp=odd[i];
		            odd[i]=odd[j];
		            odd[j]=temp;
		        }
		    }
		}
		sum = even[je-2]+odd[ko-2];
		System.out.println(sum);
	}
}
		
		
