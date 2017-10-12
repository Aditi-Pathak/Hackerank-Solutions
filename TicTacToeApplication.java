import java.util.Scanner;

public class TicTacToeApplication 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//Allows continuing the game
		boolean doYouWantToPlay = true;
		while(doYouWantToPlay)
		{
			System.out.println("Welcome to Tic Tac Toe..ready for the game?\nBUT FIRST pick the character you want to be"
					+ "and which character I will be");
			System.out.println();
			System.out.println("Enter a single character that will represent you on the board!!");
			char playerToken = sc.next().charAt(0);
			System.out.println("Enter a single character that will represent your opponents on the board");
			char opponentToken = sc.next().charAt(0);
			
			TicTacToe game = new TicTacToe(playerToken, opponentToken);
			AI ai = new AI();
			
			//Set up the game
			System.out.println();
			System.out.println("Let's Start the Game.To play please enter a number and your token/nshall be put in this place./n"
					+ "The number goes from 1-9 left to right.");
			TicTacToe.printIndexBoard();
			System.out.println();
			
			while(game.gameOver().equals("Not over"))
			{
				if(game.currentMarker == game.userMarker)
				{
					System.out.println("It's your turn user!! Play and don't be a loser!! Enter your spot");
					int spot = sc.nextInt();
					while(!game.playTurn(spot))
					{
						System.out.println("Try again. "+ spot + "is Invalid or is already taken");
						spot = sc.nextInt();
					}
					
					System.out.println("You picked "+spot+"!");
				}
				else
				{
					System.out.println("It's my turn!");
					//AI Pick spot
					int aiSpot = ai.pickSpot(game);
					game.playTurn(aiSpot);
					System.out.println("I picked "+aiSpot+"!");
				}
				//Print out the board
				System.out.println();
				game.printBoard();
			}
			System.out.println(game.gameOver());
			System.out.println();
			//set up a new game
			System.out.println("Do you want to play again? Please enter Y for yes and press any other key to exit the game!!");
			
			char response = sc.next().charAt(0);
			doYouWantToPlay = (response == 'Y');
			System.out.println();
			System.out.println();
			
		}
		sc.close();
		
	}

}
