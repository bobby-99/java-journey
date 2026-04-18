package gfg;

import java.util.ArrayList;

public class FirstAndSecondSmallest {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {
        // code here
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        if (secondSmallest == (int) Integer.MAX_VALUE) {
            list.add(-1);
            return list;
        }
        list.add(smallest);
        list.add(secondSmallest);
        return list;
    }
}
