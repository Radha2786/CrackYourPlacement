package Oops;

public class Queue {

    private int size = 0;
    protected int[] data;
    protected int front =0;

    public Queue(int capacity){
        this.data = new int[capacity];
        this.size= capacity;
    }

    public void Enqueue(int data) throws  Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        this.data[this.front] = data;
        this.front++;
        this.size++;
    }
    public boolean isFull(){
        return this.size == this.data.length;
    }
    public boolean isEmpty(){
        return this.size == 0;
    }

}
