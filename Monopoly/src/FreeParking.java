public class FreeParking extends Squares{ 
 	public FreeParking(String n, int o) { 
 		setName(n); 
 		setOwnerId(o); 		 
 	} 
	public static void landedOnFreeParking() 
	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you landed on Free Parking and collect 100 dollars."); 
		Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() + 100); 
 	} 
 
 
} 
