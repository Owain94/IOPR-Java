import java.util.Scanner;

public class CharConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vul een letter in:");
        String charToConvert = input.nextLine();

        String consonants = "";

        // We needed to use a switch otherwise i wouldn't have done this this ugly...
        if (charToConvert.matches("[^aeiouAEIOU]+") && charToConvert.length() == 1) {
            consonants = "y";
        } else if (charToConvert.length() == 1) {
            consonants = "n";
        }

        switch (consonants) {
            case "y":
                System.out.println(String.format("Kleine letter: %s\n" +
                        "Hoofdletter: %s\n" +
                        "Dit is een medeklinker",
                        charToConvert.toLowerCase(),
                        charToConvert.toUpperCase()
                ));
                break;
            case "n":
                System.out.println(String.format("Kleine letter: %s\n" +
                                "Hoofdletter: %s\n" +
                                "Dit is een medeklinker",
                        charToConvert.toLowerCase(),
                        charToConvert.toUpperCase()
                ));
                break;
            default:
                System.out.println("Geen geldige invoer");
                break;
        }
    }
}
