class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[]ans= sorted(nums1,m,nums2,n);
       for(int i=0;i<ans.length;i++){
        nums1[i]=ans[i];
       }
    }
    public static int[] sorted(int[]arr1,int n, int[]arr2,int m){
        int[] ans = new int[n+m];
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                ans[k]=arr1[i];
                k++;
                i++;
            }
            else{
                ans[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<n){
            ans[k]=arr1[i];
            k++;
            i++;
        }
        while(j<m){
            ans[k]=arr2[j];
            j++;
            k++;
        }
        return ans;

    }
}