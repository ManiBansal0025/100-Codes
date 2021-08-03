import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	 
	    String str1 = "are";
	    String str2 = "denim";
	    int n = str1.length()+str2.length();
	    int m = str2.length();
	    int c = str1.length();int p=0;int t=0;
	    int k=0; String str="";String nstr="";
	    char ch[] = new char[n];
	    
	    for(int i=0;i<str1.length();i++){
	           if(str1.charAt(i) < str2.charAt(i)){
	               ch[k++] = str1.charAt(i);
	               ch[n-i-1] = str2.charAt(i);
	           }
	           else if(str1.charAt(i) > str2.charAt(i)){
	               ch[k++] = str2.charAt(i);
	               ch[n-i-1] = str1.charAt(i);
	           }
	      }
	    
	    if(m>c){
	        p = m-c;
	        for(int i=p+1;i<m;i++){
	          ch[i] = str2.charAt(i);  
	        }
	 	}
	   else{
	         t = c-m; 
	         for(int i=t+1;i<c;i++){
	         ch[i] = str1.charAt(i); 
	        }
	   }
	    System.out.println(new String(ch));
	}
}
