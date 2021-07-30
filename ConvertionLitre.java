import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double nooflit = sc.nextInt(); //20
	    double distance = sc.nextInt(); //150
	    if(nooflit > 0 && distance > 0){
	    double litkm = (nooflit/distance)*100;
	    
	    double km = 0.6214;
	    double lit = 0.2642;
	    
	    double dismul = distance*km;
	    double nooflitmul = nooflit*lit;
	    
	    double milgall = dismul/nooflitmul;
	    
		System.out.println(String.format("%.2f",litkm));
		System.out.println(String.format("%.2f",milgall));
	    }
	    else{
	        System.out.println("Invalid input");
	    }
	}
}
