public class GoToJail extends Squares{ 
 	public GoToJail(String n, int o) { 
 		setName(n); 
 		setOwnerId(o); 
 		 
 	} 
 	public static void landedOnGoToJail() 
 	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " landed on the Go to Jail square and will now be going to Jail."); 
 		Intro.players.get(Intro.currentPlayer).setPosition(10); 
 	} 
 
 
 } 
