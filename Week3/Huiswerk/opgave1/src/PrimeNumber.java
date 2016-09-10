import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vul het eerste getal in:\n");
        int firstInt = input.nextInt();
        System.out.print("Vul het tweede getal in:\n");
        int secondInt = input.nextInt();

        if (firstInt < secondInt) {
            for (int i = firstInt + 1; i < secondInt; i++) {
                System.out.print(
                        String.format(
                                "%s is %s priemgetal\n",
                                i,
                                isPrime(i) ? "een" : "geen"
                        ));
            }
        } else {
            System.out.print("Geen geldige invoer!");
        }
    }

    private static boolean isPrime(int n) {
        if (n > 2 && (n & 1) == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2)
            if (n % i == 0) {
                return false;
            }
        return true;
    }
}
