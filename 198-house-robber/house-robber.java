class Solution {
    public int rob(int[] nums) {

        // return helper(nums, nums.length - 1);
        int[] memo = new int[nums.length + 1];
        Arrays.fill(memo,-1);
        return robRecursionMemo(nums, nums.length - 1,memo);
    }

    private int helper(int[] nums, int i) {
        if (i < 0) return 0;

        // Option 1: rob this house and skip previous
        // Option 2: skip this house
        // System.out.println("Value i: "+ i + " <-> i-1 <-> "+ (i-1) +" <-> i-2 <-> "+ (i-2));
        int max_rob= Math.max(helper(nums, i - 1), nums[i] + helper(nums, i - 2));
        // System.out.println("Max rob: for i: "+i+" value is: "+ max_rob);
        return max_rob;
    }

    private int  robRecursion(int []nums, int index)
    {
        if(index < 0)
        {
            return 0;
        }
        if(index == 0)
        {
            return nums[0];
        }


        if(index == 1)
        {
             return Math.max(nums[0], nums[1]);
        }


        int inclusion  = nums[index] + robRecursion(nums, index -2);
        int exclusion =  robRecursion(nums, index -1);
        return Math.max(inclusion, exclusion);
    }
     private int  robRecursionMemo(int []nums, int index, int[] memo)
    {
        if(index < 0)
        {

            return 0;
        }
        if(index == 0)
        {
            return nums[0];
        }

        if(memo[index] != -1){
            return memo[index];
        }

        if(index == 1)
        {
             return Math.max(nums[0], nums[1]);
        }


        int inclusion  = nums[index] + robRecursionMemo(nums, index -2,memo);
        int exclusion =  robRecursionMemo(nums, index -1,memo);
        memo[index] = Math.max(inclusion, exclusion);
        return memo[index];
    }

}