package gfg;

import java.util.*;

class Solution {
    public double findMedian(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 1) {
            return (double) arr[n / 2]; // ODD
        } else {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0; // EVEN
        }
    }
}
