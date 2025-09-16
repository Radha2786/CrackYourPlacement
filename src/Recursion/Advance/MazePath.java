package Recursion.Advance;

public class MazePath {
    public static void main(String[] args){
        int n=3;
        int m =3;
        PrintMazePath(n, m , 0, 0, "");
    }
    public static void PrintMazePath(int n, int m , int row, int col, String ans){
        // two calls
        // horizontal call
        if(row==n-1 && col==m-1){
            System.out.println(ans);
            return;
        }
        if(row==n || col==m){
            return ;
        }
        PrintMazePath(n,m,row, col+1, ans+"H");
        PrintMazePath(n,m,row+1, col, ans+"V");
    }
}
