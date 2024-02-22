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
        for(i=1;;i++){
            int userGuess = humanPlayer.makeGuess();

            if (userGuess == targetNumber) {
                System.out.println("🥳 Correcto acertaste");
                break;
            }

            checkGuess(humanPlayer, userGuess);

        }
    }

    private static void checkGuess(Player player, int userGuess){
         if(userGuess < targetNumber){
            System.out.println("⬆️ Muy alto, intenta nuevamente");
        }else if(userGuess > targetNumber){
            System.out.println("⬆⬇️ Muy bajo, intenta nuevamente");
        }
    }
}