// 1929
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]

package leetcode;

class ArrayConcatenation {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}

/*
 * System.arraycopy(src, srcPos, dest, destPos, length)
 * src -> original array
 * srcPos -> starting index in source
 * dest -> target array
 * destPos -> starting index in destination
 * length -> number of elements to copy
 */

// usual implementation
// class Solution {
// public int[] getConcatenation(int[] nums) {
// int n = nums.length;
// int[] ans = new int[2 * n];

// for (int i = 0; i < n; i++) {
// ans[i] = nums[i];
// ans[i + n] = nums[i];
// }

// return ans;
// }
// }