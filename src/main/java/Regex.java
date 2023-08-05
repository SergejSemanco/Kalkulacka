import java.util.Map;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) throws Exception {
        String priklad = "200-30";
        String regex = "([0-9]+)([-+*/])([0-9]+)";
        var pattern = Pattern.compile(regex);
        var matcher = pattern.matcher(priklad);

       /* while (matcher.find()) {
            String operator = matcher.group(2); // Získame reťazec s operátorom

            if ("-".equals(operator)) {
                System.out.println("Nájdený operátor '-'.");
            } else {
                System.out.println("chujovo daco");
            }

            System.out.println("___________________");*/

            if (matcher.matches()) {
                String v1 = matcher.group(1);
                String v2 = matcher.group(3);
                double n1 = Double.parseDouble(v1);
                double n2 = Double.parseDouble(v2);
                double percentage = n1 / 100 * n2;
                double vysledok = n1 - percentage;
                String operator = matcher.group(2); // Získame reťazec s operátorom

                if ("-".equals(operator)) {
                    System.out.println(vysledok);
                }

                /*System.out.println(n1);
                System.out.println(n1 / 100);
                System.out.println(2 * n2);
                System.out.println(n2);
                System.out.println("------------");
                System.out.println(percentage);
                System.out.println("------------");
                System.out.println(vysledok);*/
            }
        }
    }


