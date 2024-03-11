import java.util.Random;
import java.util.Scanner;


public class GuessTheNumberGame {
    private static final Random random = new Random();
    private int targetNumber;

    private final Player humanPlayer;
    private final Player virtualOpponent;

    public GuessTheNumberGame(Player humanPlayer, Player virtualOpponent) {
        this.humanPlayer = humanPlayer;
        this.virtualOpponent = virtualOpponent;
    }
    public void setTargetNumber(int newTargetNumber) {
        this.targetNumber = newTargetNumber;
    }
    public static void main(String[] args) {
        System.out.print("Ingresa tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        GuessTheNumberGame game = new GuessTheNumberGame(new HumanPlayer(userName), new ComputerPlayer("Oponente virtual"));
        game.startGame();
    }

    public void startGame() {
        setTargetNumber(random.nextInt(10));

        int i;
        for (i = 1; i <= 6; i++) {
            Player currentPlayer = i % 2 == 1 ? humanPlayer : virtualOpponent;
            if (checkGuess(currentPlayer)) {
                break;
            }
        }
    }

    public boolean checkGuess(Player player) {
        System.out.println("Turno de: " + player.getName());
        int guess = player.makeGuess();
        if (guess == targetNumber) {
            System.out.println(" 🥳 Correcto " + player.getName() + ", acertaste el numero es: " + targetNumber);
            System.out.println("Tus intentos fueron " + player.getGuesses().size() + " : " + player.getGuesses());
            return true;
        } else if (guess > targetNumber) {
            System.out.println(guess + " ⬆️ Muy alto, intenta nuevamente");
        } else{
            System.out.println(guess + " ⬇️ Muy bajo, intenta nuevamente");
        }
        return false;
    }
}
