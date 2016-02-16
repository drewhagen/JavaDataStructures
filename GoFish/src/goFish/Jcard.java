/**
 * 
 */
package goFish;

import java.awt.Image;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author benjaminreul
 *
 */
@SuppressWarnings("serial")
public class Jcard extends JButton{

int value;
Card card;
	/**
	 * 
	 */
	public Jcard() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param icon
	 */
	public Jcard(Icon icon) {
		super(icon);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param text
	 */
	public Jcard(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param a
	 */
	public Jcard(Action a) {
		super(a);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param text
	 * @param icon
	 */
	public Jcard(String text, Icon icon) {
		super(text, icon);
		// TODO Auto-generated constructor stub
	}
	// takes a card in, holds the card image as the icon and keeps the value for comparison later
	public Jcard(Card card)
	{
		super(new ImageIcon( (Image) card.getImage() ));
		this.value = card.getValue();
		this.card = card;

	}
	@Override
	public String toString()
	{
		return "Jcard [value=" + value + "]";
	}
	public Card getCard()
	{
		return this.card;
	}
	public int getValue()
	{
		return this.value;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 
	/*
	 * 	card.addActionListener(new ActionListener()
					{
						int value = card.getValue();

						public void actionPerformed(ActionEvent arg0)
						{
							if (cpuHand.remove(value))
							{
								playerHand.increaseScore();
								scoreBoard.setText(" Player: "
										+ playerHand.getScore() + " Computer: "
										+ cpuHand.getScore());
								playerHand.remove(value);
								System.out.println(playerHand);

							} else
							{
								playerHand.add(deck.draw());
							}
						}
					});
		

	 */

}
