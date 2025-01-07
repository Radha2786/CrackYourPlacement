package Oops.Interface;

public class Q implements QI{

    private int[] queue ;
    int size ;
    int front;

    public Q(int capacity){
        this.queue = new int[capacity];
        this.size=0;
        this.front=0;
    }

    @Override
    public void Enqueue(int ele) throws Exception{
        if(isFull()){
            throw new Exception("queue is full");
        }
        int i = (this.front+ this.size)% this.queue.length;
        this.queue[i] = ele;
        this.size++;
    }

    @Override
    public int Dequeue() {
        int RV= this.queue[(this.front)% this.queue.length];
        this.front++;
        this.size--;
        return RV;
    }

    @Override
    public boolean isFull() {
        return this.size == this.queue.length;
    }

    @Override
    public boolean isEmpty() {
        return this.size==0;
    }

    @Override
    public void Display(){
        for(int i=0;i<size;i++){
            System.out.println(this.queue[(this.front+i)%this.queue.length]);
        }
    }
}
