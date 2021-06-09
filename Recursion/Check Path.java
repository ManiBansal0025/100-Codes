*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		System.out.println(Path(4,4));
	}
	static int Path(int row,int col){
	    if(row==1 || col==1){
	        return 1;
	    }
	    return Path(row,col-1)+Path(row-1,col);
	}
}
