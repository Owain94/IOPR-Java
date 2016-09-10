import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnderdeelA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vul het eerste jaartal in:\n");
        int firstYear = input.nextInt();
        System.out.print("Vul het tweede getal in:\n");
        int secondYear = input.nextInt();

        if (firstYear < secondYear) {
            List<Integer> leapYears = new ArrayList<>();
            for (int i = firstYear + 1; i < secondYear; i++) {
                if (i % 4 == 0) {
                    leapYears.add(i);
                }
            }

            int i = 1;
            for (int val : leapYears) {
                System.out.printf(
                        String.format(
                                "%s ",
                                val
                        ));
                if (i % 10 == 0) {
                    System.out.printf("\n");
                }

                i++;
            }
        } else {
            System.out.print("Geen geldige invoer!");
        }
    }
}
