import java.util.List;
import java.util.ArrayList;
public abstract class Player{
    private String name;
    public List<Integer> guesses;

    public Player(String name) {
        this.name = name;
        this.guesses = new ArrayList<>();
    }

    public abstract int makeGuess();

    public String getName() {
        return this.name;
    }

    public List<Integer> getGuesses() {
        return guesses;
    }
}