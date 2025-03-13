import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Locale LocaleData = Locale.getDefault();

        String lingua = LocaleData.getLanguage();

        System.out.println("A linguagem do sistema é " + lingua);
    }
}