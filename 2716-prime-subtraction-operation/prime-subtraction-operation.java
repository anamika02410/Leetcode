class Solution {
    public boolean primeSubOperation(int[] nums) {
        return prime(nums);
    }
    public static boolean prime(int[]nums){
        int n=nums.length;
        int max=1000;
        boolean[]board=new boolean[max+1];
        for(int i=2;i<board.length;i++){
            board[i]=true;
        }
        for(int i=2;i*i<board.length;i++){
            if(board[i]==true){
                for(int j=2;j*i<board.length;j++){
                    board[i*j]=false;
                }
            }
        }
        int prev=0;
        for(int i=0;i<n;i++){
            int p=nums[i]-1;
            while(p>=2){
                if(board[p]==true && nums[i]-p > prev){
                    nums[i]=nums[i]-p;
                    break;
                }
                p--;
            }
            if(nums[i]<=prev){
                return false;
            }
            prev=nums[i];
        }
        return true;

    }
}