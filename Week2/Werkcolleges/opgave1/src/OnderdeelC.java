import java.util.Scanner;

public class OnderdeelC {
    // Alles onder de case die geselecteerd wordt zal uitgeprint worden dit komt omdat de code niet weet waar het moet stoppen door het ontbreken van een break
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vul een maand in:\n");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("januari");
            case 2:
                System.out.println("februari");
            case 3:
                System.out.println("maart");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("mei");
            case 6:
                System.out.println("juni");
            case 7:
                System.out.println("juli");
            case 8:
                System.out.println("augustus");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("oktober");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("december");
            default:
                System.out.println("Geen geldige invoer");
        }
    }
}
