package gfg.Arrays;

class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int currentSum = arr[0], maxSum = arr[0];

        // Traverse from second element
        for (int i = 1; i < arr.length; i++) {

            // If currentSum is negative, reset to current Element
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
