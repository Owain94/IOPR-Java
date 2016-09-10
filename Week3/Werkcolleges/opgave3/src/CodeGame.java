import java.util.Scanner;

public class CodeGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int code = -1;

        do {
            System.out.println("Speler 1, vul een code in van 2 cijfers:");
            int inp = input.nextInt();

            if (inp > 9 && inp < 100) {
                code = inp;
            }
        } while (code == -1);

        System.out.println("Speler 2 moet nu de code gaan raden!");

        int tries = 1;
        int guess;
        do {
            System.out.println(
                    String.format(
                            "Poging %s:",
                            tries
                    ));
            guess = input.nextInt();

            if (guess < code && guess != -1) {
                System.out.println("Te laag!");
            } else if (guess > code && guess != -1) {
                System.out.println("Te hoog!");
            }

            tries++;
        } while (guess != code && guess != -1);

        if (guess == -1) {
            System.out.println("Het codespel stopt");
        } else {
            System.out.println(
                    String.format(
                            "Speler twee heeft de code geraden in %s beurten!\n",
                            tries -1
                    ));
        }
    }
}
