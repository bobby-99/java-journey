package gfg.Arrays;

// User function Template for Java
import java.util.*;

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here

        int[] temp = arr.clone();
        Arrays.sort(temp);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 1;

        // Assign Ranks
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(temp[i])) {
                map.put(temp[i], rank);
                rank += 1;
            }
        }

        // Replace Values
        for (int i = 0; i < N; i++) {
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}
