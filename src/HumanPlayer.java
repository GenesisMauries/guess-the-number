import java.util.Scanner;
public class HumanPlayer extends Player {
    public HumanPlayer(String name) {
        super(name);
    }

    @Override
    public int makeGuess() {
        System.out.println("Elige un número entre 1 y 10,");
        Scanner userNumber = new Scanner(System.in);
        guesses.add(userNumber.nextInt());
        return userNumber.nextInt();
    }
}