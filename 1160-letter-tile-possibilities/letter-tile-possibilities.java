class Solution {
    public int numTilePossibilities(String tiles) {
        count=0;
        boolean[]used=new boolean[tiles.length()];
        char[]arr=tiles.toCharArray();
        Arrays.sort(arr);
        sequence(arr,used);
        return count;
    }
     static int count=0;
    public static void sequence(char[]arr,boolean[]used){
       for(int i=0;i<arr.length;i++){
        if(used[i])
        continue;
        if(i>0 && arr[i]==arr[i-1] && !used[i-1])
        continue;
        count++;
        used[i]=true;
        sequence(arr,used);
        used[i]=false;
       }
       
    }
}
