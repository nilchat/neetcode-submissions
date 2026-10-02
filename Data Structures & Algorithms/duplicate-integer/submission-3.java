class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
    // Populate the unique elements 
    for(int num: nums){
        if(numSet.contains(num)){
            return true;
        }
        numSet.add(num);
    }
    return false;
    }
}