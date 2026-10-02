class Solution {
    public int[] productExceptSelf(int[] nums) {

        int len = nums.length;
        int[] result = new int[len];

        for(int i = 0; i < len; i++){
            int product = 1;
            for(int j = 0; j < len; j++){
                if(i != j){
                    product = product * nums[j];
                }
            }
            result[i] = product;
        }
        return result;
    }
}  
