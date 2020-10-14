import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Type regex ");
        Scanner sc = new Scanner(System.in);
        String reg = sc.nextLine();
        Pattern pattern = Pattern.compile(reg);
        System.out.println("Type the string");
        sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = pattern.split(str);
        System.out.println("Result: ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
