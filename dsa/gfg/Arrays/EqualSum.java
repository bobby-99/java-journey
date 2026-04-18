package gfg;

public class EqualSum {

    String equilibrium(int arr[]) {
        // code here
        int total = 0;

        for (int x : arr) {
            total += x;
        }

        // left sum = sum(arr[0] to arr[i - 1])
        // rigth sum = sum(arr[i+1] to arr[len - 1])

        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                return "true";
            }

            leftSum += arr[i];

        }

        return "false";
    }
}
