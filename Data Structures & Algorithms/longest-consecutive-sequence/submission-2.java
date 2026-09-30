class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxC=0;
        for(Integer n : set){
            if(!set.contains(n-1)){
                int curr = n;
                int len = 1;
                while(set.contains(curr+1)){
                    curr++;
                    len++;
                }
                if(maxC<len){
                    maxC=len;
                }
            }
        }
        return maxC;
    }
}
