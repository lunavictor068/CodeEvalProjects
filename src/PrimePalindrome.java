public class PrimePalindrome {
    public static void main(String[] args) {
        System.out.println(largestPalindromeLessThan(1000));
    }

    public static boolean isPalindrome(int intNumber) {
        String number = String.valueOf(intNumber);
        int length = number.length();
        for (int i = 0; i <= length/2 ; i++) {
            if (number.charAt(i) != number.charAt(length - i - 1))
                return false;
        }
        return true;
    }

    public static int largestPalindromeLessThan(int number){
        while (number >= 0){
            if (isPalindrome(number) && isPrime(number))
                return number;
            number--;
        }
        return -1;
    }

    public static boolean isPrime(int number){
        for (int i = 2; i < number ; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
