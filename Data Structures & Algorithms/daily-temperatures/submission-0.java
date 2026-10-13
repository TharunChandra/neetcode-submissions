class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stk = new Stack<>();

        for(int i=0; i<temperatures.length; i++){
            int tmp = temperatures[i];
            while(!stk.isEmpty() && tmp > stk.peek()[0]){
                int[] pair = stk.pop();
                res[pair[1]] = i - pair[1];
            }
            stk.push(new int[]{tmp,i});
        }
        return res;
    }
}
