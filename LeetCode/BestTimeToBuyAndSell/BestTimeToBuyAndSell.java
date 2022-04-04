class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, j = 1;
        int maxProfit = 0;
        int tempProfit;
        while (i < prices.length) {
            while (j < prices.length) {
                tempProfit = prices[j] - prices[i];
                if (tempProfit > maxProfit) {
                    maxProfit = tempProfit;
                }
                j++;
            }
            i++;
            j = i + 1;
        }
        
        if (maxProfit > 0)
            return maxProfit;
        else
            return 0;
    }
}