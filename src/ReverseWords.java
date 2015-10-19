/**
 * Created by victorluna on 10/15/15.
 */
public class ReverseWords {
    public static void
    main(String[] args){
        String testLine = "This is a test                             line\n \nlol";
        printReverse(testLine);

    }

    public static void printReverse(String line){
        String[] words = line.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.println(words[i]);
        }
    }
}
