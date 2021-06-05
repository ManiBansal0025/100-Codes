import java.util.*;
public class Main
{
	public static void main(String[] args) {

	    Scanner sc = new Scanner(System.in);
	     String hy = ""; String s="";
		System.out.println("Enter the string");
		String var = sc.next(); 
		for(int i=0;i<var.length();i++){
		        if(var.charAt(i) == '-'){
		            hy += var.charAt(i);
		        }
		    else{
		        s += var.charAt(i);
		    }
		}
		    System.out.print(hy+s);
	}
}
