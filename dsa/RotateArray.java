// class Solution {
//     static void rotateArr(int arr[], int d) {
//         d = d % arr.length;

//         int temp[] = new int[d];

//         for(int i = 0; i < d; i++){
//             temp[i] = arr[i];
//         }

//         for(int i = d; i < arr.length; i++ ){
//             arr[i - d] = arr[i];
//         }

//         for(int i = 0; i < d; i++ ){
//             arr[arr.length - d + i] = temp[i];
//         }
//     }

// }

// O(1) solution

import java.util.Arrays;

class RotateArray {
    public static void main() {
        int[] myArr = { 3, 1, 2, 3, 5, 6 };
        rotateArr(myArr, 5);
        System.out.println(Arrays.toString(myArr));
    }

    static void rotateArr(int arr[], int d) {
        d = d % arr.length;
        int n = arr.length;

        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}