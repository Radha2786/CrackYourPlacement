package Oops;

import java.util.LinkedList;
import java.util.*;
import java.util.Queue;

public class StackUsingQueue {

        Queue<Integer> queue = new LinkedList<>();

        public void push(int data){
            if(queue.isEmpty()){
                queue.add(data);
            }else{
                InsertBottom(data);
            }
        }
        public void InsertBottom(int data){
            if(queue.isEmpty()){
                queue.add(data);
                return;
            }
            int rv=queue.remove();
            InsertBottom(data);
            queue.add(rv);
        }
}
