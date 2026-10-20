class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int last = m+n-1;
        
        // add from the end
            
            while (m>0 && n>0)
            {
                if (nums1[m-1] < nums2[n-1]){
                    nums1[last]= nums2[n-1];
                    n-=1;
                }
                else{
                    nums1[last]= nums1[m-1];
                    m-=1;
                }
                last -=1;
            }
//         if any remaining on nums2 but smaller than nums1 then copy all
        while (n>0){
            nums1[last]=nums2[n-1];{
                n--;last--;
            }
        }
    }
}