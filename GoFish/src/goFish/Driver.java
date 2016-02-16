package goFish;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Driver
{
	Deck deck = new Deck();
	Hand playerHand = new Hand(deck.draw(), deck.draw(), deck.draw(),
			deck.draw(), deck.draw(), deck.draw(), deck.draw());
	Hand cpuHand = new Hand(deck.draw(), deck.draw(), deck.draw(), deck.draw(),
			deck.draw(), deck.draw(), deck.draw());
	Jcard card;
	private JFrame frmGoFish;
	private JTextField console;
	private JTextField scoreBoard;

	/**
	 * Launch the application.
	 * 
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException
	{

		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Driver window = new Driver();
					window.frmGoFish.setVisible(true);
					// set window size. may need to increase after size tests.
					// dynamic resizing?
					window.frmGoFish.setSize(920, 730);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 * @throws IOException
	 */
	public Driver() throws IOException
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * 
	 * @throws IOException
	 */
	private void initialize() throws IOException
	{

		frmGoFish = new JFrame();
		frmGoFish.setTitle("Go Fish");
		frmGoFish.setBounds(100, 100, 920, 730);
		frmGoFish.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		frmGoFish.setJMenuBar(menuBar);
		// sets the window icon. Classy
		frmGoFish.setIconImage(new ImageIcon("images/goFish.png").getImage());
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		// console
		console = new JTextField();
		console.setToolTipText("Game console");
		console.setHorizontalAlignment(SwingConstants.LEFT);
		console.setEditable(false);
		menuBar.add(console);
		console.setColumns(10);
		// scoreboard
		scoreBoard = new JTextField();
		scoreBoard.setToolTipText("Scoreboard");
		scoreBoard.setEditable(false);
		scoreBoard.setHorizontalAlignment(SwingConstants.RIGHT);
		menuBar.add(scoreBoard);
		scoreBoard.setColumns(10);
		JMenuItem mntmNew = new JMenuItem("New",1);
		mntmNew.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0)
			{
				// works for now but needs to be replaced
				frmGoFish.getContentPane().removeAll();
				console.setText("New game started");
				try
				{
					// new deck
					deck = new Deck();
				} catch (IOException e)
				{
					System.err
							.println("deck didnt get created right. files are probably awol");
					e.printStackTrace();
				}
				// console.setText("New game started");
				// making the hands new
				playerHand = new Hand(deck.draw(), deck.draw(), deck.draw(),
						deck.draw(), deck.draw(), deck.draw(), deck.draw());
				cpuHand = new Hand(deck.draw(), deck.draw(), deck.draw(), deck
						.draw(), deck.draw(), deck.draw(), deck.draw());
				// resetting the scoreboard
				scoreBoard.setText(" Player: " + playerHand.getScore()
						+ " Computer: " + cpuHand.getScore());
				// adding jcard images
				
				for (int i = 0; i < playerHand.getSize(); i++)
				{

					card = new Jcard(playerHand.getCard(i));
					card.addActionListener(new GoFish(card.getCard()));
					frmGoFish.getContentPane().add(card);
					frmGoFish.validate();

				}
				System.out.println(playerHand);
				System.out.println(cpuHand);

				frmGoFish.repaint();
			}
		});
		mnFile.add(mntmNew);

		JMenuItem mntmQuit = new JMenuItem("Quit");
		mntmQuit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				// system quit without error
				System.exit(0);
			}
		});
		mnFile.add(mntmQuit);
		frmGoFish.getContentPane().setLayout(
				new FlowLayout(FlowLayout.CENTER, 5, 5));

	}
	// onclick stuff for GoFish

	class GoFish extends AbstractAction
	{
		/**
		 * 
		 */
		private static final long serialVersionUID = -6683100952235960169L;
		Card compare;
		public GoFish(Card compare)
		{
			this.compare=compare;
		}
		@Override
		public void actionPerformed(ActionEvent arg0)
		{
			System.out.println(compare);

			frmGoFish.getContentPane().removeAll();
			frmGoFish.getContentPane().repaint();
			Random rand = new Random();
			GameBag gameInfo = new GameBag(compare.getValue(),
					deck, playerHand, cpuHand);
			Object[] gameInfoHold = gameInfo.GoFish();
			deck = (Deck) gameInfoHold[0];
			playerHand = (Hand) gameInfoHold[1];
			cpuHand = (Hand) gameInfoHold[2];
			// need to account for when size == 0 in cpus hand or in player hand
			// win scenario basically 
			gameInfo = new GameBag(cpuHand.getCard(rand.nextInt(cpuHand.getSize())).getValue(),
					deck, cpuHand, playerHand);
			gameInfoHold = gameInfo.GoFish();
			deck = (Deck) gameInfoHold[0];
			cpuHand = (Hand) gameInfoHold[1];
			playerHand = (Hand) gameInfoHold[2];
			for (int i = 0; i < playerHand.getSize(); i++)
			{


				card = new Jcard(playerHand.getCard(i));
				card.addActionListener(new GoFish(card.getCard()));
				frmGoFish.getContentPane().add(card);
				frmGoFish.validate();
			}			
			scoreBoard.setText(" Player: " + playerHand.getScore()
					+ " Computer: " + cpuHand.getScore());
			frmGoFish.getContentPane().repaint();
			if(playerHand.getSize()==0 || cpuHand.getSize()==0)
			{
				JFrame win = new JFrame();
				win.setVisible(true);
				win.setSize(200, 100);
				win.getContentPane().add(new JTextField("Score: Player "+ playerHand.getScore()+ " CPU "+cpuHand.getScore()));
				win.getContentPane().validate();
				win.getContentPane().repaint();
				// this doesnt work, ideally we should reset the game after its done
				frmGoFish.getJMenuBar().getMenu(1).doClick();
			}
			System.out.println("player" + playerHand);
			System.out.println("cpu" + cpuHand);
			System.out.println(deck);
			
		}
		
	}
}
