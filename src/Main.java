import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String str = "hat";
        int strLength = str.length();
        int other = factorial(strLength)/ strLength;
        for (int i = 0; i < str.length(); i++) {
            // for every letter
            for (int e = 0; e < other; e++){

            }
        }

    }

    public static int factorial(int n){
        int factor;
        if (n == 0 || n == 1)
            return 1;
        factor = factorial(n - 1) * n;
        return factor;
    }
}
