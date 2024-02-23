import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static Random random = new Random();
    private static int targetNumber;

    public static void main(String [] args){
        System.out.print("Ingresa tu nombre: ⌨️ ");
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
            System.out.println("Turno de: " + currentPlayer);
            int guess = currentPlayer.makeGuess();
            checkGuess(currentPlayer, guess);

            if (guess == targetNumber) {
                System.out.println(" 🥳 Correcto " + currentPlayer.getName() + ", acertaste el numero es: " + targetNumber);
                break;
            }
        }
    }
    private static void checkGuess(Player player, int userGuess) {
        if (userGuess > targetNumber) {
            System.out.println(userGuess + " ⬆️ Muy alto, intenta nuevamente");
        } else if(userGuess < targetNumber) {
            System.out.println(userGuess + " ⬇️ Muy bajo, intenta nuevamente");
        }
    }

}