
public class Main
{
	public static void main(String[] args) {
	    int a=0;
		for(int j=4;j>=1;j--){
		    if(j%2 == 0){
		      a = (j*(j+1))/2;
		      for(int i=0;i<j;i++){
		          System.out.print(a--);
		      }
		    }
		    else{
		       a=(j*(j-1))/2 + 1;
		       for(int i=0;i<j;i++){
		           System.out.print(a++);
		       }
		    }
		    System.out.println();
		}
	}
}
