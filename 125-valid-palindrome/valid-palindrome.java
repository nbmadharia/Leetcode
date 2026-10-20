class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","");
        s=s.toLowerCase();
        // System.out.println(s);
        
        int i = 0;
        int j = s.length()-1;
        char first;
        char second;
        // System.out.println(second);
        while(i<= j){
            first = s.charAt(i);
            second = s.charAt(j);
            
            // System.out.println("i is: "+ i + " j is: "+ j);
            // System.out.println("first is: "+first);
            // System.out.println("second is: " + second);
            
            if(first != second){
                
                return false;
            }
            i++;j--;
        }
        return true;
    }
}