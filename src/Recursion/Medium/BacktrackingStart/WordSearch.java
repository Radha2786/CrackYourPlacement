package Recursion.Medium.BacktrackingStart;

public class WordSearch {
    public static void main(String[] args){
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABA";
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
               if(board[i][j]== word.charAt(0)){
                   boolean ans = Search(board, i, j, word,0);
                   if(ans == true){
                       System.out.println("true");
                       return;
                   }
               }
            }
        }
        System.out.println("false");

    }

    public static boolean Search(char[][] board, int row, int col, String word, int index){

        if(index==word.length()){
            return true;
        }

        if(row<0 || col<0 || row==board.length || col== board[0].length || board[row][col]!=word.charAt(index) || board[row][col]=='*'){
            return false;
        }

        board[row][col]='*';

        // up call
        boolean up = Search(board, row-1, col, word, index+1);
        // down
        boolean down = Search(board, row+1, col, word, index+1);
        // right
        boolean right = Search(board, row, col+1, word, index+1);
        // left
        boolean left = Search(board, row, col-1, word, index+1);
        if(up== true || down== true || right== true || left== true ){
            return true;
        }
        board[row][col] = word.charAt(index);
        return false;
    }
}
