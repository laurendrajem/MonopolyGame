

import java.util.Scanner; 
import java.util.ArrayList; 
 
 
 public class Intro { 
 	public static int currentPlayer = 0; 
 	public static ArrayList<Players> players = new ArrayList<Players>(); 
 
 
 	
 
 
 	public static void play() throws InterruptedException { 
 		Scanner userInput = new Scanner(System.in); 
 
 
 		System.out.println(); 
 		System.out.println("How many people will be playing monopoly.... 1 or 2?"); 
 		int answer = userInput.nextInt(); 
 		if(answer == 1)
 		{
 			System.out.println("Silly you, you need more than one player for monopoly!");
 		}
 		if (answer == 2) { 
 			System.out.println(); 
 			System.out.println("Player 1 please input your name."); 
 			String a = userInput.next(); 
 			players.add(new Players(0, 1, a, null, 1500)); 
 			System.out.println(players.get(0).getName());
 			System.out.println(); 
 			System.out.println("Player 2 please input your name."); 
 			String b = userInput.next(); 
 			players.add(new Players(0, 2, b, null, 1500)); 
 		
 
 		
 		} 
 		if (answer == 2) { 
 			System.out.println(); 
 			System.out 
 					.println("Please pick a character " 
 							+ players.get(0).getName() 
 							+ " 1)wheelbarrow, 2)thimble, 3)cat, 4)shoe, 5)battleship, or a 6)Scottish Terrier ?"); 
			int j = userInput.nextInt(); 
 			switch (j) { 
 			case 1: 
 				players.get(0).setToken("wheelbarrow"); 
 				break; 
 			case 2: 
 				players.get(0).setToken("thimble"); 
 				break; 
 			case 3: 
 				players.get(0).setToken("cat"); 
 				break; 
 			case 4: 
 				players.get(0).setToken("shoe"); 
 				break; 
 			case 5: 
			players.get(0).setToken("battleship"); 
 				break; 
 			case 6: 
 				players.get(0).setToken("Scottish Terrier"); 
 				break; 
 			} 
 			System.out.println(); 
 			System.out.println(players.get(0).getName() + " your token is " 
 					+ players.get(0).getToken() + "."); 
 			System.out.println(); 
 			System.out 
 					.println("Please pick a character " 
 							+ players.get(1).getName() 
 							+ " 1)wheelbarrow, 2)thimble, 3)cat, 4)shoe, 5)battleship, or a 6)Scottish Terrier ?"); 
 			int k = userInput.nextInt(); 
 			switch (k) { 
 			case 1: 
 				players.get(1).setToken("wheelbarrow"); 
 				break; 
 			case 2: 
 				players.get(1).setToken("thimble"); 
 				break; 
 			case 3: 
 				players.get(1).setToken("cat"); 
 				break; 
 			case 4: 
 				players.get(1).setToken("shoe"); 
 				break; 
 			case 5: 
 				players.get(1).setToken("battleship"); 
 				break; 
 			case 6: 
 				players.get(1).setToken("cannon"); 
 				break; 
 			} 
 			System.out.println(); 
 			System.out.println(players.get(1).getName() + " your token is " 
 					+ players.get(1).getToken() + "."); 
 
 
 
 
 		System.out.println("Let us begin the game of Monopoly :)"); 
 		int playerTotal = answer; 
 		while (playerTotal > 1) { 
 		int roll=Players.tossDie(); 
 		System.out.println(players.get(currentPlayer).getName() + " rolled a " + roll); 
 		players.get(currentPlayer).setPosition(players.get(currentPlayer).getPosition() + roll); 
 		if(players.get(currentPlayer).getPosition()>39) 
 		{ 
 			players.get(currentPlayer).setPosition(players.get(currentPlayer).getPosition()-39); 
 			PassingGo.passedGo(); 
 		} 
 		 
 			 
 			switch (players.get(currentPlayer).getPosition()) 
 			{ 
 			case 0: 
 				PassingGo.passedGo(); 
 			case 1: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 2: 
 				CCAC.landedOnCommunityChest(); 
 				break; 
 			case 3: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 4: 
					TaxMoney.landedOnTax(); 
 				break; 
 			case 5: 
 				Railroads.landedOnRailroad(); 
 				break; 
			case 6: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 7: 
 				CCAC.landedOnChance(); 
 				break; 
 			case 8: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 9: 
				Properties.landedOnProperty(); 
 				break; 
 			case 10: 
 				Jail.landedOnJail(); 
 				break; 
 			case 11: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 12: 
 				Utilities.landedOnUtility(); 
 				break; 
 			case 13: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 14: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 15: 
 				Railroads.landedOnRailroad(); 
 				break; 
 			case 16: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 17: 
 				CCAC.landedOnCommunityChest(); 
 				break; 
 			case 18: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 19: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 20: 
 				FreeParking.landedOnFreeParking(); 
 				break; 
 			case 21: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 22: 
 				CCAC.landedOnChance(); 
 				break; 
 			case 23: 
 				Properties.landedOnProperty(); 
				break; 
 			case 24: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 25: 
 				Railroads.landedOnRailroad(); 
 				break; 
 			case 26: 
				Properties.landedOnProperty(); 
 				break; 
			case 27: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 28: 
 				Utilities.landedOnUtility(); 
 				break; 
 			case 29:  
 				Properties.landedOnProperty(); 
				break; 
 			case 30: 
 				GoToJail.landedOnGoToJail(); 
 				break; 
 			case 31: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 32: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 33: 
 				CCAC.landedOnCommunityChest(); 
 				break; 
 			case 34: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 35: 
 				Railroads.landedOnRailroad(); 
 				break; 
 			case 36: 
 				CCAC.landedOnChance(); 
 				break; 
 			case 37: 
 				Properties.landedOnProperty(); 
 				break; 
 			case 38: 
 				TaxMoney.landedOnTax(); 
				break; 
 			case 39: 
 				Properties.landedOnProperty(); 
 				break; 
 			 
 			} 
 			if(currentPlayer==playerTotal-1) 
 			{ 
 				currentPlayer=0; 
 			} 
 			else 
			{ 
 				currentPlayer++; 
 			} 
 		} 
 	} 
 } 
 	
 }
