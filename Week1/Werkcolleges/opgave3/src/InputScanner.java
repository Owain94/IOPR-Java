import java.util.Scanner;

public class InputScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is je naam?\n");
        System.out.println(String.format("Welkom %s!", scanner.nextLine()));
    }
}
