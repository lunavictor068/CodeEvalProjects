/** SUBMITTED **/
import java.io.*;
public class ReverseWords {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            if (!(line.equals(""))) {
                line = line.trim();
                printReverse(line);
            }
        }
    }

    public static void printReverse(String line) {
        String[] words = line.split(" ");
        StringBuilder reverse = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reverse.append(words[i] + " ");
        }
        System.out.println(reverse.toString().trim());
    }
}
