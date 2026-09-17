class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }
        int res = 0;

        for(int n : set){
            if(!set.contains(n-1)) {
                int l=1;
                while(set.contains(n+l)){
                    l++;
                }
                res = Math.max(res,l);
            }
        }
        return res;
    }
}
