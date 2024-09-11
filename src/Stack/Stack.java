package Stack;

public class Stack {
    int[] arr;
    private int top=-1; // to keep track

    int size=0;
    public Stack(int n){
        arr = new int[n];
    }

    public void push(int val) throws Exception {
        if(top==arr.length){
            throw new Exception("stack is full");
        }
        top++;
        arr[top] = val;
        size++;
    }
    public int pop() throws Exception {
        if(top==-1){
            throw new Exception("stack is empty");
        }
        int val = arr[this.top];
        this.top--;
        this.size--;
        return val;
    }

    public int Top() throws Exception {
        if(top==-1){
            throw new Exception("stack is empty");
        }
        int val = arr[this.top];
        return val;
    }

    public int size(){
        return top+1;
    }
    public void Display() {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
