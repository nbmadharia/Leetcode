class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
                        // System.out.println("curr sum: 1 " + currentSum);
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            // System.out.println("curr sum: 2 " + currentSum);
            if (currentSum < 0) {
                currentSum = 0;
            }
                        // System.out.println("curr sum: 3 " + currentSum);

        }
        
        return maxSum;
    }
}