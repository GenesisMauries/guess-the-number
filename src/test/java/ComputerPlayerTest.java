import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ComputerPlayerTest {
    String computerName = "Oponente virtual";
    ComputerPlayer computerPlayer = new ComputerPlayer(computerName);

    @Test
    public void computerPlayerShouldInheritFromPlayer() {
        assertTrue(Player.class.isAssignableFrom(ComputerPlayer.class), "ComputerPlayer hereda Player");
    }
    @Test
    public void computerShouldHaveCorrectName(){
        assertEquals(computerName, computerPlayer.getName(), "Debería llamar a la computadora con el nombre correcto");
    }
    // Pa´revisar 👀 ejemplos que usan mockito perooo inyectan random en el constructor
    @Test
    public void makeGuessShouldReturnValidNumber() {
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 0 && guess <= 9, "Debería ser un numero entre 0 y 10");
    }
    @Test
    public void testMakeGuessReturnsRandomNumberBetween1And10() {
        ComputerPlayer player = new ComputerPlayer("Oponente virtual");
        for (int i = 0; i < 50; i++) {
            int randomNumber = player.makeGuess();
            assertTrue(randomNumber >= 0 && randomNumber <= 10);
        }
    }
}