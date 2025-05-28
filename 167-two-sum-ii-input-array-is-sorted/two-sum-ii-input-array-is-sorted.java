class Solution {
    public static int[] twoSum(int[] numbers, int target) {
            
            int start = 0;
            int end= numbers.length -1;
            int currentSum= 0;
            int[] out = new int[2];
            for(int i=0; i<numbers.length -1 ;i++){
                if(numbers[start ] + numbers[end] == target){
                    out[0]=start +1;
                    out[1]=end + 1;


                }
                else if (numbers[start ] + numbers[end] > target){
                    end--;
                }
                else{
                    start++;
                }
            }
            return out;

        }

}