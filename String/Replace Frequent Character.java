import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String s= sc.next();
		System.out.println("Enter the argument");
		char ch= sc.next().charAt(0);
		char ch1 = '\u0000';
		int max=0,count=0;
		for(int i=0;i<s.length();i++){
		    count = 0;
		    for(int j=1;j<s.length();j++){
		        if(s.charAt(i) == s.charAt(j)){
		            count++;
		            if(count>max){
		                max = count;
		                ch1 = s.charAt(i);
		            }
		        }
		    }
		}
		//jjkdkksjjdjf //yykdkksyydyf
		String replace1 = s.replace(ch1,ch);
		System.out.println(replace1);
		
	}
}
