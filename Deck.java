/**
 * 
 * @author chunter1
 *Project_3
 *11-4-19
 */

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	ArrayList<Card> x =new ArrayList<> (52);
	
	//declares an entire deck
	public Deck()
	{
		Card a1 =new Card("clubs", "ace");
		Card a2 =new Card("clubs", "2");
		Card a3 =new Card("clubs", "3");
		Card a4 =new Card("clubs", "4");
		Card a5 =new Card("clubs", "5");
		Card a6 =new Card("clubs", "6");
		Card a7 =new Card("clubs", "7");
		Card a8 =new Card("clubs", "8");
		Card a9 =new Card("clubs", "9");
		Card a95 =new Card("clubs", "10");
		Card a10 =new Card("clubs", "jack");
		Card a11 =new Card("clubs", "queen");
		Card a12 =new Card("clubs", "king");
		Card a13 =new Card("spade", "ace");
		Card a14 =new Card("spade", "2");
		Card a15 =new Card("spade", "3");
		Card a16 =new Card("spade", "4");
		Card a17 =new Card("spade", "5");
		Card a18 =new Card("spade", "6");
		Card a19 =new Card("spade", "7");
		Card a20 =new Card("spade", "8");
		Card a21 =new Card("spade", "9");
		Card a215 =new Card("spade", "10");//
		Card a22 =new Card("spade", "jack");
		Card a23 =new Card("spade", "queen");
		Card a24 =new Card("spade", "king");
		Card a25 =new Card("diamond", "ace");
		Card a26 =new Card("diamond", "2");
		Card a27 =new Card("diamond", "3");
		Card a28 =new Card("diamond", "4");
		Card a29 =new Card("diamond", "5");
		Card a30 =new Card("diamond", "6");
		Card a31 =new Card("diamond", "7");
		Card a32 =new Card("diamond", "8");
		Card a33 =new Card("diamond", "9");
		Card a335 =new Card("diamond", "10");//-
		Card a34 =new Card("diamond", "jack");
		Card a35 =new Card("diamond", "queen");
		Card a36 =new Card("diamond", "king");
		Card a37 =new Card("heart", "ace");
		Card a38 =new Card("heart", "2");
		Card a39 =new Card("heart", "3");
		Card a40 =new Card("heart", "4");
		Card a41 =new Card("heart", "5");
		Card a42 =new Card("heart", "6");
		Card a43 =new Card("heart", "7");
		Card a44 =new Card("heart", "8");
		Card a45 =new Card("heart", "9");
		Card a455 =new Card("heart", "10");//--
		Card a46 =new Card("heart", "jack");
		Card a47 =new Card("heart", "queen");
		Card a48 =new Card("heart", "king");
		
		x.add(a1);
		x.add(a2);
		x.add(a3);
		x.add(a4);
		x.add(a5);
		x.add(a6);
		x.add(a7);
		x.add(a8);
		x.add(a9);
		x.add(a95);
		x.add(a10);
		x.add(a11);
		x.add(a12);
		x.add(a13);
		x.add(a14);
		x.add(a15);
		x.add(a16);
		x.add(a17);
		x.add(a18);
		x.add(a19);
		x.add(a20);
		x.add(a21);
		x.add(a215);
		x.add(a22);
		x.add(a23);
		x.add(a24);
		x.add(a25);
		x.add(a26);
		x.add(a27);
		x.add(a28);
		x.add(a29);
		x.add(a30);
		x.add(a31);
		x.add(a32);
		x.add(a33);
		x.add(a335);
		x.add(a34);
		x.add(a35);
		x.add(a36);
		x.add(a37);
		x.add(a38);
		x.add(a39);
		x.add(a40);
		x.add(a41);
		x.add(a42);
		x.add(a43);
		x.add(a44);
		x.add(a45);
		x.add(a455);
		x.add(a46);
		x.add(a47);
		x.add(a48);
	}
	
	
	//method that outputs entire deck
	public void printDeck()
	{
		for(int i =0; i<x.size(); i++)
		{
			System.out.println(x.get(i).suit +" "+x.get(i).name);
		}
	}
	
	//adds a card to arraylist
	public void addCard(Card j)
	{
		x.add(j);
	}//end of addCard()
	
	//removes a card from the deck and returns the card
	public Card removeCard()
	{
		Card temp =x.get(0);
		x.remove(0);
		return temp;
	}
	
	//shuffles deck
	public void shuffleDeck()
	{
		Collections.shuffle(x);
	}
	
	//shuffles entire deck
	public void shuffleName()
	{
		for(int i =0;i<52;i++)
		{
			if(i == 51)
			{
				break;
			}
			
			else
			{
				if(x.get(i).name.compareTo(x.get(i+1).name) <0 && i<51)
				{
					Card temp =x.get(i);
					x.set(i, x.get(i+1));
					x.set(i+1, temp);
				}
			}
		}
	}

}
