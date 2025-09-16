package Recursion.Medium.BacktrackingStart;

public class QueenCombination {
    public static void main(String[] args){
        int n = 4; // board length
        boolean[] board = new boolean[n];
        int tq = 2; // totalqueen
        Combination(board, tq, "", 0,0);
    }
    public static void Combination(boolean[] board, int tq, String ans, int queenplacedsofar, int index){
        if(queenplacedsofar== tq){
            System.out.println(ans);
            return;
        }
        // jitni board ki length utni calls jayengi
        for(int i=index;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                Combination(board, tq, ans+'b'+i+'q'+queenplacedsofar, queenplacedsofar+1, i+1);
                board[i]= false;
            }
        }
    }
}
