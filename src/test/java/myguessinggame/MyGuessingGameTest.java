package myguessinggame;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyGuessingGameTest {
	
	//We arrange our object underTest
	MyGuessingGame underTest = new MyGuessingGame();

	@Test
	public void shouldReturn5AsTheHiddenNumber() {
		//We act on that object that with some sort of behavior or method of job that we need to do
		int checkValue = underTest.getHiddenNumber();
		//Assert we expect 5 as a value (here we expect our test to fail because we expect 5 but was of return 0)
		assertEquals(5, checkValue);
	}
	
	@Test
	public void  shouldReturnYouWinWhenMyGuessIs5() {
		String response = underTest.gameResponse(5);
		assertEquals("Guess what!, YOU WIN", response);
	}
	
	@Test
	public void shouldReturnTooLowWhenGuessIsBelow5() {
		String response = underTest.gameResponse(4);
		assertEquals("Sorry I've to tell you this: ...You Lose", response);
		
	}
	
	@Test
	public void shouldReturnTooHighWhenGuessIsAbove5() {
		String response = underTest.gameResponse(6);
		assertEquals("Your guess is Too High", response);
}
	
	@Test
	public void attemptsShouldStartAt0() {
		int attempts =underTest.getAttempts();
		assertEquals(0, attempts);
}
	
	@Test
	public void attemptsShouldIncreaseTo1AfterIncorrectLowGuess() {
		String guess = underTest.gameResponse(4);
		int attempts = underTest.getAttempts();
		assertEquals(1, attempts);
	}
	
	@Test
	public void attemptsShouldIncreaseTo2AterLowAndHighGuesses() {
		String guess1 = underTest.gameResponse(4);
		String guess2 = underTest.gameResponse(6);
		int attempts = underTest.getAttempts();
		assertEquals(2, attempts);
	}
	
	@Test
	public void shouldSayGameOverWith3IncorrectLowGuesses() {
		String guess1 = underTest.gameResponse(4);
		String guess2 = underTest.gameResponse(4);
		String guess3 = underTest.gameResponse(4);
		assertEquals("Sorry to Tell you this...GAME OVER2", guess3);	
	}
	
	@Test
	public void shouldSayGameOverWith3IncorrectHighGuesses() {
		String guess1 = underTest.gameResponse(6);
		String guess2 = underTest.gameResponse(6);
		String guess3 = underTest.gameResponse(6);
		assertEquals("Sorry to Tell you this...GAME OVER2", guess3);
}
	@Test
	public void shouldResertAttemptsWhenWon() {
		String guess1 = underTest.gameResponse(4);
		String guess2 = underTest.gameResponse(5);
		int attempts = underTest.getAttempts();
		assertEquals(0, attempts);	
	}
	
	@Test
	public void shouldSayGameOverWith3IncorrectGuesses() {
		String guess1 = underTest.gameResponse(6);
		String guess2 = underTest.gameResponse(6);
		String guess3 = underTest.gameResponse(2);
		int attempts = underTest.getAttempts();
		assertEquals(0, attempts);
		}
}