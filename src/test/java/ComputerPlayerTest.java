import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {
    String computerName = "Oponente virtual";
    ComputerPlayer computerPlayer = new ComputerPlayer(computerName);
    @Test
    public void computerShouldHaveCorrectName(){
        assertEquals(computerName, computerPlayer.getName(), "Debería llamar a la computadora con el nombre correcto");
    }
    // Pa´revisar 👀
    @Test
    public void makeGuessShouldReturnValidNumber() {
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 0 && guess <= 9, "Guess should be between 0 and 9");
    }



}