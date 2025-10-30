package Graph.Basics.Questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Topological_Sort {

    HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public Topological_Sort(int v){
        for(int i=1;i<=v;i++){
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2){
        map.get(v1).put(v2,0);
    }

    public void TopologicalSort(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int[] ind = indegree();
        for(int i=1;i<ind.length;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
//            1. remove
            int front = q.poll();
            System.out.print(front+ " ");
            //2 jo bhi iske neighbours hai unki indegree ko 1 se kam kr de
            for(int nbr: map.get(front).keySet()){
                ind[nbr]--;
                if(ind[nbr]==0){
                    q.add(nbr);
                }
            }
        }
    }

    public int[] indegree(){
        int[] arr = new int[map.size()+1];
        for(int key: map.keySet()){
            for(int nbrs: map.get(key).keySet()){
                arr[nbrs]++;
            }
        }
        return arr;
    }

    public boolean isCycle(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        int[] ind = indegree();
        for(int i=1;i<ind.length;i++){
            if(ind[i]==0){
                q.add(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
//            1. remove
            int front = q.poll();
            count++;
//            System.out.print(front+ " ");
            //2 jo bhi iske neighbours hai unki indegree ko 1 se kam kr de
            for(int nbr: map.get(front).keySet()){
                ind[nbr]--;
                if(ind[nbr]==0){
                    q.add(nbr);
                }
            }
        }
        if(count!=map.size()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Topological_Sort ts = new Topological_Sort(7);
        ts.AddEdge(1,2);
        ts.AddEdge(1,4);
        ts.AddEdge(4,3);
        ts.AddEdge(3,2);
        ts.AddEdge(4,5);
        ts.AddEdge(5,7);
        ts.AddEdge(6,3);
        ts.AddEdge(6,7);
//        ts.AddEdge(3,1); // for cycle(like if we wanna create cycle, iscycle will return true)
        ts.TopologicalSort();
        System.out.println(ts.isCycle());

    }

}
