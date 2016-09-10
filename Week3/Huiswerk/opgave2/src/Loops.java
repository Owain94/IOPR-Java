import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Uit hoveel woorden moet de zin bestaan?\n");
        int amountOfWords = input.nextInt();

        String sentence = "";

        for (int i = 0; i < amountOfWords; i++) {
            System.out.print(
                    String.format(
                            "Woord %s:\n",
                            i + 1
                    ));

            sentence += input.next() + " ";
        }

        System.out.print(
                String.format(
                        "De zin is geworden:\n%s.",
                        sentence.trim()
                ));
    }
}
