package Oops.Interface;

public interface QI {
    public void Enqueue(int data) throws  Exception;

    public int Dequeue() throws  Exception;

    public boolean isFull();

    public boolean isEmpty();

    public void Display();
}
