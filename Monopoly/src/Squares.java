import java.util.ArrayList; 
 public class Squares { 
 	protected String name; 
 	protected int cost; 
 	protected int value; 
 	protected int ownerId; 


 	public String getName() 
 		{ 
 		return name; 
 		} 


 	public void setName(String name) 
 		{ 
 		this.name = name; 
 		} 



 	public int getCost() 
 		{ 
 		return cost; 
 		} 

 
 	public void setCost(int cost) 
 		{ 
 		this.cost = cost; 
		} 


 	public int getValue() 
 		{ 
 		return value; 
 		} 

 
 	public void setValue(int value) 
 		{ 
 		this.value = value; 
 		} 


 
 	public int getOwnerId() 
 		{ 
 		return ownerId; 
 		} 
 

 
 	public void setOwnerId(int ownerId) 
 		{ 
 		this.ownerId = ownerId; 
 		} 

 	static ArrayList<Squares> squares=new ArrayList<Squares>(); 

 
 	public static void addProperties(){ 
 		 
 		squares.add(new PassingGo("Go", 0)); 
 		squares.add(new Properties("Mediterranean Avenue", "brown", 60, 2, 10, 30, 90, 160, 250, 50, 0)); 
 		squares.add(new CCAC("Community Chest", 0)); 
 		squares.add(new Properties("Baltic Avenue", "brown", 60, 4, 20, 60, 180, 320, 450, 50, 0)); 
 		squares.add(new TaxMoney("Income Tax", 0)); 
 		squares.add(new Railroads("Reading Railroad", "black", 200, 25, 0)); 
 		squares.add(new Properties("Oriental Avenue", "lblue", 100, 6, 30, 90, 270, 400, 550, 50, 0)); 
 		squares.add(new CCAC("Chance", 0)); 
 		squares.add(new Properties("Vermont Avenue", "lblue", 100, 6, 30, 90, 200, 400, 550, 50, 0)); 
 		squares.add(new Properties("Connecticut Avenue", "lblue", 120, 8, 40, 100, 300, 450, 600, 50, 0)); 
 		squares.add(new Jail("Jail", 0)); 
 		squares.add(new Properties("St. James Place", "purple", 140, 10, 50, 150, 450, 625, 750, 100, 0)); 
 		squares.add(new Utilities("Electric Company", "speacial", 150, 0, 0)); 
 		squares.add(new Properties("States Avenue", "purple", 140, 10, 50, 150, 450, 625, 750, 100, 0)); 
 		squares.add(new Properties("Virginia Avenue", "purple", 160, 12, 60, 180, 500, 700, 900, 100, 0)); 
 		squares.add(new Railroads("Pennsylvania Railroad", "black", 200, 25, 0)); 
 		squares.add(new Properties("St. James Place", "orange", 180, 14, 70, 200, 550, 750, 950, 100, 0)); 
		squares.add(new CCAC("Community Chest", 0)); 
 		squares.add(new Properties("Tennesseee Avenue", "orange", 180, 14, 70, 200, 550, 750, 950, 100, 0)); 
 		squares.add(new Properties("New York Avenue", "orange", 200, 16, 80, 220, 600, 800, 1000, 100, 0)); 
 		squares.add(new FreeParking("Free Parking", 0)); 
 		squares.add(new Properties("Kentucky Avenue", "red", 220, 18, 90, 250, 700, 875, 1050, 150, 0)); 
 		squares.add(new CCAC("Chance", 0)); 
 		squares.add(new Properties("Indiana Avenue", "red", 220, 18, 90, 250, 700, 875, 1050, 150, 0)); 
 		squares.add(new Properties("Illinois Avenue", "red", 240, 20, 100, 300, 750, 925, 1100, 150, 0)); 
 		squares.add(new Railroads("B. & O. Railroad", "black", 200, 25, 0)); 
 		squares.add(new Properties("Atlantic Avenue", "yellow", 260, 22, 110, 330, 800, 975, 1150, 150, 0)); 
 		squares.add(new Properties("Ventnor Avenue", "yellow", 260, 22, 110, 330, 800, 975, 1150, 150, 0)); 
 		squares.add(new Utilities("Water Works", "nuetral", 150, 0, 0)); 
 		squares.add(new Properties("Marvin Gardens", "yellow", 280, 24, 120, 360, 850, 1025, 1200, 150, 0)); 
 		squares.add(new GoToJail("Go to Jail", 0)); 
 		squares.add(new Properties("Pacfic Avenue", "green", 300, 26, 130, 390, 900, 1100, 1275, 200, 0)); 
 		squares.add(new Properties("North Carolina Avenue", "green", 300, 26, 130, 390, 900, 1100, 1275, 200, 0)); 
 		squares.add(new CCAC("Community Chest", 0)); 
 		squares.add(new Railroads("Short Line", "black", 200, 25, 0)); 
 		squares.add(new CCAC("Chance", 0)); 
 		squares.add(new Properties("Park Place", "dblue", 350, 35, 175, 500, 1100, 1300, 1500, 200, 0)); 
 		squares.add(new TaxMoney("Luxury Tax", 0)); 
 		squares.add(new Properties("Boardwalk", "dblue", 400, 50, 200, 600, 1400, 1700, 2000, 200, 0)); 
 		 
 		 
 	} 
 	} 
