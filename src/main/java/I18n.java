import java.text.NumberFormat;
import java.util.Locale;

public class I18n {
    public static void main(String[] args) {
        Locale viVN = new Locale("vi","VN");
        double currency = 123131.4234;

        String s1 = formatCurrencyByLocale(currency, viVN);
        System.out.println("s1 = " + s1);
    }

    public static String formatCurrencyByLocale(double currency, Locale locale){
        NumberFormat formatter = NumberFormat.getInstance(locale);
        return formatter.format(currency);

    }
}
