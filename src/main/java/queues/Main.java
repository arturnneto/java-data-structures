package queues;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue(10);

        myQueue.getFirst();
        myQueue.getLast();
        myQueue.getLength();
        myQueue.printQueue();
        System.out.println();

        System.out.println("Enqueue");
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);
        myQueue.printQueue();
        System.out.println();

        System.out.println("Dequeue");
        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.printQueue();
        System.out.println();
    }
}
