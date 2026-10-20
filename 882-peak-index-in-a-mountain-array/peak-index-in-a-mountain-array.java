class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        // int n = arr.length;
        // int max = Integer.MIN_VALUE;
        // int index=-1;
        // for(int i=0 ; i < n; i++){
        //     if(arr[i] > max){
        //         max=arr[i];
        //         index=i;
        //     }
        // }
        // return index;
    //======== using binary search ========
    int left = 0, right=arr.length -1 ;
    while (left < right){
        int mid = left + (right - left)/2;

        if(arr[mid] < arr[mid +1]){ 
            left = mid + 1;

        }
        else{
            right = mid;
        }
    
    }
    return left;
    }
}