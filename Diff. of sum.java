import java.util.*;
 
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = sc.nextInt();int even=0,odd=0,diff=0;
        System.out.println("Enter the limit");
        int m = sc.nextInt();
        for(int i=1;i<n;i++){
            odd = odd+i;
        }
        for(int i=n;i<=m;i++){
            if(i%n == 0){
                even = even+i; 
            }
            else{
                odd = odd+i;
            }
        }
        if(even>odd){
            diff = even-odd;
        }
        else{
            diff = odd-even;
        }
        System.out.println(diff);
    }
}
