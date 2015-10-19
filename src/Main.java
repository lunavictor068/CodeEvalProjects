import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] str = {"I","like","turtles"};
        String newstr = "";
        for (String s : str)
        newstr = newstr +""+s;
        newstr.trim();
        System.out.println(newstr);

    }

}
