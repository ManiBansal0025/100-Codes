
public class Main
{
	public static void main(String[] args) {
		int n = 3;
		for(int i=0;i<4;i++){
		    for(int j=0;j<=i;j++){
		        System.out.print(n);
		    }
		    n++;
		    System.out.println();
		}
		n=n-2;
		for(int i=0;i<3;i++){
		    for(int j=i+1;j<=3;j++){
		        System.out.print(n);
		    }
		    n--;
		    System.out.println();
		}
	}
}
