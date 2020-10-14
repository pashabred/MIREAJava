import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String regex = "[a-z0-9!\\.#$%&' \"*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*\"+/=?^_` {|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?)(\\.)*([a-z])*";
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        if (email.length() <= 64) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(email);
            if (matcher.matches()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
        else {
            System.out.println("Invalid");
        }
    }
}
