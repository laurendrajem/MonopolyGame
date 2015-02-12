import java.util.Scanner; 
 public class Properties extends Squares{ 
 	private String color; 
 	private int cost; 
 	private int value; 
 	private int valuewithonehouse; 
 	private int valuewithtwohouses; 
 	private int valuewiththreehouses; 
 	private int valuewithfourhouses; 
 	private int valuewithhotel; 
 	private int costofhousesandhotels; 
 
 
 	 
 	public Properties(String n, String cl, int co, int v, int v1, int v2, int v3, int v4, int h, int c, int o) 
 	{ 
 		setName(n); 
 		color=cl; 
 		setCost(co); 
 		setValue(v); 
		valuewithonehouse=v1; 
 		valuewithtwohouses=v2; 
 		valuewiththreehouses=v3; 
 		valuewithfourhouses=v4; 
         valuewithhotel=h; 
         costofhousesandhotels=c; 
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


 
 	public int getValuewithonehouse() { 
 		return valuewithonehouse; 
 	} 


 
 	public void setValuewithonehouse(int valuewithonehouse) { 
 		this.valuewithonehouse = valuewithonehouse; 
 	} 


 	public int getValuewithtwohouses() { 
 		return valuewithtwohouses; 
 	} 

 
 
 	public void setValuewithtwohouses(int valuewithtwohouses) { 
 		this.valuewithtwohouses = valuewithtwohouses; 
 	} 
 
 
 	public int getValuewiththreehouses() {  
 		return valuewiththreehouses; 
 	} 

 
 	public void setValuewiththreehouses(int valuewiththreehouses) { 
 		this.valuewiththreehouses = valuewiththreehouses; 
 	} 
 
 
 	public int getValuewithfourhouses() { 
 		return valuewithfourhouses; 
	} 



public void setValuewithfourhouses(int valuewithfourhouses) { 
 		this.valuewithfourhouses = valuewithfourhouses; 
 	} 
 
 
 
 	public int getValuewithhotel() { 
 		return valuewithhotel; 
 	} 
 
 
 
 
 
 
 	public void setValuewithhotel(int valuewithhotel) { 
 		this.valuewithhotel = valuewithhotel; 
 	} 
 
 
 	public int getCostofhousesandhotels() { 
	return costofhousesandhotels; 
 	} 

 	public void setCostofhousesandhotels(int costofhousesandhotels) { 
 		this.costofhousesandhotels = costofhousesandhotels; 
 	} 
	 
 	 
 	public static void landedOnProperty() throws InterruptedException 
 	{ 
		Scanner choice=new Scanner(System.in); 
 		if( squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()==0) 
 		{ 
 		System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " landed on " +  squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " and it costs " + ( squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost() + " dollars."); 
 		System.out.println("Would you like to buy it? 1)Yes 2)No"); 
 		int userAwnser=choice.nextInt(); 
 		if(userAwnser==1) 
 		{ 
 			Thread.sleep(500);
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you now own " +  squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName()); 
 		 squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).setOwnerId(Intro.players.get(Intro.currentPlayer).getId()); 
 		Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - ((Properties) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost()); 
			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " now has " + Intro.players.get(Intro.currentPlayer).getMoney() + " dollars."); 
 		} 
 		else 
 		{ 
 			Thread.sleep(500);
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " did not buy " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " for " + ((Properties) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getCost() + " dollars."); 
 		} 
 		 
 		} 
 		 
 		else if(squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()==Intro.players.get(Intro.currentPlayer).getId()) 
 		{ 
 			Thread.sleep(500);
 			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " you already own " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName()); 
 		} 
 		 
 		else 
 		{ 
 			Thread.sleep(500);
 			System.out.println(Intro.players.get( squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).getName() + " owns " + squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getName() + " and you owe them " + ((Properties) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue() + " dollars."); 
 			Intro.players.get(Intro.currentPlayer).setMoney(Intro.players.get(Intro.currentPlayer).getMoney() - squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getValue()); 
 			Intro.players.get( squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).setMoney(Intro.players.get(squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).getMoney() + ((Properties) squares.get(Intro.players.get(Intro.currentPlayer).getPosition())).getValue()); 
			System.out.println(Intro.players.get(Intro.currentPlayer).getName() + " now has " + Intro.players.get(Intro.currentPlayer).getMoney() + " dollars."); 
 			System.out.println(Intro.players.get( squares.get(Intro.players.get(Intro.currentPlayer).getPosition()).getOwnerId()-1).getName()  + " now has " + Intro.players.get( squares.get(Intro.players.get(Intro
 					.currentPlayer).getPosition()).getOwnerId()-1).getMoney() + " dollars."); 
 		} 
 		 
 		 
 	} 

 
} 
