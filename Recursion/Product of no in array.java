
public class Main
{
	public static void main(String[] args) {
	    int arr[] = {5,2,3,4,5};
	    int N = 5;
	    System.out.println(pro(arr,N));
	}
	 static int pro(int arr[], int N){
	    if(N <= 0){
	        return 1;
	    }
	    return arr[N-1] * pro(arr,N-1);
	}
	
}
