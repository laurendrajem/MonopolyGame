import java.util.Scanner;

public class Utilities extends Squares {
	private String color;
	private int cost;
	private int value;

	public Utilities(String n, String cl, int co, int v, int o) {
		setName(n);
		color = cl;
		cost = co;
		value = v;
		setOwnerId(o);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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

	public static void landedOnUtility(){ 
     	Scanner choice = new Scanner(System.in); 
     		if(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()==0) 
    		{ 
     		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " landed on " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " and it costs " + ((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost() + " dollars."); 
     		System.out.println( "Would you like to buy it? 1)Yes 2)No"); 
     		int userAwnser=choice.nextInt(); 
     		if(userAwnser==1) 
     		{ 
     			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you now own " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName()); 
    			squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).setOwnerId(Intro.players.get(Intro.currentPlayer).getId()); 
    			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - ((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost()); 
    		} 
    		else 
     		{ 
     			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " does not want to buy " +  squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + "."); 
     		} 
     		 
     		} 
     		else if(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()==Intro.players.get(Intro.currentPlayer).getId()) 
     		{ 
     			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you already own " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName()); 
     		} 
     		 
     		else 
     		{ 
     			System.out.println(Intro.players.get(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).getName() + " owns " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " and you owe them " + ((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue() + " dollars."); 
     			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - ((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue()); 
     			Intro.players.get(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).setMoney(Intro.players.get(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + ((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue()); 
     			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " now has " + Intro.players.get(Intro.currentPlayer).getMoney() + " dollars."); 
     			System.out.println(Intro.players.get(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).getName()  + " now has " + Intro.players.get(((Utilities) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getOwnerId()-1).getMoney() + " dollars."); 
     		} 
     }}
