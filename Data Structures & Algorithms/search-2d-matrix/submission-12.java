class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;

        int l=0, r = rows*cols-1;
        
        while(l<=r) {
            int m = l+(r-l)/2;
            int cell = matrix[m/cols][m%cols];
            if (target < cell){
                r = m-1;
            } else if(target > cell){
                l = m+1;
            } else {
                return true;
            }
        }
        return false;
    }

}
