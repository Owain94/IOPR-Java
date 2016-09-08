import java.util.Scanner;

public class OnderdeelC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Voer je gewicht in in kilogram:\n");
        double weight = scanner.nextDouble();
        System.out.print("Voer je lengte in in meters:\n");
        double length = scanner.nextDouble();

        System.out.print(
                String.format(
                        "U hebt een bmi van: %.2f\n" +
                                "Dit betekend dat u %s hebt",
                        calculateBMI(weight, length),
                        BmiToReadable(calculateBMI(weight, length))
                ));
    }

    private static double calculateBMI(double weight, double lenght) {
        return weight / Math.pow(lenght, 2);
    }

    private static String BmiToReadable(double bmi) {
        if (bmi < 18.5) {
            return "ondergewicht";
        } else if (bmi < 25) {
            return "een normaal gewicht";
        } else if (bmi < 27) {
            return "lichtelijk overgewicht";
        } else if (bmi < 30) {
            return "een tijdje vies en vet gegeten";
        } else if (bmi < 40) {
            return "lang vies en vet gegeten";
        }
        return "een eeuwigheid vies en vet gegeten";
    }
}
