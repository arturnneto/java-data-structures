package stacks;

/*
Stacks:
- Works like a... stack.
- We can only remove and add items at the top of the stack.
- Big Os:
  - Append: O(1);
  - Remove: O(1);
  - Get: O(N);
  - Get First: O(1).
 */

public class Stack {
    private Node top;
    private int height;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height " + height);
    }

    public void push(int value) {
        // Creates node to be added
        Node newNode = new Node(value);

        // If the list has no items, the created node will be the list's top
        if (height == 0) {
            top = newNode;
        } else {
            // Else, sets the next node to be top, and then sets top to be the new node
            newNode.next = top;
            top = newNode;
        }

        height++;
    }

    public Node pop() {
        if (height == 0) return null;

        // Creates a temporary node at the top
        Node temp = top;
        // Sets top to be top.next
        top = top.next;
        // Removes the temporary node, which is the previous top
        temp.next = null;

        height--;
        return temp;
    }
}