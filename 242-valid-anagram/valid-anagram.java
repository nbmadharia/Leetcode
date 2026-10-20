class Solution {
    public boolean isAnagram(String s, String t) {
        if(Arrays.equals(check(s),check(t))){
            return true;
        }
        return false;
    }
    public int[] check(String str){
        int[] count = new int[26];
        for(int i=0; i< str.length(); i++){
            count[str.charAt(i) - 97]++;
        }
        return count;
    }
}