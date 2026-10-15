class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<speed.length; i++){
            map.put(position[i], speed[i]);
        }
        Arrays.sort(position);
        Stack<Double> stk = new Stack<>();
        for(int i=position.length-1; i>=0; i--){
            double d = (double)(target-position[i])/map.get(position[i]);
            if(!stk.isEmpty() && stk.peek()>=d){
                continue;
            }
            stk.push(d);
        }
        return stk.size();
    }
}
