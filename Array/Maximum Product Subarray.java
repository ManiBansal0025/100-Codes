import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the limit");
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int max_pro,temp,c;
    int result=0;
    max_pro=arr[0];
    for(int i=0;i<n;i++){
      c=arr[i]; 
      temp=Math.max(c,c*max_pro); 
      max_pro = temp; 
      result = Math.max(max_pro,result); 
      //System.out.println(result);
    }
    System.out.println(result);
  }
}
  
