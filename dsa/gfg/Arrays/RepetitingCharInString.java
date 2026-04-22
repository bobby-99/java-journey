package gfg.Arrays;

public class Main {

    static int solve(String S) {
        int ans = 1, count = 1;
        for (int i = 1; i < S.length(); i++) {
            // If the current character is same as the previous
            // character, then increment the count
            if (S.charAt(i) == S.charAt(i - 1))
                count += 1;
            else
                // If the current character is different from
                // the previous character, then reset count to 1
                count = 1;
            ans = Math.max(ans, count);
        }
        return ans;
    }

    public static void main(String[] args) {
        // Input
        String S = "AATTGGCCCC";

        System.out.println(solve(S));
    }
}