import java.util.Random;
public class ComputerPlayer extends Player{
    private Random random;

    public ComputerPlayer(String name) {
        super(name);
        this.random = new Random();
    }

    public String getName() {
        return "Oponente virtual";
    }

    @Override
    public int makeGuess() {
        int computerNumber = random.nextInt(10);
        guesses.add(computerNumber);
        return computerNumber;
    }
}