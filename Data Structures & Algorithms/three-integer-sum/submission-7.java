class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();


        for(int i =0; i< nums.length; i++){
            int target = -nums[i];
            int left = i+ 1;
            int right = nums.length - 1;

            if(nums[i] > 0){
                break;
            }

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            while(left < right){
                int sum = nums[left] + nums[right];
                if(sum < target){
                    left++;
                }
                else if( sum > target){
                    right--;
                }
                else{
                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
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
