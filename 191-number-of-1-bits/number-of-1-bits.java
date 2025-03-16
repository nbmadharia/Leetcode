class Solution {
    public int hammingWeight(int n) {
        int out = 0;
        if(n==1){
            return 1;
        }
        // System.out.println("Outside while: " + n / 2);
        while (n / 2 >= 2) {
            
            // System.out.println("Out 1: " + out + " n: " + n);
            if (n % 2 == 1) {
                // System.out.println("Out 2 if: " + out + " n: " + n);
                out++;
            }
            n /= 2;
        }
        if(n==2){
            out++;
        }
        else if(n==3){
            out+=2;
        }
        return out;
    }
}