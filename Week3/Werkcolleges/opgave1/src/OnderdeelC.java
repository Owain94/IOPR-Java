import java.util.Scanner;

public class OnderdeelC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Van welk getal tussen de 1 en 100 wil je de tafel zien?\n");
        int number = input.nextInt();

        if (number > 1 && number < 100) {
            int i = 1;
            do {
                System.out.print(
                        String.format(
                                "%s x %s = %s\n",
                                i,
                                number,
                                i * number
                        ));

                i++;
            } while (i <= 10);
        } else {
            System.out.print("Dit getal mag niet.");
        }
    }
}
