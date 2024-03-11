package queues;

/*
Queues:
- In queues, we can only add elements at the end of the queue, and remove elements at the start of the queue.
- Big Os:
  - Append: O(1);
  - Remove: O(1);
  - Get: O(N).
 */

public class Queue {
    private Node first;
    private Node last;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public void printQueue() {
        Node temp = first;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getFirst() {
        System.out.println("First: " + first.value);
    }

    public void getLast() {
        System.out.println("Last: " + last.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void enqueue(int value) {
        // Creates node to be added
        Node newNode = new Node(value);

        // If there are no items on the list, sets the new node to be first and last
        if (length == 0) {
            first = newNode;
            last = newNode;
        } else {
            // Else, adds the new node after last, and sets it to be the last item
            last.next = newNode;
            last = newNode;
        }

        length++;
    }

    public Node dequeue() {
        if (length == 0) return null;

        // Creates temporary node to mark the node that will be removed, at first position
        Node temp = first;

        // If the list has only one item, sets first and last to null
        if (length == 1) {
            first = null;
            last = null;
        } else {
            // Else, sets first to be the next node after first and removes all points related to the previous first
            first = first.next;
            temp.next = null;
        }

        length--;
        return temp;
    }
}
