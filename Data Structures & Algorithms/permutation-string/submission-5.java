class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) {
            return false;
        }

        int[] s1C = new int[26];
        int[] s2C = new int[26];

        for(int i=0;i<s1.length();i++) {
            s1C[s1.charAt(i)-'a']++;
            s2C[s2.charAt(i)-'a']++;
        }
        int match = 0;
        for(int i=0;i<26;i++) {
            if(s1C[i]==s2C[i]) {
                match++;
            }
        }
        for (int i=s1.length(),l=0;i<s2.length();i++,l++){
            if(match==26){
                return true;
            }

            int idx = s2.charAt(l)-'a';
            s2C[idx]--;
            if(s1C[idx]==s2C[idx]) {
                match++;
            } else if(s1C[idx]-1==s2C[idx]){
                match--;
            }
            idx = s2.charAt(i)-'a';
            s2C[idx]++;
            if(s1C[idx]==s2C[idx]) {
                match++;
            } else if(s1C[idx]+1==s2C[idx]){
                match--;
            }
        }
        return match==26;
    }
}
