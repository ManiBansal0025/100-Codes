import java.util.Stack;
class Stock{
  public static void calculateSpan(int prices[],int n,int m[]){
    m[0] = 1;
    Stack<Integer> stack = new Stack<>();
    stack.push(0);
    for(int i=1;i<n;i++){
      while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]){
        stack.pop();
      }
      m[i] = (stack.isEmpty())? (i+1) : (i-stack.peek());
      stack.push(i);
    }
  }
  public static void printarray(int m[],int n){
    for(int i=0;i<n;i++){
      System.out.print(m[i]+" ");
    }
  }
  public static void main(String args[]){
    int prices[] = {100,80,60,70,60,75,85};
    int days = 7;
    int newarr[] = new int[days];
    calculateSpan(prices,days,newarr);
    printarray(newarr,days);
  }
}
