class Solution {
    public boolean exist(char[][] board, String word) {
         for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0)==board[i][j]){
                    boolean ans=wordsearch(board,word,i,j,0);
                    if(ans==true){
                        return true;
                    }
                }
            }
         }
            return false;
        }
    public static boolean wordsearch(char[][]board,String word,int cr,int cc,int idx){
            if(idx==word.length()){
                return true;
            }
            if(cr<0 || cc<0 || cr>=board.length || cc>=board[0].length || word.charAt(idx)!=board[cr][cc]){
                return false;
            }
            board[cr][cc]='*';
            int[] r={-1,1,0,0};
            int[] c={0,0,-1,1};
            for(int i=0;i<c.length;i++){
               boolean ans= wordsearch(board,word,cr+r[i],cc+c[i],idx+1);
               if(ans){
                return true;
               }
            }
            board[cr][cc]=word.charAt(idx);
            return false;
        }
}