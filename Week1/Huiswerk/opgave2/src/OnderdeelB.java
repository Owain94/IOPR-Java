import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnderdeelB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i != 3; i++) {
            System.out.print("Voer een nummer in:\n");
            numbers.add(Integer.valueOf(scanner.nextLine()));
        }

        int sum = 0;
        for (int number : numbers) sum += number;

        System.out.println(String.format("Average value of array elements is: %d", sum / numbers.size()));
    }
}
