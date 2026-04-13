class ReverseString {
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int l = 0, r = arr.length - 1;
        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }
}

// class ReverseStringBuilder {
// public static String reverseString(String s) {
// String res = new StringBuilder(s).reverse().toString();
// return res;
// }
// }