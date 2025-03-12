class Solution {
    public int maxProduct(int[] nums) {

        // int[] max = new int[nums.length];
        // int[] min = new int[nums.length];

        // max[0] = min[0] = nums[0];
        // int result = nums[0];
        // for (int i = 1; i < nums.length; i++) {

        //     if(nums[i]>0){
        //         max[i] = Math.max(nums[i],max[i-1] * nums[i]);
        //         min[i] = Math.min(nums[i],min[i-1] * nums[i]);
        //     }
        //     else{
        //         max[i] = Math.max(nums[i],min[i-1] * nums[i]);
        //         min[i] = Math.min(nums[i],max[i-1] * nums[i]);
        //     }
        //     result= Math.max(max[i],result);
        // }
        // return result;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;

    }
}