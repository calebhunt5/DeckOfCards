/**
 * 
 * @author chunter1
 *Project_3
 *11-4-19
 */


public class Card {
	
	//creates values held by individual card
	String suit;
	String name;
	
	public Card(String newSuit, String newName)
	{
		suit =newSuit;
		name =newName;
	}//end of card
	
	public Card()
	{
		suit ="DEFUALT SUIT";
		name ="DEFUALT VALUE";
	}//end of no arg
	
	public void setSuit(String newSuit)
	{
		suit =newSuit;
	}
	
	public void setName(String newName)
	{
		name =newName;
	}
	
	public String getSuit()
	{
		return(suit);
	}
	
	public String getName()
	{
		return(name);
	}

}
