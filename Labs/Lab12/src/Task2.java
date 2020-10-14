import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String subString = "abcdefghijklmnopqrstuv18340";
        Pattern pattern = Pattern.compile(subString);
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        Matcher matcher = pattern.matcher(inputString);
        if (matcher.matches()) {
            System.out.println("There's a match");
        }
        else {
            System.out.println("No match");
        }
    }
}
