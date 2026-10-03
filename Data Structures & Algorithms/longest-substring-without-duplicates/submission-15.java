class Solution {
    public int lengthOfLongestSubstring(String s) {

        if (s.length() == 0) return 0;

        Set<Character> set = new HashSet<>();

        int l = 0, r = 0, max = 0;

        while (r < s.length()) {

            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                max = Math.max(max, r - l + 1);
                r++;
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }

        return max;
    }
}