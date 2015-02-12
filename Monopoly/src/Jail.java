public class Jail extends Squares{ 
 	public Jail(String n, int o) 
 	{ 
 		setName(n); 
 		setOwnerId(o); 
 	} 
	public static void landedOnJail() 
	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you are in jail and will pay 50 dollars to get out."); 
 		Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - 50); 
 	} 
 
 
 } 
