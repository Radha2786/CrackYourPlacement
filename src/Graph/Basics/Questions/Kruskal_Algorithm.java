package Graph.Basics.Questions;

import java.util.*;

public class Kruskal_Algorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Kruskal_Algorithm(int v){
        this.map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<Integer, Integer>());
        }
    }

    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
        map.get(v2).put(v1,cost);
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

    public List<EdgePair> getAllEdges(){
        List<EdgePair> ll = new ArrayList<>();
        for(int e1: map.keySet()){
            //traversing on neighbours
            for(int e2: map.get(e1).keySet()){
                int cost = map.get(e1).get(e2);
                ll.add(new EdgePair(e1,e2,cost));
            }
        }
        return ll;
    }

    public int Kruskal(){
        //1. saara edge list manga liya and then sort kr liya
        List<EdgePair> ll = getAllEdges();
        //2.
        Collections.sort(ll, new Comparator<EdgePair>(){
            @Override
            public int compare(EdgePair o1, EdgePair o2) {
                return o1.cost-o2.cost;
            }
        });
        int sum=0;
        DisjointSet dsu = new DisjointSet();
        for(int v : map.keySet()){
            dsu.CreateSet(v);
        }
        for(EdgePair e : ll){
            int re1 = dsu.find(e.e1);
            int re2 = dsu.find(e.e2);
            if(re1 == re2){
                // nothinng
            }else{
                dsu.Union(e.e1,e.e2);
                sum+=e.cost;
                System.out.println(e);
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking vertex
        Kruskal_Algorithm ks = new Kruskal_Algorithm(n);
        int m = sc.nextInt(); // no.of edges
        for(int i=0; i<m;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            ks.AddEdge(v1,v2,cost);
        }
        System.out.println(ks.Kruskal());
    }

}
