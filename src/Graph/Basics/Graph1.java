package Graph.Basics;
import java.util.*;
public class Graph1 {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph1(int v){
        this.map = new HashMap<>();
        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<Integer, Integer>());
        }
    }

    public void AddEdge(int v1, int v2, int cost){
        map.get(v1).put(v2,cost); // v1--> map get kra then put v2 and Cost
        map.get(v2).put(v1,cost);
    }

    public void AddVtx(int v1){
        map.put(v1, new HashMap<>());
    }

    public boolean containsEdge(int v1, int v2){
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }

    public int NumberOfEdge(){
        int sum=0;
        for(int key: map.keySet()){
            sum+= map.get(key).size();
        }
        return sum/2;
    }

    public void RemoveEdge(int v1, int v2){
       if(containsEdge(v1,v2)){
           map.get(v1).remove(v2);
           map.get(v2).remove(v1);
       }
    }
    public void RemoveVertex(int v){
        for(int neighbor: map.get(v).keySet()){
            map.get(neighbor).remove(v);
        }
        map.remove(v);
    }

    public void Display(){
        for(int key:map.keySet()){
            System.out.println(key+"--->"+ map.get(key));
        }
    }
    public boolean hasPath(int src, int destination, HashSet<Integer> visited){
        if(src==destination){
            return true;
        }

        visited.add(src);

        for(int neighbour: map.get(src).keySet()){
            if(!visited.contains(neighbour)){
            boolean ans=hasPath(neighbour, destination,  visited);
            if(ans){
                return ans;
            }
            }
        }
        return false;
    }

    public void PrintAllPath(int src, int des, HashSet<Integer> visited, String ans){
        if(src==des){
            System.out.println(ans);
            return;
        }
        visited.add(src);
        for(int neighbour: map.get(src).keySet()){
            if(!visited.contains(neighbour)){
                PrintAllPath(neighbour, des,  visited,ans+src+" ");
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
            int nbr=q.poll();
            // 2. ignore if already visited
            if(visited.contains(nbr)){
                continue;
            }
            //3. add visited
            visited.add(nbr);
            //4. selfwork
            if(nbr==des){
                return true;
            }
            //5. add unvisited neighbours
            for(int nbrs: map.get(nbr).keySet()){
                if(!visited.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
        }

        public boolean DFS(int src, int des){
        Stack<Integer> st = new Stack<>();
        st.push(src);
        HashSet<Integer> visited = new HashSet<>();
        while(!st.isEmpty()){

            int nbr = st.pop();

            if(visited.contains(nbr)){
                continue;
            }

            visited.add(nbr);

            if(nbr==des){
                return true;
            }

            for(int nbrs: map.get(nbr).keySet()){
                if(!visited.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
        }

        // for traversal on disconnected graph
        public void BFT(){
        int count=0;
        Queue<Integer> queue = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int key: map.keySet()){
            if(visited.contains(key)){
                continue;
            }
            count++; // in order to calculate no. of components or parts for disconnected graph
            queue.add(key);
            while(!queue.isEmpty()){
                // 1. remove
                int nbr=queue.poll();
                // 2. ignore if already visited
                if(visited.contains(nbr)){
                    continue;
                }
                //3. add visited
                visited.add(nbr);
                //4. selfwork
                System.out.print(nbr+" ");
                //5. add unvisited neighbours
                for(int nbrs: map.get(nbr).keySet()){
                    if(!visited.contains(nbrs)){
                        queue.add(nbrs);
                    }
                }
            }
        }
        System.out.println("count is: "+ count);
        }
    }
