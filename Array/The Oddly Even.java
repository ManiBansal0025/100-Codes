import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long copy = n;
    long num=0;int count=0;long sum=0,sum1=0;long p = 10;
    while(n>0){
      num = n%10;
      count++;
      n = n/10;
    }
    //System.out.println(count);
    long arr[] = new long[count];
    for(int i=0;i<count;i++){
      arr[i] = copy%10;
      //System.out.print(arr[i]+" ");
      copy=copy/10;
    }
    for(int i=0;i<count;i=i+2){
      sum = sum+arr[i];
    }
    for(int j=1;j<count;j=j+2){
      sum1 = sum1+arr[j];
    }
    if(sum1>sum){
      System.out.println(sum1-sum);
    }
    else{
      System.out.println(sum-sum1);
    }
  }
}
