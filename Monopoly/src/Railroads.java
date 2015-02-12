import java.util.Scanner; 
 

 public class Railroads extends Squares{ 
 	private String color; 
 	private int cost; 
 	private int value; 
 	 
 	public Railroads(String n, String co, int c, int v, int o) { 
 		setName(n); 
 		color=co; 
 		cost=c; 
 		value=v; 
 		setOwnerId(o); 
 		 
 	} 
 
 
 	public int getCost() { 
 		return cost; 
 	} 
 
 
 	public void setCost(int cost) { 
 		this.cost = cost; 
 	} 
 
 
 	public int getValue() { 
		return value; 
	} 
 
 
 	public void setValue(int value) { 
 		this.value = value; 
 	} 
 
 
 	 
 	public static void landedOnRailroad() throws InterruptedException 
 	{ 
 		if(squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()==0) 
 		{ 
 		Scanner keyboard=new Scanner(System.in); 
		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " landed on " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " and it costs " + (squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost() + " dollars."); 
 		System.out.println("Would you like to buy it? 1)Yes 2)No"); 
 		int awnser=keyboard.nextInt(); 
 		if(awnser==1) 
 		{ 
 			Thread.sleep(500);
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you now own " +  squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName()); 
 			squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).setOwnerId(Intro.players.get(Intro.currentPlayer).getId()); 
 			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - ((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost()); 
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " now has " + Intro.players.get(Intro.currentPlayer).getMoney() + " dollars."); 
 		} 
		else 
 		{ 
			Thread.sleep(500);
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " did not buy " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " for " + ((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost() + " dollars."); 
 		} 
 		} 
 		else if(squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()==Intro.players.get(Intro.currentPlayer).getId()) 
 		{ 
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you already own " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName()); 
		} 
 		 
 		else 
 		{ 
 			Thread.sleep(500);
 			System.out.println(Intro.players.get(squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).getName() + " owns " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " and you owe them " + ((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue() + " dollars."); 
 			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - ((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue()); 
 			Intro.players.get( squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).setMoney(Intro.players.get(((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + ((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue()); 
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " now has " + Intro.players.get(Intro.currentPlayer).getMoney() + " dollars."); 
 			System.out.println(Intro.players.get(squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).getName()  + " now has " + Intro.players.get(((Railroads) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + " dollars."); 
 		} 
 		 
 		 
 	} 
 	 
 
 
 } 
