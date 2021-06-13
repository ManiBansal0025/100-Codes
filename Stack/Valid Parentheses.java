import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(')');
            }
           else if(ch == '['){
                stack.push(']');
            }
            else if(ch == '{'){
                stack.push('}');
            } 
            else if( stack.isEmpty() || stack.pop()!=ch ){
                return false;
            }
        }
        return stack.isEmpty();
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    if(isValid()){
      System.out.println("Valid Parentheses");
    }
    else{
      System.out.println("Invalid Parentheses");
    } 
  }
}
