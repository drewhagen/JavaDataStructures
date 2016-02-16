package goFish;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.*;

public class Card {

	private int value;
	private char suit;
	private BufferedImage image;

	/**
	 * @param value
	 * @param suit
	 * @param path
	 * @throws IOException
	 */
	public Card(int value, char suit, String path) throws IOException { 
		this.value = value;
		this.suit = suit;
		File f = new File(path);
		if(f.exists())
		{
		this.image = ImageIO.read(f);
		}
		else
		{
			System.out.println("wtf it doesnt exist");
		}

	}
	
	/**
	 * @return
	 */
	public int getValue() {
		return this.value;
	}
	
	/**
	 * @return
	 */
	public char getSuit() {
		return this.suit;
	}
	/**
	 * @return
	 */
	public BufferedImage getImage()
	{
		return this.image;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Card [value=" + value + "]";

	}
	
}