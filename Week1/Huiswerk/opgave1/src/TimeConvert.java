import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Vul een aantal secondes in:\n");
        long seconds = Long.parseLong(scanner.nextLine());

        int years = (int) Math.floor(TimeUnit.SECONDS.toDays(seconds) / 365);

        long days = TimeUnit.SECONDS.toDays((seconds - (years * (365 * 24 * 60 * 60))));
        long hours = TimeUnit.SECONDS.toHours((seconds - (years * (365 * 24 * 60 * 60)))) -
                TimeUnit.DAYS.toHours(days);
        long minute = TimeUnit.SECONDS.toMinutes((seconds - (years * (365 * 24 * 60 * 60)))) -
                TimeUnit.HOURS.toMinutes(TimeUnit.SECONDS.toHours((seconds - (years * (365 * 24 * 60 * 60)))));
        long second = TimeUnit.SECONDS.toSeconds((seconds - (years * (365 * 24 * 60 * 60)))) -
                TimeUnit.MINUTES.toSeconds(TimeUnit.SECONDS.toMinutes((seconds - (years * (365 * 24 * 60 * 60)))));

        System.out.print(String.format("%s seconden is:\n\n" +
                        "%s jaar / jaren\n" +
                        "%s dag / dagen\n" +
                        "%s uur / uren\n" +
                        "%s minuut / minuten\n" +
                        "%s seconde / seconden",
                seconds,
                years,
                days,
                hours,
                minute,
                second
        ));
    }
}
