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
           System.out.println(currentPrime + " number:"+i);
            currentPrime = currentPrime + 1;
        }
        return sum;
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

}
