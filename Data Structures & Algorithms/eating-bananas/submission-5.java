class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1, r = Arrays.stream(piles).max().getAsInt();
        int speed = r;
        while(l<=r) {
            int m = l + (r-l)/2;
            int rate = 0;
            for(int p : piles){
                rate += Math.ceil((double)p/m);
            }
            if (rate<=h){
                r = m-1;
                speed = m;
            } else if(rate>h) {
                l = m+1;
            }
        }
        return speed;
    }
}
