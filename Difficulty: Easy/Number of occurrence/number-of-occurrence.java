class Solution {
    int countFreq(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        int a = 0;
        
        if(map.containsKey(target)){
            a = map.get(target);
        }
        return a;
    }
}
