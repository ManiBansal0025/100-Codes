public class Main
{
	public static void main(String[] args) {
	    int c=1;
		for(int i=1;i<=4;i++){
		    for(int j=1;j<=3;j++){
		        if(i==1||i==4||j==1||j==3){
		            System.out.print("3");
		        }
		        else{
		           System.out.print(c++);    
		        }
		    }
		    System.out.println();
		}
	}
}
