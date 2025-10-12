//package Graph.Basics.Questions;
//
//import java.util.HashMap;
//import java.util.*;
//
//public class Prims_Algorithm {
//    HashMap<Integer, HashMap<Integer, Integer>> map;
//
//    public Prims_Algorithm(int v){
//        this.map = new HashMap<>();
//        for(int i=1;i<=v;i++){
//            map.put(i,new HashMap<Integer, Integer>());
//        }
//    }
//
//    public void AddEdge(int v1, int v2, int cost){
//        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
//        map.get(v2).put(v1,cost);
//    }
//
//    class PrimsPair{
//        int v;
//        int acqv;
//        int cost;
//        public PrimsPair(int v, int acqv, int cost){
//            this.v =v;
//            this.acqv=acqv;
//            this.cost = cost;
//        }
//        public String toString(){
//            return v+ "-" + acqv + "@" + cost;
//        }
//    }
//    public int prims(){
//        PriorityQueue<PrimsPair> pq = new PriorityQueue<>();
//    }
//}
