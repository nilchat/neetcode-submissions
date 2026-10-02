class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();

        Arrays.sort(nums);
        for(int i= 0; i < nums.length; i++){

            int target = -nums[i];
            int left = i+1;
            int right = nums.length - 1;

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            while(left < right){
                List<Integer> triplet = new ArrayList<>();
                int sum = nums[left] + nums[right];
                if(sum > target){
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    triplet.add(nums[i]);
                    triplet.add(nums[left]); 
                    triplet.add(nums[right]);
                    triplets.add(triplet);
                    left++;

                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }

                }
            }
    

        }
        return triplets;
        
    }
}
