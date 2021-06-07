import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
		int sum = 0; int temp=0;
		System.out.println("Enter the size of the array");
		int m = sc.nextInt();
	    System.out.println("Enter the value of array");
		int arr[] = new int[m];
		int even[] = new int[m];
		int odd[] = new int[m];
		for(int i=0;i<m;i++){
		    arr[i] = sc.nextInt();
		 }
		 int c=0,d=0;
		 for(int i=0;i<m;i++){
		    if(i%2 == 0){
		        even[c] = arr[i];
		        c++;
		    }
		    else{
		        odd[d] = arr[i];
		        d++;
		    }
		 }
		for(int i=0;i<c;i++){
		    for(int j=i+1;j<c;j++){
		        if(even[i]>even[j]){
		            temp = even[i];
		            even[i] = even[j];
		            even[j] = temp;
		        }
		    }
		} 
		
		for(int i=0;i<d;i++){
		    for(int j=i+1;j<d;j++){
		        if(odd[i]>odd[j]){
		            temp = odd[i];
		            odd[i] = odd[j];
		            odd[j] = temp;
		        }
		    }
		}
		System.out.print("Sorted even array: ");
		for(int i=0;i<c;i++){
		    System.out.print(even[i]+" ");
		 }
		 System.out.println(" ");
		 System.out.print("Sorted odd array: ");
		 for(int i=0;i<d;i++){
		    System.out.print(odd[i]+" ");
		 }
		 System.out.println(" ");
		System.out.println(even[1]+odd[1]);
		
	}
}
