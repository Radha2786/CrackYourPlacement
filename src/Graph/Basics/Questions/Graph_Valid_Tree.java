package Graph.Basics.Questions;
import java.util.*;
public class Graph_Valid_Tree {
    public static void main(String[] args){
        int n= 5;
        int[][] edges = {{0,1},{0,2},{0,3},{1,4}};
        // if we can't figure out the neighbour easily or in 1 go then we have to convert it into graph
        // Graph conversion
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i, new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int v1=edges[i][0];
            int v2=edges[i][1];
            map.get(v1).add(v2);
            map.get(v2).add(v1);
        }
        System.out.println(BFT(map));
    }
    public static boolean BFT(HashMap<Integer, List<Integer>> map){
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
                    return false; // cycle detected
                }
                //3. add visited
                visited.add(nbr);
                //4. selfwork

                //5. add unvisited neighbours
                for(int nbrs: map.get(nbr)){
                    if(!visited.contains(nbrs)){
                        queue.add(nbrs);
                    }
                }
            }
        }
        return count==1;  // more than 1 component
    }
}
