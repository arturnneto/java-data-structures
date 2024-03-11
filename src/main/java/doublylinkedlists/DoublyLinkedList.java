package doublylinkedlists;

/*
Doubly Linked Lists:
- The same as linked lists, but this one has pointers to the previous node as well.
- This can make some operations slightly more efficient, such as Insert, Remove and Get.
- Big Os:
  - Append: O(1);
  - Remove last item: O(N);
  - Prepend: O(1);
  - Remove First: O(1);
  - Insert: O(N/2 = N);
  - Remove: O(N/2 = N);
  - Get: O(N/2 = N).
 */

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value) {
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
        // Else, appends the node after the tail, and sets newNode.prev to be the previous tail of the list
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        // Creates a temporary node at the tail of the list
        Node temp = tail;

        // If the list only had one item, it would be removed, so head and tail must point to null
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            // Sets tail to be the previous node before tail
            tail = tail.prev;
            // Sets the new tail.next to be null
            tail.next = null;
            // Sets temp.prev to be null, removing all pointers to the previous tail of the list
            temp.prev = null;
        }

        // Decrement length and returns the removed node
        length--;
        return temp;
    }

    public void prepend(int value) {
        // Creates the node that will be added
        Node nodeToAdd = new Node(value);

        // If the list is empty, the created node will be the list's head and tail
        // Else, the created nodeToAdd.next will point to head, head.prev to nodeToAdd and head will be set to nodeToAdd
        if (length == 0) {
            head = nodeToAdd;
            tail = nodeToAdd;
        } else {
            nodeToAdd.next = head;
            head.prev = nodeToAdd;
            head = nodeToAdd;
        }

        // Length is increased by one
        length++;
    }

    public Node removeFirst() {
        if (length == 0) return null;

        // Creates temp node that will be removed
        Node temp = head;

        // If the length is equal to 1, removes head and tail pointers
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            // Sets head to be the next node (head.next) and removes pointers to the previous head
            head = head.next;
            head.prev = null;
            temp.next = null;
        }

        // Decrement length and returns the previous head
        length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) { return null; }
        // Create temp node that will be returned
        Node temp = head;

        // Checks where to start iterating the list based on the length, then sets it to be the next or previous node
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }

        // Returns node at index
        return temp;
    }

    public boolean set(int index, int value) {
        // Creates a temporary node, which will hold the value to be set and get the index using the get method
        Node temp = get(index);
        // Checks if temp got an valid node, then updates the node's value.
        if (temp != null) {
            temp.value = value;
            return true;
        }

        // Returns true if the node could be updated, else returns false
        return false;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) { return false; }
        // If the new node will be added at the start of the list (index 0), we use the prepend method
        if (index == 0) {
            prepend(value);
            return true;
        }
        // If the new node will be added at the end of the list (index length), we use the append method
        if (index == length) {
            append(value);
            return true;
        }

        // Creates three nodes, the node to be added, a node before it and a node after it
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;

        // Sets newNode.prev to point to the node before it
        newNode.prev = before;
        // Sets newNode.next to point to the node after it
        newNode.next = after;
        // Points before.next and after.prev, the before and after nodes, to point to the newNode
        before.next = newNode;
        after.prev = newNode;

        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) { return null; }
        // If the node to be removed is at the start of the list (index 0), we use the removeFirst method
        if (index == 0) {
            return removeFirst();
        }
        // If the node to be removed is at the end of the list (index length), we use the removeLast method
        if (index == length - 1) {
            return removeLast();
        }

        // Creates a temporary node
        Node temp = get(index);

        /*
        This piece of code can look confusing, but it is doing the following:
        We set temp.next.prev to be temp.prev, which means that the prev pointer of temp's next node will point to the node before temp
        Then, we will do the same with the previous node, which will have it next pointer to point to the node after temp
        Afterwards, we will set temp's next and previous pointers to null, successfully removing it from the list
         */
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }
}