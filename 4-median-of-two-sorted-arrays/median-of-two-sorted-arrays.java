class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return medians(nums1,nums2);
    }
    public static double medians(int[] nums1,int[]nums2){
        double median=0;
        int[]ans=merge(nums1,nums2);
        if(ans.length%2==0){
            median=(ans[ans.length/2-1]+ans[ans.length/2])/2.0;
            return median;
        }
       return ans[ans.length/2];
    }
    public static int[] merge(int[]nums1,int[]nums2){
        int n=nums1.length;
        int m=nums2.length;
        int[]ans=new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
               ans[k]=nums1[i];
               i++;
               k++; 
            }
            else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k]=nums1[i];
            i++;
            k++;
        }
        while(j<m){
            ans[k]=nums2[j];
            j++;
            k++;
        }
        return ans;
    }
}