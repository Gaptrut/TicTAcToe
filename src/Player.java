import java.util.Scanner;
public class Player {
    public int getMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Place Your symbol? (1-9)");
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }


}