package Graph.Basics.Questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Bellman_Ford_Algorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;
    public Bellman_Ford_Algorithm(int v){
        this.map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<Integer, Integer>());
        }
    }
    // directed graph
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
    }

    class EdgePair{
        int e1;
        int e2;
        int cost;
        public EdgePair(int e1, int e2, int cost){
            this.e1=e1;
            this.e2=e2;
            this.cost = cost;
        }
        public String toString(){
            return e1+ "-" + e2 + "@" + cost;
        }
    }

    public List<Bellman_Ford_Algorithm.EdgePair> getAllEdges(){
        List<Bellman_Ford_Algorithm.EdgePair> ll = new ArrayList<>();
        for(int e1: map.keySet()){
            //traversing on neighbours
            for(int e2: map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
                ll.add(new Bellman_Ford_Algorithm.EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }
    public void BellmanFord(){
        int v = map.size();
        int dis[] = new int[v+1]; // kyuki 0th index humare kaam ka ni h (vertex 1 se start h not from 0)
        for(int i=2;i<dis.length;i++){
            dis[i] = 9999999;  // second index se+infinity put krna h array m
        }
        List<EdgePair> ll = getAllEdges(); // saare edges manga liye
        for(int i=1;i<=v;i++) {
            for (EdgePair e : ll) {
                if(i==v && dis[e.e2] > dis[e.e1] + e.cost){
                    System.out.println("-wt Cycle");
                    return;
                }
                if (dis[e.e2] > dis[e.e1] + e.cost) {
                    dis[e.e2] = dis[e.e1] + e.cost; // relaxation of edge
                }
            }
        }
        for(int i=1;i<dis.length;i++){
            System.out.print(dis[i]+" ");
        }
    }

    public static void main(String[] args){
        Bellman_Ford_Algorithm bfd = new Bellman_Ford_Algorithm(5);
        bfd.AddEdge(1, 2, 8);
//        bfd.AddEdge(2, 5, -2);
        bfd.AddEdge(2, 5, 2);
        bfd.AddEdge(5, 2, 1);
        bfd.AddEdge(4, 5, 4);
        bfd.AddEdge(3, 4, -3);
        bfd.AddEdge(1, 3, 4);
        bfd.AddEdge(1, 4, 5);
        bfd.BellmanFord();
    }
}
