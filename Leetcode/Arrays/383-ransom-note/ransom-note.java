class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
           
        int[] alphabetCount= new int[26];
        
        for(char c : magazine.toCharArray()){
            
            alphabetCount[c- 'a']++;
            
            
        }
        
        for(char c  : ransomNote.toCharArray()){
            if(alphabetCount[c-'a'] == 0) return false;
            alphabetCount[c-'a']--;
        }
        return true;
    }
}