import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.sun.jdi.event.EventQueue;

public class CardWarGame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardWarGame window = new CardWarGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
    static int[] card_value = new int[52] ;
    static int counter = 0;
    String result = "";
    int deal = 0;
    
  //Declaration of the score1 and score2 variables
	
	int score1 = 0;
	int score2 = 0;
	private JTextField instructionLabel1;
    
	public static void FillDeck() {

    	// A boolean to check if the value exists
    	Boolean existing = false;
    	
    	// Generating a random number in the range of 1 to 53.
    	Random rand =  new Random();
    	
    	// Loop to check the existence of the random value in the array card_value
    	
    	for (int j = 0; j < 52;) {
    		existing = false;
    		
    		
    		int randNumber = rand.nextInt(53);
    		
    		for (int i = 0; i < j; i++) {
    			if(card_value [i] == randNumber ) {
    				existing = true;
    				
    				i = j + 1;
    			}
    		}
    		if(!existing) {
    			card_value[j] =  randNumber;
    			
    			j++;
    		}
    	}
    	
    	
    }
	/**
	 * Create the application.
	 */
	public CardWarGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextPane dealLabel = new JTextPane();
		dealLabel.setBounds(95, 119, 227, 40);
		frame.getContentPane().add(dealLabel);
		
		JTextPane instructionLabel = new JTextPane();
		instructionLabel.setBounds(135, 11, 187, 23);
		frame.getContentPane().add(instructionLabel);
		
		
		JTextPane finalResult = new JTextPane();
		finalResult.setBounds(103, 195, 219, 40);
		frame.getContentPane().add(finalResult);
		
		JButton playButton_1 = new JButton("Play");
		playButton_1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int player = 0;
		    	if (deal % 4 == 0) {
		    		result = "";
		    		result += "Deal #" + (deal + 1);
		    	}
		    	int computer = 0;
		    	if (deal < 26) {
		    		computer = SelectCard();
		    
		    	}
		    	switch (computer) {
		    	case 52:
		    		result += " Computer has King" + " of Hearts.";
		    		computer = 13;
		    		break;
		    		
		    	case 51: result +=

		    		" Computer has King"

		    		+ " of Clubs.";

		    		computer = 13;

		    		break;

		    	case 50: result +=

		    		" Computer has King"

		    		+ " of Diamonds.";

		    		computer = 13;

		    		break;

		    	case 49: result +=

		    		" Computer has King"

		    		+ " of Spades.";

		    		computer = 13;

		    		break;

		    	case 48: result +=

		    		" Computer has Queen"

		    		+ " of Hearts.";

		    		computer = 12;

		    		break;

		    	case 47: result +=

		    		" Computer has Queen"

		    		+ " of Clubs.";

		    		computer = 12;

		    		break;

		    	case 46: result +=

		    		" Computer has Queen"

		    		+ " of Diamonds.";

		    		computer = 12;

		    		break;

		    	case 45: result +=

		    		" Computer has Queen"

		    		+ " of Spades.";

		    		computer = 12;

		    		break;
		    		
		    	case 44: result +=

		    		" Computer has Jack"

		    		+ " of Hearts.";

		    		computer = 11;

		    		break;

		    	case 43: result +=

		    		" Computer has Jack"

		    		+ " of Clubs.";

		    		computer = 11;

		    		break;

		    	case 42: result +=

		    		" Computer has Jack"

		    		+ " of Diamonds.";

		    		computer = 11;

		    		break;

		    	case 41: result +=

		    		" Computer has Jack"

		    		+ " of Spades.";

		    		computer = 11;

		    		break;

		    	case 40: result +=

		    		" Computer has 10"

		    		+ " of Hearts.";

		    		computer = 10;

		    		break;

		    	case 39: result +=

		    		" Computer has 10"

		    		+ " of Clubs.";

		    		computer = 10;

		    		break;

		    	case 38: result +=

		    		" Computer has 10"

		    		+ " of Diamonds.";

		    		computer = 10;

		    		break;

		    	case 37: result +=

		    		" Computer has 10"

		    		+ " of Spades.";

		    		computer = 10;

		    		break;

		    	case 36: result +=

		    		" Computer has 9"

		    		+ " of Hearts.";

		    		computer = 9;

		    		break;
		    		
		    	case 35: result +=

		    		" Computer has 9"

		    		+ " of Clubs.";

		    		computer = 9;

		    		break;

		    	case 34: result +=

		    		" Computer has 9"

		    		+ " of Diamonds.";

		    		computer = 9;

		    		break;

		    	case 33: result +=

		    		" Computer has 9"

		    		+ " of Spades.";

		    		computer = 9;

		    		break;

		    	case 32: result +=

		    		" Computer has 8"

		    		+ " of Hearts.";

		    		computer = 8;
		    		break;
		    		
		    	case 31: result +=

		    		" Computer has 8"

		    		+ " of Clubs.";

		    		computer = 8;

		    		break;

		    	case 30: result +=

		    		" Computer has 8"

		    		+ " of Diamonds.";

		    		computer = 8;

		    		break;

		    	case 29: result +=

		    		" Computer has 8"

		    		+ " of Spades.";

		    		computer = 8;

		    		break;

		    	case 28: result +=

		    		" Computer has 7"

		    		+ " of Hearts.";

		    		computer = 7;

		    		break;

		    	case 27: result +=

		    		" Computer has 7"

		    		+ " of Clubs.";

		    		computer = 7;

		    		break;
		    		
		    	case 26: result +=

		    		" Computer has 7"

		    		+ " of Diamonds.";

		    		computer = 7;

		    		break;

		    	case 25: result +=

		    		" Computer has 7"

		    		+ " of Spades.";

		    		computer = 7;

		    		break;

		    	case 24: result +=

		    		" Computer has 6"

		    		+ " of Hearts.";

		    		computer = 6;

		    		break;

		    	case 23: result += " Computer has 6"

		    		+ " of Clubs.";

		    		computer = 6;

		    		break;

		    	case 22: result += " Computer has 6"

		    		+ " of Diamonds.";

		    		computer = 6;

		    		break;

		    	case 21: result += " Computer has 6"

		    		+ " of Spades.";

		    		computer = 6;

		    		break;

		    	case 20: result +=

		    		" Computer has 5"

		    		+ " of Hearts.";

		    		computer = 5;

		    		break;

		    	case 19: result +=

		    		" Computer has 5"

		    		+ " of Clubs.";

		    		computer = 5;

		    		break;

		    	case 18: result +=

		    		" Computer has 5"

		    		+ " of Diamonds.";

		    		computer = 5;

		    		break;

		    	case 17: result +=
		    				
		    		" Computer has 5"

		    		+ " of Spades.";

		    		computer = 5;

		    		break;

		    	case 16: result +=

		    		" Computer has 4"

		    		+ " of Hearts.";

		    		computer = 4;

		    		break;

		    	case 15: result +=

		    		" Computer has 4"

		    		+ " of Clubs.";

		    		computer = 4;

		    		break;

		    	case 14: result +=

		    		" Computer has 4"

		    		+ " of Diamonds.";

		    		computer = 4;

		    		break;

		    	case 13: result +=

		    		" Computer has 4"

		    		+ " of Spades.";

		    		computer = 4;

		    		break;

		    	case 12: result +=

		    		" Computer has 3"

		    		+ " of Hearts.";

		    		computer = 3;

		    		break;

		    	case 11: result +=

		    		" Computer has 3"

		    		+ " of Clubs.";
		    		computer = 3;

		    		break;

		    	case 10: result +=

		    		" Computer has 3"

		    		+ " of Diamonds.";

		    		computer = 3;

		    		break;

		    	case 9: result +=

		    		" Computer has 3"

		    		+ " of Spades.";

		    		computer = 3;

		    		break;

		    	case 8: result += " Computer has 2"

		    		+ " of Hearts.";

		    		computer = 2;

		    		break;

		    	case 7: result +=

		    		" Computer has 2"

		    		+ " of Clubs.";

		    		computer = 2;

		    		break;

		    	case 6: result += " Computer has 2"

		    		+ " of Diamonds.";

		    		computer = 2;

		    		break;

		    	case 5: result += " Computer has 2"

		    		+ " of Spades.";

		    		computer = 2;

		    		break;

		    	case 4: result += " Computer has Ace"

		    		+ " of Hearts.";

		    		computer = 1;

		    		break;

		    	case 3: result += " Computer has Ace"

		    		+ " of Clubs.";

		    		computer = 1;

		    		break;

		    	case 2: result += " Computer has Ace"

		    		+ " of Diamonds.";

		    		computer = 1;

		    		break;

		    	case 1: result += " Computer has Ace"

		    		+ " of Spades.";

		    		computer = 1;

		    		break;

		 
		    	}
		    	
		    	switch (player) {
		    	
		    	case 52:

		    		result += " Player has King"

		    		+ " of Hearts.";

		    		player = 13;

		    		break;

		    	case 51: result += " Player has King"

		    		+ " of Clubs.";

		    		player = 13;

		    		break;

		    	case 50: result += " Player has King"

		    		+ " of Diamonds.";

		    		player = 13;

		    		break;

		    	case 49: result += " Player has King"

		    		+ " of Spades.";

		    		player = 13;

		    		break;

		    	case 48: result += " Player has Queen"

		    		+ " of Hearts.";

		    		player = 12;

		    		break;

		    	case 47: result += " Player has Queen"

		    		+ " of Clubs.";

		    		player = 12;

		    		break;

		    	case 46: result += " Player has Queen"

		    		+ " of Diamonds.";

		    		player = 12;

		    		break;

		    	case 45: result += " Player has Queen"

		    		+ " of Spades.";

		    		player = 12;

		    		break;

		    	case 44: result += " Player has Jack"

		    		+ " of Hearts.";

		    		player = 11;

		    		break;

		    	case 43: result += " Player has Jack"

		    		+ " of Clubs.";

		    		player = 11;

		    		break;

		    	case 42: result += " Player has Jack"

		    		+ " of Diamonds.";

		    		player = 11;

		    		break;

		    	case 41: result += " Player has Jack"

		    		+ " of Spades.";

		    		player = 11;

		    		break;

		    		
		    	case 40: result += " Player has 10"
		    		+ " of Hearts.";

		    		player = 10;

		    		break;

		    	case 39: result += " Player has 10"

		    		+ " of Clubs.";

		    		player = 10;

		    		break;

		    	case 38: result += " Player has 10"

		    		+ " of Diamonds.";

		    		player = 10;

		    		break;

		    	case 37: result += " Player has 10"

		    		+ " of Spades.";

		    		player = 10;

		    		break;

		    	case 36: result += " Player has 9"

		    		+ " of Hearts.";

		    		player = 9;

		    		break;

		    	case 35: result += " Player has 9"

		    		+ " of Clubs.";

		    		player = 9;

		    		break;

		    	case 34: result += " Player has 9"

		    		+ " of Diamonds.";

		    		player = 9;

		    		break;

		    	case 33: result += " Player has 9"

		    		+ " of Spades.";

		    		player = 9;

		    		break;

		    	case 32: result += " Player has 8"

		    		+ " of Hearts.";

		    		player = 8;

		    		break;

		    	case 31: result += " Player has 8"

		    		+ " of Clubs.";

		    		player = 8;

		    		break;

		    	case 30: result += " Player has 8"

		    		+ " of Diamonds.";

		    		player = 8;

		    		break;

		    	case 29: result += " Player has 8"

		    		+ " of Spades.";

		    		player = 8;

		    		break;

		    	case 28: result += " Player has 7"

		    		+ " of Hearts.";

		    		player = 7;

		    		break;

		    	case 27: result += " Player has 7"

		    		+ " of Clubs.";

		    		player = 7;

		    		break;

		    	case 26: result += " Player has 7"

		    		+ " of Diamonds.";

		    		player = 7;

		    		break;
		    		
		    	case 25: result += " Player has 7"

		    		+ " of Spades.";

		    		player = 7;

		    		break;

		    	case 24: result += " Player has 6"

		    		+ " of Hearts.";

		    		player = 6;

		    		break;

		    	case 23: result += " Player has 6"

		    		+ " of Clubs.";

		    		player = 6;

		    		break;

		    	case 22: result += " Player has 6"

		    		+ " of Diamonds.";

		    		player = 6;

		    		break;

		    	case 21: result += " Player has 6"

		    		+ " of Spades.";

		    		player = 6;

		    		break;

		    	case 20: result += " Player has 5"

		    		+ " of Hearts.";

		    		player = 5;

		    		break;

		    	case 19: result += " Player has 5"

		    		+ " of Clubs.";

		    		player = 5;

		    		break;

		    	case 18: result += " Player has 5"

		    		+ " of Diamonds.";

		    		player = 5;

		    		break;

		    	case 17: result += " Player has 5"
		    				
		    		+ " of Spades.";

		    		player = 5;

		    		break;

		    	case 16: result += " Player has 4"

		    		+ " of Hearts.";

		    		player = 4;

		    		break;
		    		
		    	case 15: result += " Player has 4"
		    		+ " of Clubs.";

		    		player = 4;

		    		break;

		    	case 14: result += " Player has 4"

		    		+ " of Diamonds.";

		    		player = 4;

		    		break;

		    	case 13: result += " Player has 4"

		    		+ " of Spades.";

		    		player = 4;

		    		break;

		    	case 12: result += " Player has 3"

		    		+ " of Hearts.";

		    		player = 3;

		    		break;

		    	case 11: result += " Player has 3"

		    		+ " of Clubs.";

		    		player = 3;

		    		break;

		    	case 10: result += " Player has 3"

		    		+ " of Diamonds.";

		    		player = 3;

		    		break;

		    	case 9: result += " Player has 3"

		    		+ " of Spades.";

		    		player = 3;

		    		break;

		    	case 8: result += " Player has 2"

		    		+ " of Hearts.";

		    		player = 2;

		    		break;
		    		
		    	case 7: result += " Player has 2"

		    		+ " of Clubs.";

		    		player = 2;

		    		break;

		    	case 6: result += " Player has 2"

		    		+ " of Diamonds.";

		    		player = 2;

		    		break;

		    	case 5: result += " Player has 2"

		    		+ " of Spades.";

		    		player = 2;

		    		break;

		    	case 4: result += " Player has Ace"

		    		+ " of Hearts.";

		    		player = 1;

		    		break;

		    	case 3: result += " Player has Ace"

		    		+ " of Clubs.";

		    		player = 1;

		    		break;

		    	case 2: result += " Player has Ace"

		    		+ " of Diamonds.";

		    		player = 1;

		    		break;

		    	case 1: result += " Player has Ace"

		    		+ " of Spades.";

		    		player = 1;

		    		break;
		    	
		    	}

					player = SelectCard();

					if(player > computer) {
						score1 = score1 + 2;
						result += "\n" + " Computer score is" +score2 + ".Player score is" +score1 + "\n";
						dealLabel.setText(result);
				}
					else if (player<computer) {
						
						score2 += 2;
						result += "\n"+" Computer score is " + score2 + ". Player score is " + score1 + "\n";
						dealLabel.setText(result);
						deal++;
					}else {
						instructionLabel.setText("Game Over!");
						
						
					}
					//deal++;
					
					if(score2 < score1) {
						finalResult.setText("Computer won");
					}
					else if(score2 <score1) {
						finalResult.setText("Player won");
					}
					else {
						finalResult.setText("Tie");
					}
			}
		});
		playButton_1.setBounds(66, 63, 89, 23);
		frame.getContentPane().add(playButton_1);
		

		
		JButton dealButton = new JButton("Deal");
		dealButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FillDeck();
		    	
		    	instructionLabel.setText("Click to play ");
		    	
			}
		});
		dealButton.setBounds(296, 63, 89, 23);
		frame.getContentPane().add(dealButton);
		
	
		
	}
	 public static int SelectCard() {
	    	return card_value[counter ++];
	    }
	}


