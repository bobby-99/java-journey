public class CheckPrime {
    public static void main(String args[]) {
        int num = 7;
        if (num <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }
        int n = 2;
        while (n * n <= num) {
            if (num % n == 0) {
                System.out.println("Not Prime");
                return;
            }
            n += 1;
        }
        System.out.println("Prime");
    }
}

// public static boolean isPrime(int n) {
// if (n <= 1) { return false; }
// if (n == 2) { return true; }
// if (n % 2 == 0) { return false; }

// for (int i = 3; i <= Math.sqrt(n); i += 2) {
// if (n % i == 0) { return false; }
// }

// return true;
// }
