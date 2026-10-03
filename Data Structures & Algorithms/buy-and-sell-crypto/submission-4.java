class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1){
            return 0;
        }
        int buy=0,sell=1,max=0;
        while (sell < prices.length) {
            if (prices[sell] < prices[buy]) {
                buy = sell;
            } else {
                max = Math.max(max, prices[sell] - prices[buy]);
            }
            sell++;
        }
        return max;
    }
}
