import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class PlayerTest {
    @Test
    public void playerClassShouldBeAbstract() {
        assertTrue(Modifier.isAbstract(Player.class.getModifiers()), "Player es una clase abstracta");
    }
    @Test
    public void playerShouldBeConstructedWithCorrectName(){
        ComputerPlayer computerPlayer = new ComputerPlayer("TestHumanPlayer");
        int guess = computerPlayer.makeGuess();
        assertTrue(guess >= 1 && guess <= 10, "HumanPlayer implementa makeGuess");
    }

    @Test
    public void makeGuessMethodShouldExist() throws NoSuchMethodException {
        try {
            Method makeGuessMethod = Player.class.getDeclaredMethod("makeGuess");
            assertNotNull(makeGuessMethod, "makeGuess method should exist");
        } catch (NoSuchMethodException e) {
            fail("makeGuess method should exist");
        }
    }

}

