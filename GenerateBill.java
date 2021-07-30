import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int pizzas = sc.nextInt();
	    int puffs = sc.nextInt();
	    int colddrinks = sc.nextInt();
	    
	    System.out.println("Bill Details");
	    System.out.println("No. of Pizzas : "+ pizzas);
	    System.out.println("No. of puffs : "+ puffs);
	    System.out.println("No. of colddrinks : "+ colddrinks);
	    int tp = (pizzas*100)+(puffs*20)+(colddrinks*10);
	    System.out.println("Total price : "+ tp);
	    System.out.println("Enjoy your show!!!");
	}
}
