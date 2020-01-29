package myguessinggame;

import java.util.Scanner;

public class MyGuessingGameApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		MyGuessingGame myGame = new MyGuessingGame();
		String play = input.nextLine();
		
		while(play.equals("Y")) {
			System.out.println("Please Enter a guess number");
			int guess = input.nextInt();
			input.nextLine();
			System.out.println(myGame.gameResponse(guess));
			
			System.out.println("I hope you like this game,do you want to play again ,Answer(Y/N)");
			play = input.nextLine();
		}
		System.out.println("Thank You for playing!");
		input.close();
	}

}
