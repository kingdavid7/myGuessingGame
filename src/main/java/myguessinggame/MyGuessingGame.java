package myguessinggame;

public class MyGuessingGame {
	private int hiddenNumber = 5;
	private int attempts = 0;

	public int getHiddenNumber() {
		// Let do refactor
		return hiddenNumber;
	}

	public int getAttempts() {
		return attempts;
	}

	public String gameResponse(int guess) {
	   if (guess == hiddenNumber) {
		   attempts = 0;
		   return "Guess what!, YOU WIN";
	   }else if (guess < hiddenNumber && attempts < 2) {
		   attempts++; 
	return " That is Too Low";
   }else if(guess > hiddenNumber && attempts < 2){
		attempts++;
		return "That is Too High";
	}else{
		attempts = 0;
	   return "Sorry....Game Over";
    }

}

}
