import java.util.Scanner;

public class OnderdeelB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Vul een maand in:\n");
        int month = input.nextInt();

        switch (month) {
            case 1:
                System.out.println("januari");
                break;
            case 2:
                System.out.println("februari");
                break;
            case 3:
                System.out.println("maart");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("mei");
                break;
            case 6:
                System.out.println("juni");
                break;
            case 7:
                System.out.println("juli");
                break;
            case 8:
                System.out.println("augustus");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("oktober");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("Geen geldige invoer");
                break;
        }
    }
}
