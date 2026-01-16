package Queue;
import SinglyLinkedList.SinglyLinkedList;

public class SLinkedQueue<E>   implements Queue<E>{
     SinglyLinkedList<E> list=new SinglyLinkedList<E>();
    //DoublyLinkedList<E> list=new DoublyLinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void enqueue(E data) {
        list.addLast(data);
    }

    @Override
    public E dequeue() {
        return list.removeFirst();
    }

    @Override
    public E front() {
        return list.getFirst();
    }
}
