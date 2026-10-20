class Solution {
    public int maxScore(String s) {
        char[] list = s.toCharArray();
        int[] nums = new int[list.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=list[i] - '0';
        }
        int c = 0;
        int sum=0;
        int maxSum=0;
        for(int i = nums.length -1; i>= 0 ; i--){
            if(nums[i] == 1){
                c++;
                nums[i]=c;
            }


        }
        c=0;
        for(int i = 0 ; i< nums.length -1 ; i++){
            if(nums[i] == 0){
                c++;

            }
            sum= c + nums[i+1];
            maxSum=Math.max(sum,maxSum);
        }
        

        return maxSum;
    }
}