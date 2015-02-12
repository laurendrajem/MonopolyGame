public class CCAC extends Squares{ 
 	public CCAC(String n, int o) { 
 		setName(n); 
 		setOwnerId(o); 
 		 
 	} 
 	public static void landedOnCommunityChest() 
	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you landed on Community Chest."); 
 	} 
 	public static void landedOnChance() 
 	{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you landed on Chance."); 
 	} 
 
 } 
