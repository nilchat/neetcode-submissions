class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxCount = 0;
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.containsKey(num)){
                int freq = map.get(num);
                maxCount = Math.max(maxCount, freq);
            }
            
        }

        if(maxCount > 1){
            return true;
        }
        else{
            return false;
        }


        
    }
}