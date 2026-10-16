class Solution {
    public void solveSudoku(char[][] board) {
        print(board,0,0);
    }
        public static boolean print(char[][]board,int cr,int cc) {
             if(cr==9) {
            return true;
        }
        if(cc==9) {
            return print(board,cr+1,0);
        }
    
        if (board[cr][cc] != '.') {
           return print(board, cr, cc + 1);
        } else {
            for (int i = 1; i <= 9; i++) {
                if (isSafe(board, cr, cc, i) == true) {
                    board[cr][cc] =(char)( i+'0');
                   if( print(board, cr, cc+1)){
                    return true;
                   }
                    board[cr][cc] = '.';
                }
            }
        }
        return false;
        }
     
     public static boolean isSafe(char[][]board,int cr,int cc,int val) {
        char ch=(char)(val+'0');
            for(int i=0;i<9;i++){
                if(board[cr][i]==ch){
                    return false;
                }
            }
            for(int i=0;i<9;i++){
                if(board[i][cc]==ch){
                    return false;
                }
            }
            int row=cr-cr%3;
            int col=cc-cc%3;
            for(int i=row;i<row+3;i++){
                for(int j=col;j<col+3;j++){
                    if(board[i][j]==ch){
                        return false;
                    }
                }
            }
            return true;
     }
    }
