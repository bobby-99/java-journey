class LargestInArray {
    public static int largest(int[] arr) {
        int largest = arr[0];
        int length = arr.length;
        for (int i = 1; i < length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }
}
