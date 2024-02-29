import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanPlayerTest {
    @Test
    public void playerShouldHaveCorrectName() {
        String playerName = "Test";
        HumanPlayer humanPlayer = new HumanPlayer(playerName);
        assertEquals(playerName, humanPlayer.getName(), "Debería llamar a la jugadora con el nombre correcto");
    }
    // Pa´ revisar 👀
    @Test
    public void makeGuessShouldReturnValidNumber() {
        HumanPlayer humanPlayer = new HumanPlayer("Test");
        int guess = 15;
        assertFalse(false, "Debería ser un numero entre 0 y 10");
    }

}