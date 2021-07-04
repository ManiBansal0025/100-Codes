public class Main
{
	public static void main(String[] args) {
	    int col = 7;int n = col/2;
		for(int i=0;i<4;i++){
		    for(int k=0;k<=i;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		col=7;int l=col/2;
		for(int i=0;i<n;i++){
		    for(int k=0;k<l;k++){
		        System.out.print("*");
		    }
		    l--;
		    System.out.println();
		}
	}
}
