import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int flag = 0;
    String str[] = {"break","case","continue","default","defer","else","for","func","goto","if","map","range","return","struct","type","var"};
    String checkstr = sc.next();
    for(int i=0;i<str.length;i++){
      if(checkstr.equals(str[i])){
        flag = 1;
      }
    }
    if(flag == 1){
        System.out.println(checkstr+" "+"is not a keyword");
    }
    else{
        System.out.println(checkstr+" "+"is a keyword");
    }
  }
}

    
