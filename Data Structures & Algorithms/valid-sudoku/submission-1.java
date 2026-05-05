class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
           HashSet<Character> set = new HashSet<>(); 
           for(int j=0;j<board[0].length;j++){
              if (set.contains(board[i][j])) return false;
              if(board[i][j]=='.') continue;
              set.add(board[i][j]); 
           }
        }

        for(int i=0;i<board[0].length;i++){
           HashSet<Character> set = new HashSet<>(); 
           for(int j=0;j<board.length;j++){
              if (set.contains(board[j][i])) return false;
              if(board[j][i]=='.') continue;
              set.add(board[j][i]); 
           }
        }
        
        for(int boxRow = 0;boxRow<3;boxRow++){
            for(int boxCol = 0; boxCol<3;boxCol++){
                HashSet<Character> set = new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        int row = boxRow * 3 +i ;
                        int col = boxCol * 3 +j ;
                        
                        if(board[row][col] == '.') continue;
                        if(set.contains(board[row][col])) return false;
                        set.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }
}
