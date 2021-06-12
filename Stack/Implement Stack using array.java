import java.util.*;
public class Stack{
  int top =0;
  int max = 5;
  int a[] = new int[max];
  public void insert(int val){
    if(top == max){
      System.out.println("Stack is full");
    }
    else{
      a[top++] = val;
    }
  }
  public int remove(){
    if(top == 0){
      return -1;
    }
    else{
      int x = a[--top];
      return x;
      }
  }
}
    
class Main{

  public static void main(String args[]){
    Stack stack = new Stack();
    stack.insert(12);
    stack.insert(13);
    stack.insert(2);
    stack.insert(5);
    stack.insert(7);
    
    System.out.println(stack.remove());
    System.out.println(stack.remove());
    System.out.println(stack.remove());
    System.out.println(stack.remove());
  }
}
