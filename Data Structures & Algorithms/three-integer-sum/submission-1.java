class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res  = new ArrayList<>();
        Arrays.sort(nums);
       for(int k=0;k<nums.length;k++) {
            if(nums[k]>0) break;
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i=k+1,j=nums.length-1;
            while(i<j){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum>0){
                    j--;
                }
                else if(sum<0){
                    i++;
                }
                else {
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;
                    j--;
                    while (i<j && nums[i]==nums[i-1]) i++;
                }
            } 
        }
        return res;
    }
}
