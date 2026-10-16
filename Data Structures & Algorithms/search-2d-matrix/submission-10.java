class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, r = matrix.length;
        while(l<=r && l<matrix.length) {
            int m = l+(r-l)/2;
            System.out.println(m);
            int index = Arrays.binarySearch(matrix[m], target);
            System.out.println(index);
            if(index >= 0){
                return true;
            } else if(index == -1){
                r = m-1;
                System.out.println(r);
            } else if(index == -1-(matrix[m].length)){
                l = m+1;
                System.out.println(l);
            } else {
                return false;
            }
        }
        return false;
    }

}
