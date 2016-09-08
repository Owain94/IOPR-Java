public class Rekenen {
    public static void main(String[] args) {
        byte a = 5;
        short b = 10;
        int c = 100;
        long d = 1000000;
        float e = 57;
        double f = 75.3;
        char g = 'T';
        boolean h = false;
        String i = "Er zijn in totaal";
        String j = "variabelen.";

        System.out.println(
                String.format(
                        "Variabele a is: %s",
                        a
                ));

        System.out.println(
                String.format(
                        "De som van %s en %s is: %s",
                        b,
                        c,
                        b + c
                ));

        System.out.println(
                String.format(
                        "%s gedeeld door %s is: %s",
                        d,
                        e,
                        d / e
                ));

        System.out.println(
                String.format(
                        "%s vermenigvuldigd met %s is: %s",
                        e,
                        f,
                        e * f
                ));

        System.out.println(
                String.format(
                        "%s afgetrokken van %s is: %s",
                        e,
                        f,
                        e - f
                ));

        System.out.println(
                String.format(
                        "De som van %s en %s is: %s",
                        e,
                        f,
                        e + f
                ));

        System.out.println(
                String.format(
                        "%s gedeeld door 7 is: %s",
                        c,
                        c / 7
                ));

        System.out.println(
                String.format(
                        "%s anfgetrokken van %s is: %s",
                        f,
                        e,
                        e - f
                ));

        System.out.println(
                String.format(
                        "Als je %s deelt door %s, houd je als rest over: %s",
                        d,
                        e,
                        d % e
                ));

        System.out.println(
                String.format(
                        "De eerstvolgende letter na %s is: %s",
                        g,
                        (char) (g + 1)
                ));

        //noinspection ConstantConditions
        System.out.println(
                String.format(
                        "De waarde van boolean h is %s",
                        h
                ));

        System.out.println(
                String.format(
                        "%s 10 %s",
                        i,
                        j
                ));
    }
}
