public class TaxMoney extends Squares{ 
 	public TaxMoney(String n, int o) { 
 		setName(n); 
 		setOwnerId(o); 
 		 
 	} 
 	public static void landedOnTax() 
	{ 
 		if(Intro.players.get(Intro.currentPlayer).getPosition()==4) 
 		{ 
 			System.out.println("You landed on Income Tax and lose 200 dollars."); 
 			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - 200); 
 		} 
 		 
 		else 
 		{ 
 			System.out.println("You landed on Luxury Tax and lose 100 dollars."); 
 			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - 100); 
 		} 
 	} 
 
 } 
