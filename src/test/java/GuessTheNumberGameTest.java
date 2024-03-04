import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class GuessTheNumberGameTest {
@Test
public void testGameWithMockedPlayers() {
    HumanPlayer mockHumanPlayer = Mockito.mock(HumanPlayer.class);
    ComputerPlayer mockComputerPlayer = Mockito.mock(ComputerPlayer.class);
    when(mockHumanPlayer.getName()).thenReturn("JugadorMock");
    when(mockHumanPlayer.makeGuess()).thenReturn(5);
    when(mockComputerPlayer.getName()).thenReturn("OponenteMock");
    when(mockComputerPlayer.makeGuess()).thenReturn(7);
    GuessTheNumberGame game = new GuessTheNumberGame(mockHumanPlayer, mockComputerPlayer);

    game.startGame();

    verify(mockHumanPlayer, times(3)).makeGuess();
    verify(mockComputerPlayer, times(3)).makeGuess();
    assertFalse(game.checkGuess(mockHumanPlayer));
    assertFalse(game.checkGuess(mockComputerPlayer));
}
    @Test
    public void testGameWithMockedPlayersWinner() {
        HumanPlayer mockHumanPlayer = Mockito.mock(HumanPlayer.class);
        ComputerPlayer mockComputerPlayer = Mockito.mock(ComputerPlayer.class);
        when(mockHumanPlayer.getName()).thenReturn("JugadorMock");
        when(mockHumanPlayer.makeGuess()).thenReturn(3);
        when(mockComputerPlayer.getName()).thenReturn("OponenteMock");
        when(mockComputerPlayer.makeGuess()).thenReturn(7);

        GuessTheNumberGame game = new GuessTheNumberGame(mockHumanPlayer, mockComputerPlayer);
        game.startGame();

        verify(mockHumanPlayer, times(3)).makeGuess();
        verify(mockComputerPlayer, times(3)).makeGuess();
        assertTrue(game.checkGuess(mockHumanPlayer));
    }

}
