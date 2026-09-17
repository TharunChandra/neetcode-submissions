class Solution {
    public int trap(int[] height) {
        int found = 0;
        int area = 0;
        int lastTal = 0;
        for(int i=0;i<height.length;i++){
            if(height[i]!=0){
                found = i;
                break;
            }
        }
        int tal = height[found];
        int tempArea = 0;
        for(int i = found+1;i<height.length;i++){
            if(height[i]<tal){
                tempArea += tal-height[i];
            }
            else {
                tal = height[i];
                area += tempArea;
                tempArea = 0;
                lastTal = i;
            }
        }

        found = 0;
        for(int i=height.length-1;i>=lastTal;i--){
            if(height[i]!=0){
                found = i;
                break;
            }
        }
        tal = height[found];
        tempArea = 0;
        for(int i = found-1;i>=lastTal;i--){
            if(height[i]<tal){
                tempArea += tal-height[i];
            }
            else {
                tal = height[i];
                area += tempArea;
                tempArea = 0;
            }
        }
        return area;
    }
}
