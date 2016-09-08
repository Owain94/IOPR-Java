import java.util.Scanner;

public class CharConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vul een letter in:");
        String charToConvert = input.nextLine();

        String consonant = "";

        // We needed to use a switch otherwise i wouldn't have done this this ugly...
        if (charToConvert.length() == 1 && Character.isAlphabetic(charToConvert.charAt(0)) &&  charToConvert.toLowerCase().matches("[^aeiouAEIOU]+")) {
            consonant = "y";
        } else if (charToConvert.length() == 1 && Character.isAlphabetic(charToConvert.charAt(0)) ) {
            consonant = "n";
        }

        switch (consonant) {
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
                                "Dit is een klinker",
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
