package Oops;

public class Stack {

    protected int[] arr;
    private int top=0;

    public Stack(int size){
        this.arr= new int[size];

    }

    public void push(int ele) throws Exception{
        if(isFull()){
            throw new Exception("stack is full gadhe");
        }
        this.arr[this.top] = ele;
        this.top++;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is empty");
        }
        this.top--;
        return this.arr[this.top];
    }

    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("stack is Empty");
        }
        return this.arr[this.top--];
    }
    public boolean isFull(){
        return this.top == this.arr.length;
    }
    public boolean isEmpty(){
        return this.top==0;
    }

    public void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
