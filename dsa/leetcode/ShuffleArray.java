package leetcode;

class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[i + n];
        }
        return ans;
    }
}

// class Solution {
// public int[] shuffle(int[] nums, int n) {
// int[] ans = new int[nums.length];
// int ansIndex = 0;
// for (int i = 0; i < n; i++) {
// ans[ansIndex] = nums[i];
// ans[ansIndex + 1] = nums[n + i];
// ansIndex += 2;
// }
// System.gc();
// return ans;
// }
// }