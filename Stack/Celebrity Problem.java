import java.util.Stack;

public class CelebrityProblem{
  static int matrix[][] = {{0,0,1,0},
                           {0,0,1,0},
                           {0,0,0,0},
                           {0,0,1,0}};
  public static boolean know(int a,int b){
    if(matrix[a][b] == 1){
      return true;
    }
    else {
    return false;
    }
  }
  
  public static int isCelebrity(int n){
    Stack<Integer> stack = new Stack<>();
    for(int i=0;i<n;i++){
      stack.push(i);
    }
    while(stack.size()>1){
      int a = stack.pop();
      int b = stack.pop();
      if(know(a,b)){
        stack.push(b);
      }
      else {
      stack.push(a);
      }
    }
    if(stack.isEmpty()){
      return -1;
    }
    int c = stack.pop();
    //System.out.println(c);
    for(int i=0;i<n;i++){
      if(i != c && (know(c,i) || !know(i,c)))
      return -1;
    }
    return c;
    }
  public static void main(String args[]){
    int n =4;
    int m = isCelebrity(n);
    System.out.println(m);
    
  }
}
