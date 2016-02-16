/**
 * 
 */
package goFish;

/**
 * @author benjaminreul
 *
 */
// going to need to return text for the console
public class GameBag
{
	Object[] gameInfo = new Object[3];
	int check;
	Deck deck;
	Hand ownHand;
	Hand oppHand;
	/**
	 * 
	 */
	public GameBag(int check, Deck deck, Hand ownerHand, Hand oppHand)
	{
		this.check = check;
		this.deck= deck;
		this.ownHand= ownerHand;
		this.oppHand= oppHand;
	}	
		/**
	 * @param args
	 */
	public Object[] GoFish()
	{
		System.out.println("card Being checked" + check);

		if(oppHand.remove(check))
		{
			System.out.println("Yey they had it");
			ownHand.remove(check);
			ownHand.increaseScore();
			gameInfo[0] = deck;
			gameInfo[1] = ownHand;
			gameInfo[2] = oppHand;
			return gameInfo;
		}
		// doesnt draw last card sometimes. may be an issue with deck or hand
		/*
		 * playerHand [score=14, size=1, handBag=[Card [value=5]]]
cpuHand [score=10, size=2, handBag=[Card [value=6], Card [value=6]]]
Deck [size=1, cards=[Card [value=5]]]
		 */
		else
		{// need some null protection here
			Card drawn = deck.draw();
			if(drawn == null)
			{
				System.out.println("deck is empty");
				gameInfo[0] = deck;
				gameInfo[1] = ownHand;
				gameInfo[2] = oppHand;
				return gameInfo;
			}
			else if(ownHand.remove(drawn.getValue()))
			{
				System.out.println("drew a card, it was already in hand");
				ownHand.increaseScore();
				gameInfo[0] = deck;
				gameInfo[1] = ownHand;
				gameInfo[2] = oppHand;
				return gameInfo;
			}
			else
			{
			System.out.println("drawing a card, didnt have it");
			ownHand.add(drawn);
			gameInfo[0] = deck;
			gameInfo[1] = ownHand;
			gameInfo[2] = oppHand;
			return gameInfo;
			}
		}
	
	
	}

	

}
