import java.util.*;
class Main{
  public boolean valid(String val){
    char arr[] = val.toCharArray();
    for(char ch:val.toCharArray()){
      if(ch =='('){
        ch.push(')');
      }
      else if(ch == '['){
        ch.push(']');
      }
      else if(ch =='{'){
        ch.push('}');
      }
      else if(val.isEmpty() || val.pop() != ch)
        return false;
    }
    return true;
    
  }
  
  public static void main(String args[]){
    String val = "()";
    
      
  }
}
