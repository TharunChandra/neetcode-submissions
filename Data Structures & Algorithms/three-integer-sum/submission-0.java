class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int l = i+1, r = nums.length-1;
            while(l<r){
                List<Integer> tri = new ArrayList<>();
                if(nums[i]+nums[l]+nums[r]==0){
                    tri.add(nums[i]);
                    tri.add(nums[l]);
                    tri.add(nums[r]);
                    if(!res.contains(tri)){
                        res.add(tri);
                    }
                }
                if(nums[i]+nums[l]+nums[r]<0){
                    l++;
                } else{
                    r--;
                }
            }
        }
        return res;
    }
}
