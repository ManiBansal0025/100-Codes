import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    if(checkPosorNeg(num)){
        if(checkPrimeOrNot(num)){
            System.out.println("No. is prime");
        }
        else{
            System.out.println("No. is not prime");
        }
    }
    else{
        System.out.println("No. is negative");
    }
  }
  public static boolean checkPosorNeg(int num){
      if(num>=0){
          return true;
      }
      return false;
  }
  public static boolean checkPrimeOrNot(int num){
      int flag = 0;
      for(int i=2;i<num-1;i++){
          if(num%i == 0){
            flag = 1;  
          }
      }
      if(flag == 1){
          return false;
      }
      return true;
  }
}
