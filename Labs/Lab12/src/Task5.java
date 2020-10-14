import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        String regex = "(0[1-9]|1[012]|2[0-9]|3[0-1])[/](0[1-9]|[12][0-9]|3[01])[/](19|[2-9][0-9])[0-9][0-9]";
        Scanner sc = new Scanner(System.in);
        String date = sc.nextLine();
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
