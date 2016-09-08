import java.util.Scanner;

public class Betaaloverzicht {
    private static final double priceApple = 0.50;
    private static final double pricePear = 0.70;
    private static final double pricePotato = 0.65;
    private static final int amountOfTax = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Wat is je naam?\n");
        String name = scanner.nextLine();
        System.out.println(
                String.format(
                        "\nDe BTW is: %s%%\n",
                        amountOfTax
                ));

        System.out.println(
                String.format(
                        "De verkoopprijs van een appel is: %s\n" +
                                "Hoeveel appels wilt u kopen?",
                        productPrice(1, priceApple)
                ));

        int amountOfApples = scanner.nextInt();

        System.out.println(
                String.format(
                        "\nDe verkoopprijs van een peer is: %s\n" +
                                "Hoeveel peren wilt u kopen?",
                        productPrice(1, pricePear)
                ));

        int amountOfPears = scanner.nextInt();

        System.out.println(
                String.format(
                        "\nDe verkoopprijs van een aardappel is: %s\n" +
                                "Hoeveel aardappels wilt u kopen?",
                        productPrice(1, pricePotato)
                ));

        int amountOfpotatos = scanner.nextInt();


        System.out.println(
                String.format(
                        "\nBeste %s,\n\n" +
                                "Hieronder volgt het betaaloverzicht:\n" +
                                "====================================\n",
                        name
                ));

        System.out.println(
                String.format(
                        "Aantal appels: %13s\n" +
                                "Totaal kostprijs: %10.2f\n" +
                                "Totaal BTW: %16.2f\n" +
                                "Subtotaal omzet: %11.2f\n",
                        amountOfApples,
                        productPrice(amountOfApples, priceApple, false),
                        productPrice(amountOfApples, priceApple) - productPrice(amountOfApples, priceApple, false),
                        productPrice(amountOfApples, priceApple)
                ));

        System.out.println(
                String.format(
                        "Aantal peren: %14s\n" +
                                "Totaal kostprijs: %10.2f\n" +
                                "Totaal BTW: %16.2f\n" +
                                "Subtotaal omzet: %11.2f\n",
                        amountOfApples,
                        productPrice(amountOfPears, pricePear, false),
                        productPrice(amountOfPears, pricePear) - productPrice(amountOfPears, pricePear, false),
                        productPrice(amountOfPears, pricePear)
                ));

        System.out.println(
                String.format(
                        "Aantal aardappels: %9s\n" +
                                "Totaal kostprijs: %10.2f\n" +
                                "Totaal BTW: %16.2f\n" +
                                "Subtotaal omzet: %11.2f\n",
                        amountOfApples,
                        productPrice(amountOfpotatos, pricePotato, false),
                        productPrice(amountOfpotatos, pricePotato) - productPrice(amountOfpotatos, pricePotato, false),
                        productPrice(amountOfpotatos, pricePotato)
                ));

        System.out.println(
                String.format(
                        "Totale omzet incl. BTW: %.2f\n" +
                                "Totale BTW: %16.2f",
                        productPrice(amountOfApples, pricePotato) + productPrice(amountOfPears, pricePotato) + productPrice(amountOfpotatos, pricePotato),
                        (productPrice(amountOfApples, pricePotato) + productPrice(amountOfPears, pricePotato) + productPrice(amountOfpotatos, pricePotato)) - (productPrice(amountOfApples, pricePotato, false) + productPrice(amountOfPears, pricePotato, false) + productPrice(amountOfpotatos, pricePotato, false))
                ));
    }

    private static double productPrice(int amount, double price, boolean tax) {
        if (tax) {
            return price * amount * Double.parseDouble(String.format("1.%d", amountOfTax));
        }
        return price * amount;
    }

    private static double productPrice(int amount, double price) {
        return productPrice(amount, price, true);
    }
}
