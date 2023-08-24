import java.util.Scanner;

public class InputManager {
    private final Scanner SCANNER;

    public InputManager() {
        SCANNER = new Scanner(System.in);
    }

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        return SCANNER.nextLine();
    }

    public void close() {
        SCANNER.close();
    }
}
