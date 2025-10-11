package Graph.Basics;
import java.util.*;
public class GraphClient {
    public static void main(String[] args){
        Graph1 g = new Graph1(7);

        g.AddEdge(1, 4, 6);
        g.AddEdge(1, 2, 10);
        g.AddEdge(2, 3, 7);
        g.AddEdge(3, 4, 5);
//        g.AddEdge(4, 5, 1);
        g.AddEdge(5, 6, 4);
        g.AddEdge(7, 5, 2);
        g.AddEdge(6, 7, 3);

//        g.RemoveEdge(1, 4);

//        g.RemoveVertex(6);

//        g.Display();

//       System.out.println(g.containsEdge(1,4));
//       System.out.println(g.containsVertex(6));
//       System.out.println(g.NumberOfEdge());

//        System.out.println(g.hasPath(1, 6,new HashSet<Integer>()));

//        g.PrintAllPath(1,6,new HashSet<Integer>(), "");

//        System.out.println(g.BFS(1,6));
//        System.out.println(g.DFS(1,6));

        g.BFT();

    }
}
