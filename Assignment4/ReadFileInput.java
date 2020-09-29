import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileInput {

    public static void main(String[] args) throws IOException {
        BufferedReader br = null; // reads text from a char input stream

        try {
            File file = new File("src/quote.txt");
            if (!file.exists()) {
                System.out.println("File does not exists");
            } else {
                br = new BufferedReader(new FileReader(file));
                String input;
                while ((input = br.readLine()) != null) {
                    System.out.println(input);
                }
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }
}
