class Solution {
    public String reverseWords(String s) {
        String[] parts = s.trim().split("\\s+");

        String[] reverse = new String[parts.length];
        for(int i= 0; i< parts.length ; i++){
            reverse[i]= parts[parts.length -1 -i];
        }  
        String out = String.join(" ",reverse);
        return out;
    }
}