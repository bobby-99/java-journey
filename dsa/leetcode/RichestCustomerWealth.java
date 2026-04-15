package leetcode;

// 1672. RichestCustomerWealth

class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        for (int[] cust : accounts) {
            int wealth = 0;
            for (int amount : cust) {
                wealth += amount;
            }
            if (wealth > sum) {
                sum = wealth;
            }
        }
        return sum;
    }
}
