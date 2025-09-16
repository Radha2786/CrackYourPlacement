package Recursion.Medium.BacktrackingStart;

public class QueenPermutation {
    public static void main(String[] args){
        int n = 4; // board length
        boolean[] board = new boolean[n];
        int tq = 2; // totalqueen
        Permutation(board, tq, "", 0);
    }
    public static void Permutation(boolean[] board, int tq, String ans, int queenplacedsofar){
        if(queenplacedsofar== tq){
            System.out.println(ans);
            return;
        }
        // jitni board ki length utni calls jayengi
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Permutation(board, tq, ans+'b'+i+'q'+queenplacedsofar, queenplacedsofar+1);
                board[i]= false;
            }
        }
    }
}
