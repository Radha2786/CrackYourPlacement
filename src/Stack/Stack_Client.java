package Stack;

public class Stack_Client {
    public static void main(String[] args) throws Exception {

        Stack st = new Stack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st.pop());
        System.out.println(st.Top());
        st.push(6);
        System.out.println(st.size());


    }
}
