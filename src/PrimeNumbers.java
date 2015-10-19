/**
 * Created by victorluna on 10/15/15.
 */
public class PrimeNumbers {
    public static void main(String[] args){
        printPrimesLessThan(100);

    }
    public static boolean isPrime(int number){
        if (number < 2)
            return false;
        for (int i = 2; i < number ; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimesLessThan(int number){
        for (int i = 2; i < number; i++) {
            if (isPrime(i))
                System.out.print(i +",");
        }
    }
}
