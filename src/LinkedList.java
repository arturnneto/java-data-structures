public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        // Creates a temporary node at the head of the list
        Node temp = head;

        // Prints the current value of the temporary node, switching to the next after each iteration
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        // Creates the new node to be added to the list
        Node newNode = new Node(value);

        // If the length of the list equals 0, the created node is the head and the tail of the list
        // Else, appends the node after the tail
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;

        // Creates two temporary nodes at the head
        Node temp = head;
        Node pre = head;

        // Iterates through the list, in order to find when the next node is null, pushing pre and temp one step further
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        // Sets pre to be the tail, and points tail.next to null
        tail = pre;
        tail.next = null;
        length--;

        // If the list only had one item, it would be removed, so head and tail must point to null
        if (length == 0) {
            head = null;
            tail = null;
        }

        // Returns removed node
        return temp;
    }

    public void prepend(int value) {
        // Creates node which will be added
        Node nodeToAdd = new Node(value);

        // If the list is empty, the created node will be the list's head and tail
        // Else, the created node will point to head, and head will be set to the created node
        if (length == 0) {
            head = nodeToAdd;
            tail = nodeToAdd;
        } else {
            nodeToAdd.next = head;
            head = nodeToAdd;
        }

        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        // Creates a temporary node equal to the head of the list
        Node temp = head;
        // Head is advanced to its next node
        head = head.next;
        // The next node after temp, which was head, is set to null
        temp.next = null;
        // Returns the removed head node
        length--;

        // If the list had a length of 1, the tail needs to be set to null
        if (length == 0) tail = null;

        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) return null;

        // Iterates from the head to the needed index
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public boolean set(int index, int value) {
        // Create a node at needed index
        Node temp = get(index);

        // Sets the node value to the value passed on the method call
        if (temp != null) {
            temp.value = value;
            return true;
        }

        return false;
    }

    public boolean insert(int index, int value) {
        // If index is out of range, return false, meaning that it could not be inserted
        if (index < 0 || index > length) return false;
        // If index is at the start of the list, uses the prepend method
        if (index == 0) {
            prepend(value);
            return true;
        }
        // If index is at the end of the list, uses the append method
        if (index == length) {
            append(value);
            return true;
        }

        // Creates a new node with the desired value to be inserted
        Node newNode = new Node(value);
        // Create a node before the desired index to be inserted
        Node temp = get(index - 1);
        // Sets the next node after newNode to be equal to the node which came after the temp node
        newNode.next = temp.next;
        // Sets the next node after temp to be equal to the created node
        temp.next = newNode;
        length++;

        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index > length) return null;
        // If the node to be removed is at the start of the list, use the removeFirst method
        if (index == 0) return removeFirst();
        // If the node to be removed is at the end of the list, use the removeLast method
        if (index == length - 1) return removeLast();

        // Creates a node before the desired index
        Node prev = get(index -1);
        // Creates a node at the desired index to be removed
        Node temp = prev.next;

        // Sets the prev node to point to the node after temp, which is the node to be removed
        prev.next = temp.next;
        // Removes the next pointer of the temp node, which will leave it without any pointers
        temp.next = null;
        length--;

        return temp;
    }

    public void reverse() {
        // Creates a temp node to save head position
        Node temp = head;
        // Sends head to tail
        head = tail;
        // Sets tail to where head was, essentially reversing them
        tail = temp;

        // At this moment, temp is a node pointing to the list head

        // Create a node pointing after temp
        Node after = temp.next;
        // Creates a node that at this moment points to nothing, but then will point to the node before temp
        Node before = null;

        // This for loop will iterate through the list, setting the next pointer of each node to point backwards
        for (int i = 0; i < length; i++) {
            // After is sent to the next node after temp, but in the first iteration, after already equals to temp.next
            after = temp.next;
            // The actual node gets pointed backwards, to the node that came before temp
            temp.next = before;
            // The before node advances one index
            before = temp;
            // So do temp
            temp = after;
        }
    }
}
