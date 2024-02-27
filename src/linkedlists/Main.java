package linkedlists;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();
        myLinkedList.printList();
        System.out.println();

        System.out.println("Append");
        myLinkedList.append(20);
        myLinkedList.append(30);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Remove Last");
        myLinkedList.removeLast();
        myLinkedList.printList();
        System.out.println();

        System.out.println("Prepend");
        myLinkedList.prepend(9);
        myLinkedList.prepend(8);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Remove First");
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println();

        System.out.println("Get");
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(1).value);
        System.out.println();

        System.out.println("set");
        myLinkedList.set(2, 99);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Insert");
        myLinkedList.insert(3, 70);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Remove");
        myLinkedList.remove(2);
        myLinkedList.printList();
        System.out.println();

        System.out.println("Reverse");
        myLinkedList.reverse();
        myLinkedList.printList();
        System.out.println();
    }
}
