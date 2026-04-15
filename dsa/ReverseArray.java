import java.util.Arrays;

class ReverseArray {

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(reverseArray(arr)));
    }

    static int[] reverseArray(int arr[]) {
        // code here
        int l = 0, r = arr.length - 1;
        int temp;
        while (l < r) {
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }
}