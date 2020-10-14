import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
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

        Pattern pattern = Pattern.compile("[0-9]*[^+]");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("There's a match");
        }
        else {
            System.out.println("No match");
        }

    }
}
