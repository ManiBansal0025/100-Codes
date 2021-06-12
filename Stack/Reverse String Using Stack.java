
public class ReverseStringUsingStack {
	int top=0;int max=6;
	String arr[] = new String[max];
	public void insert(String val) {
		if(top == max) {
			System.out.println("Stack is already full");
		}
		else {
			arr[top++] = val;
		}
		
	}
	
	public char[] reverses() {
		int j=0;
		String x = arr[--top];
		char arr1[] = new char[x.length()];
		if(top < 0) {
			System.out.println("Stack is Empty");
			
		}
		else {
			for(int i=x.length()-1;i>=0;i--) {
				 arr1[j++] = x.charAt(i);
			}
		}
		return arr1;
	}
	public static void main(String args[]) {
		ReverseStringUsingStack stack = new ReverseStringUsingStack();
		
		stack.insert("GeekQuiz");
		
		stack.insert("Coding");
		
		System.out.println(stack.reverses());
		System.out.print(stack.reverses());
	}
}
