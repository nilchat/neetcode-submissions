class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();

        for(int i = 0; i < n; i++){

            // Negative number check
            if(nums[i] > 0){
                break;
            }
            
            // Duplicate handling of a
            if(i > 0 && nums[i] == nums[i -1]){
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum > target){
                    right--;
                }
                else if(sum < target){
                    left++;
                }
                else{
                    
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Duplicate handling of b
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }

                    // Duplicate handling for c
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }

                }
            }
        }
        return result;
        
    }
}
