package Graph.Basics.Questions;
import java.util.*;
public class DisjointSet {
//    public static void main(String[] args){
//
//    }
    class Node{
        int rank;
        Node parent;
        int data;
    }
    private HashMap<Integer, Node> map = new HashMap<>();

    public void CreateSet(int v){
        Node nn = new Node();
        nn.rank = 0;
        nn.parent=nn;
        nn.data=v;
        map.put(v,nn);
    }
    public int find(int v){
// pata lagayenge ki us set ka represntative element kis set se belong krta hai....
        Node nn = map.get(v);
        return find(nn).data;
    }

    private Node find(Node nn){
        if(nn.parent == nn){
            return nn;
        }
//        return find(nn.parent);
        Node n = find(nn.parent);
        nn.parent = n; // path compression
        return n;
    }

    public void Union(int v1, int v2){
        Node nn1 = map.get(v1);
        Node nn2 = map.get(v2);
        Node rn1= find(nn1);
        Node rn2 = find(nn2);
        if(rn1.rank==rn2.rank){
//            let's change rn1's parent
            rn1.parent = rn2;  // rn1 ka parent rn2
            rn2.rank++;
        }else if(rn1.rank>rn2.rank){
            rn2.parent = rn1;
        }else{
            rn1.parent = rn2;
        }
    }
}
