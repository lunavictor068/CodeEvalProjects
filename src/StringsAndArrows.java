/**
 * Created by victorluna on 10/16/15.
 */
public class StringsAndArrows {
    public static void main (String[] args){
        String arrowString = "";


    }

    public static int findArrows(String arrowString){
        int total = 0;
        int firstIndex = 0;
        int lastIndex = 3;

        if (arrowString.length() < 4)
            total = 0;
        else
            for (; firstIndex < arrowString.length(); firstIndex++) {

                for (int i = 0; i <= 3; i++) {
                    
                }

                lastIndex++;
            }

        return total;
    }
}
