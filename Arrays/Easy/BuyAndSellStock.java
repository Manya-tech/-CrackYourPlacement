package Arrays.Easy;

class Solution {
    public int maxProfit(int[] prices) {
        
        int p=0;
        int s=prices[0];
        for(int i=0; i<prices.length; i++){
            int c=prices[i]-s;
            p=Math.max(p,c);
            s=Math.min(prices[i],s);
        }
        return p;
    }
}