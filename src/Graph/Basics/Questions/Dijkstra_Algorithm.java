package Graph.Basics.Questions;

import java.util.HashMap;

public class Dijkstra_Algorithm {

    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Dijkstra_Algorithm(int v){
        this.map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<Integer, Integer>());
        }
    }
    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
        map.get(v2).put(v1,cost);
    }

    class DijkstraPair{
        int vtx;
        String path;
        int cost;

        public DijkstraPair(int vtx, String path, int cost){
            this.vtx = vtx;
            this.path = path;
            this.cost = cost;
        }
    }
}
