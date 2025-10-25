package Graph.Basics.Questions;

import java.util.HashMap;
import java.util.*;

public class Prims_Algorithm {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Prims_Algorithm(int v){
        this.map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<Integer, Integer>());
        }
    }

    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
        map.get(v2).put(v1,cost);
    }

    class PrimsPair{
        int v;
        int acqv;
        int cost;
        public PrimsPair(int v, int acqv, int cost){
            this.v =v;
            this.acqv=acqv;
            this.cost = cost;
        }
        public String toString(){
            return v+ "-" + acqv + "@" + cost;
        }
    }
    public int prims(){
        PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
            @Override
            public int compare(PrimsPair o1, PrimsPair o2) {
                return o1.cost-o2.cost;
            }

        });
        HashSet<Integer> visited = new HashSet<>();
        pq.add(new PrimsPair(1,1,0));
        int sum=0;
        while(!pq.isEmpty()){
            //1 remove
            PrimsPair rp = pq.poll();
            //2 ignore if already visited
            if(visited.contains(rp.v)){
                continue;
            }
            //3. Mark visited
            visited.add(rp.v);
            //4. self work
            System.out.println(rp);
            sum += rp.cost;
            //5. add univisted nbrs
            for(int nbrs: map.get(rp.v).keySet()){
                if(!visited.contains(nbrs)){
                    int cost = map.get(rp.v).get(nbrs);
                    pq.add(new PrimsPair(nbrs,rp.v,cost));
                }
            }
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking vertex
        Prims_Algorithm pk = new Prims_Algorithm(n);
        int m = sc.nextInt(); // no.of edges
        for(int i=0; i<m;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int cost = sc.nextInt();
            pk.AddEdge(v1,v2,cost);
        }
        System.out.println(pk.prims());
    }
}

// input
//4 5
//        1 2 10
//        2 3 15
//        1 3 5
//        4 2 2
//        4 3 40
