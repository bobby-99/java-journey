package leetcode;

// 1365. How many Numbers are Smaller than the current number

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] freq = new int[101];

        for (int num : nums) {
            freq[num]++;
        }

        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                res[i] = 0;
            else
                res[i] = freq[nums[i] - 1];
        }

        return res;

        // int len = nums.length;
        // int[] res = new int[len];

        // for(int i = 0; i < len; i++){
        // int count = 0;
        // for(int j = 0; j < len; j++){
        // if((i != j) && nums[j] < nums[i]){
        // count++;
        // }
        // }
        // res[i] = count;
        // }
        // return res;
    }
}
