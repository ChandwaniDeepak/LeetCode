

public class TicTacToe348 {

    int[][] board;
    int size;

    /** Initialize your data structure here. */
    public TicTacToe348(int n) {
        size = n;
        board = new int[n][n];
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        if(player == 1){
            board[row][col] = 1;
        }else{
            board[row][col] = 2;
        }
        return validateBoard(row, col, player);
    }

    public int validateBoard(int r, int c, int player){
        if(checkColumnInRow(r, c, player)){
            return player;
        }else if(checkRowInColumn(r, c, player)){
            return player;
        }else if(r == c && checkDiagonal(r, c, player)){
                return player;
        }else if(r == size-c-1  &&  checkOtherDiagonal(r, c, player)){
            return player;
        }
        return 0;

    }

    public boolean checkColumnInRow(int r, int column, int player){
        for(int col = 0; col < size; col++){
            if(board[r][col] != player){
                return false;
            }
        }
        return true;
    }

    public boolean checkRowInColumn(int r, int col, int player){
        for(int row = 0; row < size; row++){
            if(board[row][col] != player){
                return false;
            }
        }
        return true;
    }

    public boolean checkDiagonal(int r, int col, int player){
        for(int i = 0; i < size; i++){
            if(board[i][i] != player){
                return false;
            }
        }
        return true;
    }

    public boolean checkOtherDiagonal(int r, int col, int player){
        for(int i = 0; i < size; i++){
            if(board[i][size-i-1] != player){
                return false;
            }
        }
        return true;
    }


}

/**
 * Your TicTacToe object will be instantiated and called as such:
 * TicTacToe obj = new TicTacToe(n);
 * int param_1 = obj.move(row,col,player);
 */