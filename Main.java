
//Demo for Hand, Deck, and Card classes
public class Main {

	public static void main(String[] args) {
		
		//creation of objects
		Deck a =new Deck();
		a.shuffleDeck();
		
		Hand b =new Hand();
		Hand c =new Hand();
		
		//draw from the deck
		b.addCard(a.removeCard());
		c.addCard(a.removeCard());
		b.addCard(a.removeCard());
		c.addCard(a.removeCard());
		b.addCard(a.removeCard());
		c.addCard(a.removeCard());
		
		
		System.out.println("Hand 1:");
		b.printDeck();
		System.out.println();
		System.out.println("Hand 2:");
		c.printDeck();
		
		System.out.println();
		System.out.println("Sorting...");
		System.out.println("----------------");
		b.shuffleName();
		c.shuffleName();
		System.out.println("Hand 1:");
		b.printDeck();
		System.out.println();
		System.out.println("Hand 2:");
		c.printDeck();

	}

}
