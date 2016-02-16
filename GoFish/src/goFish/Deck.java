package goFish;

import java.util.*;
import java.io.*;

public class Deck {
	
	private int size;
	private LinkedList<Card>cards;
	 	
	/**
	 * @throws IOException
	 */
	public Deck() throws IOException {
		this.size = 52;
		cards=shuffle();
		}
	
	/**
	 * @return
	 * @throws IOException
	 */
	public LinkedList<Card> shuffle() throws IOException {
		LinkedList<Card> tempCards = new LinkedList<Card>();
		tempCards.add(new Card(1, 'c', "images/1c.png"));
		tempCards.add(new Card(1, 'd', "images/1d.png"));
		tempCards.add(new Card(1, 'h', "images/1h.png"));
		tempCards.add(new Card(1, 's', "images/1s.png"));
		tempCards.add(new Card(2, 'c', "images/2c.png"));
		tempCards.add(new Card(2, 'd', "images/2d.png"));
		tempCards.add(new Card(2, 'h', "images/2h.png"));
		tempCards.add(new Card(2, 's', "images/2s.png"));
		tempCards.add(new Card(3, 'c', "images/3c.png"));
		tempCards.add(new Card(3, 'd', "images/3d.png"));
		tempCards.add(new Card(3, 'h', "images/3h.png"));
		tempCards.add(new Card(3, 's', "images/3s.png"));
		tempCards.add(new Card(4, 'c', "images/4c.png"));
		tempCards.add(new Card(4, 'd', "images/4d.png"));
		tempCards.add(new Card(4, 'h', "images/4h.png"));
		tempCards.add(new Card(4, 's', "images/4s.png"));
		tempCards.add(new Card(5, 'c', "images/5c.png"));
		tempCards.add(new Card(5, 'd', "images/5d.png"));
		tempCards.add(new Card(5, 'h', "images/5h.png"));
		tempCards.add(new Card(5, 's', "images/5s.png"));
		tempCards.add(new Card(6, 'c', "images/6c.png"));
		tempCards.add(new Card(6, 'd', "images/6d.png"));
		tempCards.add(new Card(6, 'h', "images/6h.png"));
		tempCards.add(new Card(6, 's', "images/6s.png"));
		tempCards.add(new Card(7, 'c', "images/7c.png"));
		tempCards.add(new Card(7, 'd', "images/7d.png"));
		tempCards.add(new Card(7, 'h', "images/7h.png"));
		tempCards.add(new Card(7, 's', "images/7s.png"));
		tempCards.add(new Card(8, 'c', "images/8c.png"));
		tempCards.add(new Card(8, 'd', "images/8d.png"));
		tempCards.add(new Card(8, 'h', "images/8h.png"));
		tempCards.add(new Card(8, 's', "images/8s.png"));
		tempCards.add(new Card(9, 'c', "images/9c.png"));
		tempCards.add(new Card(9, 'd', "images/9d.png"));
		tempCards.add(new Card(9, 'h', "images/9h.png"));
		tempCards.add(new Card(9, 's', "images/9s.png"));
		tempCards.add(new Card(10, 'c', "images/10c.png"));
		tempCards.add(new Card(10, 'd', "images/10d.png"));
		tempCards.add(new Card(10, 'h', "images/10h.png"));
		tempCards.add(new Card(10, 's', "images/10s.png"));
		tempCards.add(new Card(11, 'c', "images/11c.png"));
		tempCards.add(new Card(11, 'd', "images/11d.png"));
		tempCards.add(new Card(11, 'h', "images/11h.png"));
		tempCards.add(new Card(11, 's', "images/11s.png"));
		tempCards.add(new Card(12, 'c', "images/12c.png"));
		tempCards.add(new Card(12, 'd', "images/12d.png"));
		tempCards.add(new Card(12, 'h', "images/12h.png"));
		tempCards.add(new Card(12, 's', "images/12s.png"));
		tempCards.add(new Card(13, 'c', "images/13c.png"));
		tempCards.add(new Card(13, 'd', "images/13d.png"));
		tempCards.add(new Card(13, 'h', "images/13h.png"));
		tempCards.add(new Card(13, 's', "images/13s.png"));
		Collections.shuffle(tempCards);
		return tempCards;
	}
	/**
	 * @return
	 */
	public Card draw()
	{
		if((cards.size()-1)==0)
		{
			return null;
		}
		else
		{
			Card hold = cards.get(cards.size()-1);
			cards.remove(cards.size()-1);
			size--;
			return hold;
			
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Deck [size=" + size + ", cards=" + cards + "]";
	}
	

}
