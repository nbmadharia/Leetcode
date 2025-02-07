class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n= temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i< n; i++){
            
            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int prev= stack.pop();
                //1,1,4,2
                ans[prev]= i-prev;
            }
            //i
            stack.push(i);
        }
        return ans;

    }
}