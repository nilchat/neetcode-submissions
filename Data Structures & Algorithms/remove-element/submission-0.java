class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = 0;
        int len = nums.length;

        while(right < len){
            if(nums[right] != val){
                if(left != right){
                    int temp = nums[right];
                    nums[right] = nums[left];
                    nums[left] = temp;
                }
                left++;
            }
            right++;
        }
        return left;
    }
}