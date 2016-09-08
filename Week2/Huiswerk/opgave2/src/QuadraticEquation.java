import java.math.BigDecimal;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vul 3 getallen in");

        System.out.print("a:\n");
        double firstDouble = input.nextDouble();
        System.out.print("b:\n");
        double secondDouble = input.nextDouble();
        System.out.print("c:\n");
        double thirdDouble = input.nextDouble();

        double discriminant = Math.pow(secondDouble, 2) - (4 * firstDouble * thirdDouble);

        if (isNegative(discriminant)) {
            System.out.println("Geen oplossing mogelijk");
        } else if (BigDecimal.ZERO.compareTo(new BigDecimal(discriminant)) == 0) {
            System.out.println(String.format(
                    "Deze vergelijking heeft 1 oplossing, namelijk: x = %s",
                    (-secondDouble + Math.sqrt(discriminant)) / (2 * firstDouble)
            ));
        } else {
            System.out.println(String.format(
                    "Deze vergelijking heeft 2 oplossingen, namelijk: x1 = %s en x2 = %s",
                    (-secondDouble + Math.sqrt(discriminant)) / (2 * firstDouble),
                    (-secondDouble - Math.sqrt(discriminant)) / (2 * firstDouble)
            ));
        }
    }

    private static boolean isNegative(double d) {
        return Double.doubleToRawLongBits(d) < 0;
    }
}
