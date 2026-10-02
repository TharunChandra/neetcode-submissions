class Solution {
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length-1;
        int max = 0;

        while(l < r){
            int ar = (r-l)*(Math.min(heights[l],heights[r]));
            if(heights[l]<heights[r]){
                l++;
            } else{
                r--;
            }
            max = Math.max(max, ar);
        }
        return max;
    }
}
