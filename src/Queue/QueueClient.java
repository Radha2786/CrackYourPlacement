package Queue;

public class QueueClient {
    public static void main(String[] args) throws Exception {
        Queue qq = new Queue(5);
        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);
        qq.display();
        System.out.println(qq.Dequeue());
        System.out.println(qq.Dequeue());
        qq.display();
        qq.Enqueue(50);
        qq.Enqueue(60);
        qq.Enqueue(70);
        qq.display();
    }
}
