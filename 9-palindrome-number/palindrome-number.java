class Solution {
    public boolean isPalindrome(int x) {
        // int tmp=x;
        // int rev=0;
        // while(x>0){
        //     rev= (rev*10) + (x%10);
        //     x/=10;
        // }
        // if (rev == tmp){
        //     return true;
        // }
        // return false;
        
        int tmp = x;
        int rev = 0;

        while(x>0){
            rev = (rev*10) + (x%10);
        //             System.out.println("rev" + rev);
        // System.out.println("x " + x);

            x/=10;
        }
        // System.out.println("rev "+rev);
        if(rev == tmp){
            return true;
        }
        return false;
    }
}