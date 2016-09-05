import java.util.Scanner;

public class OnderdeelA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wat is de diameter van de cilinder?\n");
        double diameter = input.nextDouble();
        System.out.print("\nWat is de hoogte van de cilinder?\n");
        double hoogte = input.nextDouble();

        System.out.println(String.format("De inhoud van de cilinder is: %.2f",
                (diameter / 2) * (diameter / 2) * Math.PI * hoogte));
    }
}
