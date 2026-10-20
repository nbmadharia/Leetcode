class Solution {
    public int balancedStringSplit(String s) {

        int diff=0,count =0;
        for(char c : s.toCharArray()){
            // System.out.println(c);
            if(c=='R'){
                diff--;
            }
            else if(c=='L'){
                diff++;
            }
            if(diff==0){
                count++;
            }
        }
        return count;
    }
}