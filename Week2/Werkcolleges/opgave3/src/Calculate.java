import java.util.Scanner;

public class Calculate {
    private static final double price = 0.50;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hoeveel km wilt u reizen?\n");
        int distance = input.nextInt();
        System.out.print("Wat is uw leeftijd?\n");
        int age = input.nextInt();

        System.out.println(
                String.format(
                        "Deze rit kost: €%.2f",
                        age < 12 ?
                                distance * price * 0.5 :
                                age < 65 ?
                                        distance * price :
                                        distance * price * 0.75
                ));
    }
}
