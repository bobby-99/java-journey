package gfg.Arrays;

public class IsSorted {
    public boolean isSorted(int[] arr) {
        // code here
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
