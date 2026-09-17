class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer>ans=new ArrayList<>();
        for(int i=1;i<=9;i++){
            print(i,n,ans);
        }  
        return ans;     
    }  
    public static List<Integer> print(int current,int n,List<Integer>ans){
        if(current>n){
           return ans;
        }
     ans.add(current);
        int i=0;
        if(current==0){
            i=1;
        }
        for(;i<=9;i++){
            print(current*10+i,n,ans);
        }
        return ans;
    } 
}