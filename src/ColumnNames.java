/**
 * Created by victorluna on 10/12/15.
 */
public class ColumnNames {
    public static void main(String[] args) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        int nthColumn = 17576 + 676 + 26;
        System.out.println(secondColumnCalc(nthColumn, alphabet));
    }


    public static String secondColumnCalc(int nth, char[] alphabet){
        String column;

        if(nth <= 26){
            column = "" + alphabet[nth - 1];
        }

        else if (nth <= 676 + 26){
            int first = 0;
            for (; nth > 26 ; first++) {
                nth = nth - 26;
            }
            column = alphabet[first-1]+""+alphabet[nth-1];
        }

         else if (nth <= 17576 + 676 + 26){
            int first = 0;
            int second = 0;
            for (; nth > 26 ; first++) {
                nth = nth - 26;
            }
            for (; first > 26 ; second++) {
                first = first - 26;
            }
            column = alphabet[second-1]+""+alphabet[first-1]+""+alphabet[nth-1];
        }

        else
            column = "Cant Calculate :/";
        return column;
    }
}