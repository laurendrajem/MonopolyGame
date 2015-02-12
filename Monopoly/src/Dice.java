
public class Dice { 
  private int diceOne = 0; 
     private int diceTwo = 0; 
     private int total = 0; 
     
     
      
     public int roll (){  
     diceOne = (int)(Math.random()*6) + 1; 
 	diceTwo = (int)(Math.random()*6) + 1; 
	 
 	 
 	total = diceOne + diceTwo; 
	return total; 
     } 
     
    public boolean isDouble (){  
	 
 	if (diceOne==diceTwo) 
	    return true; 
 	else  
	    return false; 
     }    
 } 
 


 
   

