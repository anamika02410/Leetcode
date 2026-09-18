class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
        if(arr[mid+1]>arr[mid]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}