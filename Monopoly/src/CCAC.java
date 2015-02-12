public class CCAC extends Squares{ 
 	public CCAC(String n, int o) { 
 		setName(n); 
 		setOwnerId(o); 
 		 
 	} 
 	public static void landedOnCommunityChest() 
	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you landed on Community Chest. You get 100 dollars. "); 
 		Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() + 100);
 	} 
 	public static void landedOnChance() 
 	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you landed on Chance. You get 100 dollars."); 
 		Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() + 100);
 	} 
 
 } 
