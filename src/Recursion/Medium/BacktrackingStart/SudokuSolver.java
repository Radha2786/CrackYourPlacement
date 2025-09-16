package Recursion.Medium.BacktrackingStart;

public class SudokuSolver {
    public static void main(String[] args){
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        Sudoku(board, 0 , 0);
    }
    public static void Sudoku(char[][] board, int row, int col) {
        // base case
        if(col==board.length){
            col=0;
            row++;
        }
        if(row==board.length){
            Print(board);
            return;
        }
    if(board[row][col]!='.'){
        Sudoku(board, row, col+1); // next column k liye check kr
    }else {
        for (char val = '1'; val <= '9'; val++) {
            if (checkSafe(val, row, col, board)) {
                board[row][col] = val;
                Sudoku(board, row, col + 1);
                board[row][col] = '.';
            }
        }
    }
    }

    public static boolean checkSafe(char val, int row, int col, char[][] board){
        for(int i = 0;i< board.length;i++){
            if(board[i][col]==val){
                return false;
            }
            if(board[row][i]==val){
                return false;
            }
            if(board[3* (row/3)+ i/3][3* (col/3) + i% 3]== val){
                return false;
            }
        }
        return true;
    }

    public static void Print(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

}
