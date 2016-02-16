package goFish;

import java.awt.image.BufferedImage;
import java.util.LinkedList;


public class Hand
{
	private int score;
	private int size = 0;
	private LinkedList<Card> handBag = new LinkedList<Card>();
	/**
	 * @param c1
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 * @param c6
	 * @param c7
	 */
	public Hand(Card c1, Card c2, Card c3, Card c4, Card c5, Card c6, Card c7)
	{
		handBag.addFirst(c1);
		handBag.addFirst(c2);
		handBag.addFirst(c3);
		handBag.addFirst(c4);
		handBag.addFirst(c5);
		handBag.addFirst(c6);
		handBag.addFirst(c7);
		this.setSize(7);
		this.score = 0;
	}
	/**
	 * @param c
	 */
	public void add(Card c)
	{
		if(c ==null)
		{
		}
		else
		{
		handBag.addLast(c);
		size++;
		}
	}
	public Card getCard(int pos)
	{
			// need to deal with nulls. shouldnt happen but could
		return handBag.get(pos);
	}
	/**
	 * @param loc
	 * @return
	 */
	public BufferedImage getImage(int loc)
	{
		if(size == 0)
		{
			return null; // we should probably have a null card or something.
		}
		else 
		{
			return(handBag.get(loc-1).getImage());
					
		}
	}
	// score ++ in driver class if true , draw card if false
	/**
	 * @param c
	 * @return
	 */
	public boolean remove(int c)
	{
		for(int i=0;i<this.size;i++)
		{
			Card hold = handBag.get(i);
			if(hold.getValue()==c)
			{
				handBag.remove(hold);
				size--;
				return true;
			}
			
		}
		return false;
	}
	/**
	 * 
	 */
	public void increaseScore()
	{
		this.score++;
	}
	/**
	 * @return
	 */
	public int getScore()
	{
		return this.score;
	}
	/**
	 * @param c1
	 * @param c2
	 * @param c3
	 * @param c4
	 * @param c5
	 * @param c6
	 * @param c7
	 */
	public void reset(Card c1, Card c2, Card c3, Card c4, Card c5, Card c6, Card c7)
	{
		this.score = 0;
		LinkedList<Card> temp = new LinkedList<Card>();
		temp.addFirst(c1);
		temp.addFirst(c2);
		temp.addFirst(c3);
		temp.addFirst(c4);
		temp.addFirst(c5);
		temp.addFirst(c6);
		temp.addFirst(c7);
		this.handBag = temp;
		setSize(0);
	}
	/**
	 * @return
	 */
	public int getSize()
	{
		return size;
	}
	/**
	 * @param size
	 */
	public void setSize(int size)
	{
		this.size = size;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Hand [score=" + score + ", size=" + size + ", handBag="
				+ handBag + "]";
	}
	
}
