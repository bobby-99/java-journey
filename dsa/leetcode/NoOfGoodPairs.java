package leetcode;

public class NoOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

        int[] freq = new int[101]; // constraint: nums[i] <= 100
        int count = 0;
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }
}

// int len = nums.length;
// int count = 0;
// for(int i = 0; i < len; i++){
// for(int j = i; j < len; j++){
// if(nums[i] == nums[j] && (i < j)){
// count++;
// }
// }
// }
// return count;
