class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int maxC=0;
        for(Integer n : set){
            //int start;
            if(!set.contains(n-1)){
                int start = n;
                int next = n+1;
                int cnt = 1;
                for(Integer a : set){
                    if(set.contains(next)){
                        cnt++;
                        next++;
                    }
                }
                if(maxC<cnt){
                    maxC=cnt;
                }
            }
        }
        return maxC;
    }
}
