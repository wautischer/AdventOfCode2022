import java.io.*;
import java.util.ArrayList;

public class Reader {
    public static ArrayList<String> readFile(String filename) {
        BufferedReader reader = null;
        ArrayList<String> lines = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(new File("src/" + filename + ".txt")));
            String line;

            while((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return lines;
    }
}