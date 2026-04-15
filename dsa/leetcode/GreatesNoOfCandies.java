package leetcode;

import java.util.*;

class GreatesNoOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> list = new ArrayList<>(n);
        int max = candies[0];
        for (int x : candies) {
            if (x > max) {
                max = x;
            }
        }
        for (int i = 0; i < n; i++) {
            if ((candies[i] + extraCandies) >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }

        // for(int candy : candies){
        // list.add(candy + extraCandies >= max);
        // }

        return list;
    }
}
