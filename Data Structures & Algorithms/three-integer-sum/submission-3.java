class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Sort the input array
        Arrays.sort(nums);
        List<List<Integer>> triplets = new ArrayList<>();


        for(int i = 0; i < nums.length; i++){
            int target = -nums[i];
            int left = i + 1;
            int right = nums.length - 1;


            // Handling the duplicate a
            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            while(left < right){

                int sum = nums[left] + nums[right];
                if(sum > target){
                    right--;
                }
                else if(sum  < target){
                    left++;
                }

                else{

                    triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;

                    //Handling the duplicate b
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                }

            }

        }
        return triplets;

        
    }
}
