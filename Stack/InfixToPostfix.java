import java.util.Stack;
import java.util.*;
public class Postfix{
  public static int prec(char ch){
    switch(ch){
      case '+':
        return 1;
      case '-':
        return 1;
      case '*':
        return 2;
      case '/':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }
  public static String infixTopostfix(String s){
    Stack<Character> stack  = new Stack<Character>();
    String res ="";
    for(int i=0;i<s.length();i++){
      char ch = s.charAt(i);
      if(Character.isLetterOrDigit(ch)){
        res = res+ch;
      }
      else if(ch == '('){
        stack.push(ch);
      }
      else if(ch == ')'){
        while(!stack.isEmpty() && stack.peek != '('){
          res = res+stack.pop();
        }
        stack.pop();
      }
      else{
       while(!stack.isEmpty() && prec(ch)<=prec(stack.peek())){
          res = res+stack.pop();
        }  
        stack.push(ch);
      }
    }
      while(!stack.isEmpty() && stack.peek() != '('){
        res = res+stack.pop();
      }
      return res;
  }
  
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    System.out.println(infixTopostfix(s));
  }
}
