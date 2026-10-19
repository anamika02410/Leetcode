class Solution {
    public int countPrimes(int n) {
         return prime(n);
    }
    public static int prime(int n){
        int count=0;
       if(n<=2){
        return 0;
       }
        boolean[]board=new boolean[n+1];
        for(int i=2;i<n;i++){
            board[i]=true;
        }
        for(int i=2;i<n;i++){
            if(board[i]==true){
                for(int j=2;j*i<n;j++){
                    board[i*j]=false;
                }
            }
        }
        for(int i=2;i<n;i++){
            if(board[i]==true){
                count++;
            }
        }
        return count;
   }
}