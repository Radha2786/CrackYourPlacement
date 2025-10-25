package Graph.Revision;
import java.util.*;
// graph representation.......
// 1. Adjacency matrix
//2. Adjacency list
public class Graph {
    public static void main(String[] args) {
        int n = 3, m = 3;
        int adj[][] = new int[n+1][m+1];    //bcz graph can have indexing 1 based

       // edge 1--2
        adj[1][2] = 1;
        adj[2][1] = 1;

        // edge 2--3
        adj[2][3]=1;
        adj[3][2]=1;

        //edge 1--3
        adj[1][3]=1;
        adj[3][1]=1;

//        for(int i=0;i<adj.length;i++){
//            for(int j=0;j<adj[i].length;j++){
//                System.out.print(adj[i][j]);
//            }
//            System.out.println();
//        }

        // Adjacency list
        ArrayList<ArrayList<Integer>> adjlist = new ArrayList<ArrayList<Integer>> ();
        for(int i=0; i<=n;i++){
            adjlist.add(new ArrayList<>());
        }
        // edge 1--2
        adjlist.get(1).add(2);
        adjlist.get(2).add(1);

        // edge 2--3
        adjlist.get(2).add(3);
        adjlist.get(3).add(2);

//        adjlist.get(u).add(v);
//        adjlist.get(v).add(u);

        for(int i=1;i<=n;i++){
            for(int j=0;j<adjlist.get(i).size();j++){
                System.out.print(adjlist.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
