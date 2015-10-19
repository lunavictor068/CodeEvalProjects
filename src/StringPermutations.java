import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringPermutations {
    public static void main(String[] args) throws Exception{
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            List permutations = sortedStringPermutations(line);
            printList(permutations);
        }
    }

    public static void printList(List list) {
        StringBuilder str = new StringBuilder();
        for (Object s : list)
            str.append(s+",");
        System.out.println(str.toString().replaceAll(",$", ""));
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