public class Main
{
	public static void main(String[] args) {
	    int col = 7;int n = col/2;
		for(int i=0;i<4;i++){
		    for(int k=0;k<col;k++){
		        System.out.print("*");
		    }
		    col=col-2;
		    System.out.println();
		    for(int j=0;j<=i;j++){
		     System.out.print(" ");
		    }
		    
		}
	}
}
