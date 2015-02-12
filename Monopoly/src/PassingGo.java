public class PassingGo extends Squares{ 
 
 
 	public PassingGo(String n, int o) { 
 		setName(n); 
 		setOwnerId(o); 
 		 
	} 
 	public static void passedGo() 
 	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you passed Go and collect 200 dollars."); 
 		Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() + 200); 
 		 
 	} 
 } 
