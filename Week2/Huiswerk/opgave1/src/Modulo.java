import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Voer een getal in:\n");
        int bigNumber = input.nextInt();

        System.out.println("Voer nu twee kleineren getallen in.\n" +
                "1e kleinere getal:\n");
        int smallNumberOne = input.nextInt();

        System.out.print("2e kleinere getal:\n");
        int smallNumberTwo = input.nextInt();

        if (bigNumber % smallNumberOne == 0 && bigNumber % smallNumberTwo == 0)
        {
            System.out.println(String.format("%s is deelbaar door %s en %s",
                    bigNumber,
                    smallNumberOne,
                    smallNumberTwo
            ));
        }
        else if (bigNumber % smallNumberOne == 0 && bigNumber % smallNumberTwo != 0)
        {
            System.out.println(String.format("%s is deelbaar door %s en niet door %s",
                    bigNumber,
                    smallNumberOne,
                    smallNumberTwo
            ));

        }
        else if (bigNumber % smallNumberOne != 0 && bigNumber % smallNumberTwo == 0)
        {
            System.out.println(String.format("%s is deelbaar door %s en niet door %s",
                    bigNumber,
                    smallNumberTwo,
                    smallNumberOne
            ));
        }
        else
        {
            System.out.println(String.format("%s is niet deelbaar door %s en %s",
                    bigNumber,
                    smallNumberOne,
                    smallNumberTwo
            ));
        }
    }
}
