package doublylinkedlists;

public class Main {
    public static void main (String[] args) {
        DoublyLinkedList myDoublyLinkedList = new DoublyLinkedList(10);

        myDoublyLinkedList.getHead();
        myDoublyLinkedList.getTail();
        myDoublyLinkedList.getLength();
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Append");
        myDoublyLinkedList.append(20);
        myDoublyLinkedList.append(30);
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Remove Last");
        myDoublyLinkedList.removeLast();
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Prepend");
        myDoublyLinkedList.prepend(9);
        myDoublyLinkedList.prepend(8);
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Remove First");
        myDoublyLinkedList.removeFirst();
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Get");
        System.out.println(myDoublyLinkedList.get(1));
        System.out.println(myDoublyLinkedList.get(1).value);
        System.out.println();

        System.out.println("set");
        myDoublyLinkedList.set(2, 99);
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Insert");
        myDoublyLinkedList.insert(3, 70);
        myDoublyLinkedList.printList();
        System.out.println();

        System.out.println("Remove");
        myDoublyLinkedList.remove(2);
        myDoublyLinkedList.printList();
    }
}
