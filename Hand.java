/**
 * 
 * @author chunter1
 *Project_3
 *11-6-19
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Hand extends Deck{
	
	ArrayList<Card> y =new ArrayList<> (5);
	
	//no arg constructor
	public Hand()
	{
		
	}
	
	//prints deck
	public void printDeck()
	{
		for(int i =0; i<y.size(); i++)
		{
			System.out.println(y.get(i).suit +" "+y.get(i).name);
		}
	}
	
	//adds cards to deck
	public void addCard(Card j)
	{
		y.add(j);
	}//end of addCard()
	
	//sorts deck in lexographic order
	public void shuffleName()
	{
		for(int i =0;i<3;i++)
		{
			if(i == 2)
			{
				break;
			}
			else
			{
				if(y.get(i).name.compareTo(y.get(i+1).name) <0 && i<3)
				{
					Card temp =y.get(i);
					y.set(i, y.get(i+1));
					y.set(i+1, temp);
				}
			}
		}
	}//end of shuffleName

}
