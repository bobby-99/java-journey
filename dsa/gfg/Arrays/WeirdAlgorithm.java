package gfg;

public class Main {
    public static void main(String[] args) {
        long N = 13;
        while (N != 1) {
            System.out.print(N + " ");
            // If N is odd, then multiply it by 3 and add 1
            if (N % 2 != 0)
                N = N * 3 + 1;
            // If N is even, divide it by 2
            else
                N /= 2;
        }
        System.out.print(1);
    }
}
