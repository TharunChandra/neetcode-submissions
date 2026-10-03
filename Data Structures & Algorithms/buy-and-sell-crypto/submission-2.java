class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0 || prices.length == 1){
            return 0;
        }
        int buy=0,sell=1,max=0;
        max = Math.max(max,(prices[sell]-prices[buy]));
        while(buy<prices.length-1 && sell<prices.length-1){
            if(prices[sell]-prices[buy]<0 ){
                buy++;
            } else{
                sell++;
            }
            max = Math.max(max,(prices[sell]-prices[buy]));
        }
        return max;
    }
}
