package leetcode;

// 1480. Running Sum of 1d Array
public class RunningSumOfArray {
    public int[] runningSum(int[] nums) {

        int n = nums.length;
        for (int i = 1; i < n; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }

        return nums;

    }
}

// int[] runningSum = new int[nums.length];
// int sum = nums[0];
// for(int i = 0; i < nums.length; i++ ){
// if(i == 0){
// runningSum[i] = nums[i];
// continue;
// }
// sum += nums[i];
// runningSum[i] = sum;
// }
// return runningSum;