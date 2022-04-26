public class CircularQueueTest {

    public static void main(String args[]){
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        cq.enqueue(6);
        System.out.println(cq.toString());
        cq.dequeue();
        System.out.println(cq.toString());
        cq.dequeue();
        System.out.println(cq.toString());
        cq.enqueue(6);
        System.out.println(cq.toString());
        cq.enqueue(7);
        System.out.println(cq.toString());
    }
}
