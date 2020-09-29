import java.io.*;

public class CreateFile {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = null;
        BufferedWriter bw = null;

        try {
            File file = new File("src/command_line_input.txt");
            if (file.createNewFile())
                System.out.println("File created!"); // create an empty file if it does not exist
            else
                System.out.println("File already exists");

            bw = new BufferedWriter(new FileWriter(file)); // write char output stream onto the file
            in = new InputStreamReader(System.in); // read byte and translate to a char

            System.out.println("Enter a text or @q to exit.");

            char text;
            while (true) { // valid input
                text = (char) in.read(); // read a single char
                if (text == '@') {
                    char temp = (char) in.read();
                    if (temp == 'q')  // if text == @q, exit the loop
                        break;
                    else {
                        bw.append(text);
                        bw.append(temp); // if temp != q, write "@" + temp onto the file
                    }
                } else
                    bw.append(text);
            }
        } finally {
            if (in != null) {
                in.close(); // close the stream
            }
            if (bw != null) {
                bw.close(); // close the file
            }
        }

    }
}


