import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnderdeelC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vul het eerste jaartal in:\n");
        int firstYear = input.nextInt();
        System.out.print("Vul het tweede getal in:\n");
        int secondYear = input.nextInt();

        if (firstYear < secondYear) {
            List<Integer> leapYears = new ArrayList<>();
            int loop = firstYear + 1;
            do {
                if (loop % 4 == 0) {
                    leapYears.add(loop);
                }

                loop++;
            } while (loop < secondYear);

            int i = 1;
            do {
                System.out.printf(
                        String.format(
                                "%s ",
                                leapYears.get(i - 1)
                        ));
                if (i % 10 == 0) {
                    System.out.printf("\n");
                }

                i++;
            } while (leapYears.size() > i - 1);
        } else {
            System.out.print("Geen geldige invoer!");
        }
    }
}
