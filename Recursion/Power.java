public class Main
{
	public static void main(String[] args) {
		System.out.println(Power(3,5));
	}
	static int Power(int a,int b){
	    if(b==0){
	        return 1;
	    }
	    if(b%2 == 0){
	        return Power(a*a,(b/2));
	    }
	    return a*Power(a,b-1);
	}
}
