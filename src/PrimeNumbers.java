/** SUBMITTED **/
import java.io.*;
public class PrimeNumbers {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
            BufferedReader buffer = new BufferedReader(new FileReader(file));
            String line;
            while ((line = buffer.readLine()) != null) {
                printPrimesLessThan(Integer.parseInt(line));
            }


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

    public static void printPrimesLessThan(int number){
        StringBuilder primes = new StringBuilder();
        for (int i = 2; i < number; i++) {
            if (isPrime(i))
                primes.append(i +",");
        }
        System.out.println(primes.toString().replaceAll(",$", ""));
    }
}
