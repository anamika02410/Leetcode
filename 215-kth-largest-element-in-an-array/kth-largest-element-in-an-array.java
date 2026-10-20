class Solution {
    public int findKthLargest(int[] nums, int k) {
        int[]ans=sort(nums,k,0,nums.length-1);
        return ans[k-1];
    }
    public static int[] sort(int[]nums,int k,int si, int ei){
        if(si==ei){
            int[]base=new int[1];
            base[0]=nums[si];
            return base;
        }
        int mid=si+(ei-si)/2;
        int[]left=sort(nums,k,si,mid);
        int[]right=sort(nums,k,mid+1,ei);
        return merge(k,left,right);
    }
    public static int[] merge(int k,int[] left,int[]right){
        int n=left.length;
        int m=right.length;
        int[]ans=new int[n+m];
        int i=0;
        int j=0;
        int l=0;
        while(i<n && j<m){
            if(left[i]>right[j]){
                ans[l]=left[i];
                i++;
                l++;
            }
            else{
                ans[l]=right[j];
                j++;
                l++;
            }
        }
        while(i<n){
            ans[l]=left[i];
            i++;
            l++;
        }
        while(j<m){
            ans[l]=right[j];
            l++;
            j++;
        }
       return ans;
    }
}