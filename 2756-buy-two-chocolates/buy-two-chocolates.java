class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int first=0;
        int second=1;
        if(prices[first]+prices[second]<=money){
            int ans=money-(prices[first]+prices[second]);
            return ans;
        }
    return money;
}
}