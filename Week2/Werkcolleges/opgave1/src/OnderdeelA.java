import java.util.Scanner;

public class OnderdeelA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vul een maand in:\n");
        int month = input.nextInt();

        if (month == 1) {
            System.out.println("januari");
        } else if (month == 2) {
            System.out.println("februari");
        } else if (month == 3) {
            System.out.println("maart");
        } else if (month == 4) {
            System.out.println("april");
        } else if (month == 5) {
            System.out.println("mei");
        } else if (month == 6) {
            System.out.println("juni");
        } else if (month == 7) {
            System.out.println("juli");
        } else if (month == 8) {
            System.out.println("augustus");
        } else if (month == 9) {
            System.out.println("september");
        } else if (month == 10) {
            System.out.println("oktober");
        } else if (month == 11) {
            System.out.println("november");
        } else if (month == 12) {
            System.out.println("december");
        } else {
            System.out.println("Geen geldige invoer");
        }
    }
}
