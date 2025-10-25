package Graph.Revision;
import java.util.*;
public class Graph2 {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph2(int v){
        map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i, new HashMap<Integer, Integer>());
        }
    }

    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost);
        map.get(v2).put(v1,cost);
    }

    public void AddVtx(int v){
        map.put(v, new HashMap<>());
    }

    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }

    public int NumberOfEdge(){
//        har edge 2 vertex se connected hai so...
        int sum =0;
        for(int key: map.keySet()){
            sum+=map.get(key).size();
        }
        return sum/2;
    }

    public void RemoveEdge(int v1, int v2){
        if(containsEdge(v1,v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void RemoveVertex(int v){
        for(int nbr: map.get(v).keySet()){
            map.get(nbr).remove(v);
        }
        map.remove(v);
    }

    public void display(){
        for(int key: map.keySet()){
            System.out.print(key+"--->"+ map.get(key));
        }
        System.out.println();
    }

    public boolean HasPath(int src, int destination, HashSet<Integer> visited){

        if(src==destination){
            return true;
        }

        visited.add(src);

        for(int nbr: map.get(src).keySet()){
            if(!visited.contains(nbr)){
               if( HasPath(nbr, destination, visited)){
                   return true;
               }
            }
        }
        return false;
    }

    public void PrintAllPath(int src, int des, HashSet<Integer> visited, String ans){
        if(src==des){
            System.out.println(ans);
            return ;
        }

        visited.add(src);

        for(int nbr: map.get(src).keySet()){
            if(!visited.contains(nbr)){
                PrintAllPath(nbr,des,visited,ans+nbr);
            }
        }
        visited.remove(src);
    }

    public boolean BFS(int src, int des){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(src);
        while(!q.isEmpty()){
            // 1. remove
           int val = q.poll();
           //2. ignore
            // 1 baar visit ho chuka hai...
            if(visited.contains(val)){
                continue;
            }
            //3. mark visited
            visited.add(val);
            //4. self work
            if(val==des){
                return true;
            }
            //5. add unvisited nbr
            for(int key: map.get(val).keySet()){
                if(!visited.contains(key)){
                    q.add(key);
                }
            }
        }
        return false;
    }
    public void BFT(){
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int key: map.keySet()){
            if(!visited.contains(key)){
                q.add(key);
            }else{
                continue;
            }
            while(!q.isEmpty()){
                // 1. remove
                int ans = q.remove();
                // 2. ignore
                if(visited.contains(ans)){
                    continue;
                }

                //3. mark visited
                visited.add(key);

                //4. self work
                System.out.print(key+" ");

                //5. add unvisited nbr
                for(int nbr: map.get(key).keySet()){
                    if(!visited.contains(nbr)){
                        q.add(nbr);
                    }
                }
            }
        }
    }
}
