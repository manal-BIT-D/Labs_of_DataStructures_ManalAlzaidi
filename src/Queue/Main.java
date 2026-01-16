package Queue;

public class Main {
    public static void main(String[] args) {
        SLinkedQueue<Integer> lqueue = new SLinkedQueue<Integer>();
        lqueue.enqueue(1);
        lqueue.enqueue(2);
        lqueue.enqueue(3);
        lqueue.enqueue(4);



        System.out.println("front is :" + lqueue.front());

        while(!lqueue.isEmpty()){
            System.out.println("element remove:" + lqueue.dequeue());
        }

    }
}