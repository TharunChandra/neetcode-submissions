class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i),0)+1);
        }
        System.out.println("map : "+map.toString());
        for(int l=0,r=s1.length();r<=s2.length();l++,r++){
            System.out.println("hi");
            Map<Character, Integer> res = new HashMap<>();
            for(int i=l;i<r;i++){
                res.put(s2.charAt(i), res.getOrDefault(s2.charAt(i),0)+1);
            }
            System.out.println("res : "+res.toString());
            if(map.equals(res)){
                return true;
            }
        }
        return false;
    }
}
