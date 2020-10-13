import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class Task4 {

    public static void main(String[] args) {

        try {
            File f = new File(args[0]);

            List<File> lf = new ArrayList<File>();

            Collections.addAll(lf, Objects.requireNonNull(f.listFiles()));
            try {
                for (int i = 0; i < 5; i++)
                    System.out.println(lf.get(i).getName());
            } catch (Exception e) {
                System.out.println("Amount of files in the directory is less than 5!");
            }
        }
        catch (Exception e){
            System.out.println("No dir");
        }

    }
}