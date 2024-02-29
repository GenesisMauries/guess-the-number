import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static final Random random = new Random();
    private static int targetNumber;

    public static void main(String [] args){
        System.out.print("Ingresa tu nombre: ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        startGame(userName);
    }

    private static void startGame(String userName) {
        HumanPlayer humanPlayer = new HumanPlayer(userName);
        ComputerPlayer virtualOpponent = new ComputerPlayer("Oponente virtual");
        targetNumber = random.nextInt(10);

        int i;
        for (i = 1; i <= 6; i++) {
            Player currentPlayer = i % 2 == 1 ? humanPlayer : virtualOpponent;
            if(checkGuess(currentPlayer)){
                break;
            }
        }
    }
    private static boolean checkGuess(Player player) {
        System.out.println("Turno de: " + player);
        int guess = player.makeGuess();
        if(guess == targetNumber) {
            System.out.println(" 🥳 Correcto " + player.getName() + ", acertaste el numero es: " + targetNumber);
            return true;
        }
        else if (guess > targetNumber) {
            System.out.println(guess + " ⬆️ Muy alto, intenta nuevamente");
        } else if(guess < targetNumber) {
            System.out.println(guess + " ⬇️ Muy bajo, intenta nuevamente");
        }
        return false;
    }

}