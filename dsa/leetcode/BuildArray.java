package leetcode;

class BuildArray {
    public int[] buildArray(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
            temp[i] = nums[nums[i]];
        return temp;
    }
}

/*
 * For O(1) space solution, we use in-place encoding
 * 
 * int n = nums.length;
 * 
 * // Step-1: Encode new values into original array
 * for(int i = 0; i < n; i++ ){
 * nums[i] = nums[i] + n * (nums[nums[i]] % n);
 * }
 * 
 * // Step-2: Extract new values
 * for(int i = 0; i < n; i++){
 * nums[i] = nums[i] / n;
 * }
 * 
 * return nums;
 * 
 */
