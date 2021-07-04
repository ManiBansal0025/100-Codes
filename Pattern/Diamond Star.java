public class Main
{
	public static void main(String[] args) {
	    int col = 7;int n = col/2;
		for(int i=0;i<4;i++){
		    col--;
		    for(int j=col;j>n;j--){
		        System.out.print(" ");
		    }
		    for(int k=0;k<=i*2;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		col=7;
		for(int i=0;i<n;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print(" ");
		    }
		    col = col-2;
		    for(int k=0;k<col;k++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
	}
