import java.util.*;
class Solution {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n-1;i++){
      arr[i] = sc.nextInt();
    }
    int p = MissingNumber(arr,n);
    System.out.println(p);
  }
   public static int MissingNumber(int array[], int n) {
        // Your Code Here
        int sum=0,sum1=0;
        for(int i=0;i<n-1;i++){
            sum = sum+array[i];
            //System.out.println(sum);
        }
        for(int j=1;j<=n;j++){
            sum1 = sum1+j;
            //System.out.println(sum1);
        }
        return (sum1-sum);
    }
}
