import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    private static Random random = new Random();

    int number, i;

    public static void main(String [] args){
        int numberRandom = random.nextInt(10);
        int targetNumber;
        int number, i;

        System.out.println("Adivina el número");
        System.out.println("Elige un número entre 1 y 10,");

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