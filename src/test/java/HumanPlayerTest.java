import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {
    String playerName = "Test";
    HumanPlayer humanPlayer = new HumanPlayer(playerName);
    @Test
    public void playerShouldHaveCorrectName() {
        assertEquals(playerName, humanPlayer.getName(), "Debería llamar a la jugadora con el nombre correcto");
    }

    @Test
    public void makeGuessShouldReturnValidNumber() {
        String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int guess = humanPlayer.makeGuess();
        assertTrue(guess >= 0 && guess <= 10, "Debería tener un numero entre 0 y 10");
        System.setIn(System.in);
    }

}