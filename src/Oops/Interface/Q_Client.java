package Oops.Interface;

public class Q_Client {
    public static void main(String[] args) throws Exception {
        QI qq = new Q(6);

        qq.Enqueue(10);
        qq.Enqueue(20);
        qq.Enqueue(30);
        qq.Enqueue(40);
        qq.Enqueue(50);
        qq.Enqueue(60);
        qq.Dequeue();
        qq.Dequeue();
        qq.Enqueue(70);
        qq.Display();

    }
}
