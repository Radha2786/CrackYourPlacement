package Recursion.Medium.BacktrackingStart;

import java.util.ArrayList;
import java.util.Scanner;

public class RatInAMaze {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] maze = new char[n][m];
        for(int i=0;i<n;i++){
            String s = sc.next();
            for(int j=0;j<s.length();j++){
                maze[i][j] = s.charAt(j);
            }
        }
        RatinamMaze(maze,0,0,list,"");
        System.out.println(list);
    }
    public static void RatinamMaze(char[][] maze, int row, int col, ArrayList<String> list, String moves){
        if(row== maze.length-1 && col == maze[0].length-1){
            list.add(moves);
            return;
        }
        if(row<0 || col<0 || row==maze.length || col== maze[0].length || maze[row][col]=='X'){
            return ;
        }
        maze[row][col]='X';
//        neeche wali cheej ko hum loop se bhi kr skte hain
//        int[] r = {0,0,-1,1};
//        int[] c = {1,-1,0,0};
//        for(int i=0;i<c.length;i++){
//            RatinamMaze(maze, row+r[i], col+c[i], list, moves);
//
//        }
        // right
        RatinamMaze(maze, row, col+1,  list, moves+'R');
        //left
        RatinamMaze(maze, row, col-1, list,  moves+'L');
        // up
        RatinamMaze(maze,row-1,  col,  list, moves+'U');
        //down
        RatinamMaze(maze, row+1, col,  list,  moves+'D');
        maze[row][col]='0';
    }
}
