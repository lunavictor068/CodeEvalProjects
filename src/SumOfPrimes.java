/** SUBMITTED **/
public class SumOfPrimes {
    public static void main(String[] args){
        System.out.println(sumOfFirst(1000));
    }
    public static int sumOfFirst(int number){
        int sum = 0;
        int currentPrime = 0;
        for (int i = 0;i < number; i++) {
            while (!(isPrime(currentPrime))) {
                currentPrime++;
            }
            sum = sum + currentPrime;
            currentPrime = currentPrime + 1;
        }
        return sum;
    }

    public static boolean isPrime(int number){
        if (number < 2)
            return false;
        if (number == 2) return true;
        if (number == 3) return true;
        if (number % 2== 0) return false;
        if (number % 3 == 0) return false;

        int i = 5;
        int w = 2;
        while (i * i <= number){
            if (number % i == 0) return false;
            i += w;
            w = 6- w;
        }
        return true;
    }

}
