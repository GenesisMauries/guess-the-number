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
        System.out.println(userName + " Adivina el número");
        System.out.println("Elige un número entre 1 y 10,");
        int numberRandom = random.nextInt(10);
        int i;
        for(i=1;;i++){
            Scanner entrada = new Scanner(System.in);
            targetNumber = entrada.nextInt();
            if(numberRandom < targetNumber){
                System.out.println("⬆️ Muy alto, intenta nuevamente");
            }else if(numberRandom > targetNumber){
                System.out.println("⬆⬇️ Muy bajo, intenta nuevamente");
            } else if (numberRandom == targetNumber) {
                System.out.println("🥳 Correcto acertaste en " + i + " intentos");
            }
        }
    }
}