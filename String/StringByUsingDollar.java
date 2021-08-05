
public class Main
{
	public static void main(String[] args) {
	    String str = "Accenture"; int count=1;String p = "";String h = "";
	    char ch[] = str.toCharArray();
	    for(int i=0;i<ch.length;i++){
	        count=1; h="";
	        for(int j=i+1;j<ch.length;j++){
	            if(ch[i] == ch[j] && ch[i] != '0'){
	                count++;
	                ch[j] = '0';
	               
	            }
	        }
	        for(int k=0;k<count;k++){
	            h = h+"$";
	        }
	        if(ch[i] != '0'){
	        p = p+ch[i]+":"+h; 
	        }
	    }
	    System.out.println(p);
	}
}
