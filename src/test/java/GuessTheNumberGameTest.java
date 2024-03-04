import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.times;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.mockito.Mockito.when;

public class GuessTheNumberGameTest {
@Test
public void testGameWithMockedPlayers() {
    int targetNumber = 3;
    HumanPlayer mockHumanPlayer = Mockito.mock(HumanPlayer.class);
    ComputerPlayer mockComputerPlayer = Mockito.mock(ComputerPlayer.class);
    when(mockHumanPlayer.getName()).thenReturn("JugadorMock");
    when(mockHumanPlayer.makeGuess()).thenReturn(5);
    when(mockComputerPlayer.getName()).thenReturn("OponenteMock");
    when(mockComputerPlayer.makeGuess()).thenReturn(7);
    GuessTheNumberGame game = new GuessTheNumberGame(mockHumanPlayer, mockComputerPlayer);

    game.startGame();

    Mockito.verify(mockHumanPlayer, times(3)).makeGuess();
    Mockito.verify(mockComputerPlayer, times(3)).makeGuess();
    assertFalse(game.checkGuess(mockHumanPlayer));
}

}
