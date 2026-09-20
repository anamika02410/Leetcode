class Solution {
    public int climbStairs(int n) {
        int[]store=new int[n+1];
        return print( n,store);
    }
    public static int print(int n,int[]store){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        if(store[n]!=0){
            return store[n];
        }
        store[n]=print(n-1,store)+print(n-2,store);
        return store[n];
    }
}