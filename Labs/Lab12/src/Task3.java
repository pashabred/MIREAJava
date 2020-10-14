import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Specify path to the file");
        Scanner scanner = new Scanner(System.in);
        String text = "";
        String pathToText = scanner.nextLine();
        FileReader fileReader = new FileReader(pathToText);

        try {
            int data = fileReader.read();
            while(data != -1) {
                data = fileReader.read();
                text+=(char)data;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }

        System.out.println(text);
        String regexpr = "([0-9]*[.])[0-9]+[ ]((USD).|(RUB).|(EU).)";
        Pattern pattern = Pattern.compile(regexpr);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
