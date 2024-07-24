package Queue;

public class Queue {
    int[] arr;
    private int currentSize=0;
    private int start = -1;
    private int end= -1;
    int size;

    public Queue(int capacity){
        arr = new int[capacity];
        this.size = capacity;
    }

    public boolean isFull(){
        if(size== currentSize){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
       return this.size==0;
    }

    public void Enqueue(int val) throws Exception {
        if(isFull()){
            throw new Exception("stack is full");
        }
        if(end==-1){
            start=0;
            end=0;
        }else{
            end = (end+1) % size;
        }
        this.arr[end] = val;
        currentSize++;
    }

    public int Dequeue() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is Empty baklol");
        }
        int popped = arr[start];
        if(currentSize==1){
            start=-1;
            end=-1;
        }else{
            start = (start + 1) % size;
        }
       currentSize--;
       return popped;
    }

    public int Top() throws Exception {
        if(isEmpty()){
            throw new Exception("queue is Empty baklol");
        }
        int popped = arr[start];
        return popped;
    }

    public int size(){
        return this.currentSize;
    }

    public void display(){
        for(int i=0; i< this.currentSize; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
