class Solution {
    public int minStartValue(int[] nums) {
        int min = Integer.MAX_VALUE;
        boolean flag= true;
        flag = nums[0] > 0 ? true:false;

        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < 0){
                flag=false;
            }
            nums[i] = nums[i] + nums[i - 1];
        }
        // for (int i : nums) {
        //     System.out.println(i);
        // }
        for(int i =0 ; i< nums.length ; i++){
            
            min = Math.min(nums[i],min);
        }
        if(flag){
            return 1;
        }

        // System.out.println(min);
        if(min >=1 ){
            return 1;
        }
        return Math.abs(min) +1;
    }
    //-3, -1, -4,0,2
    //5
}