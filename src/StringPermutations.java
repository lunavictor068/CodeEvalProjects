import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) {
        String line = "Moon";
        List permutations = sortedStringPermutations(line);
        printList(permutations);
    }

    public static void printList(List list) {
        for (Object s : list)
            System.out.println(s);
    }

    public static List sortedStringPermutations(String str){
        List list = new ArrayList<>();
        StringPermutations("", str, list);
        Collections.sort(list);
        return list;
    }

    private static void StringPermutations(String permutation, String str, List list){
        int n = str.length();
        if (n == 0)
            list.add(permutation);
        else
            for (int i = 0; i < n; i++)
                StringPermutations(permutation + str.charAt(i), str.substring(0, i)
                        + str.substring(i + 1, n),list);
    }
}