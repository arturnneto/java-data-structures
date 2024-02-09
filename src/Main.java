public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();

        // 2 Items - Returns 2 Node
        System.out.println(myLinkedList.removeLast().value);
        // 1 Item - Returns 1 Node
        System.out.println(myLinkedList.removeLast().value);
        // 0 Items - Returns null
        System.out.println(myLinkedList.removeLast());
        myLinkedList.printList();
        System.out.println();

        myLinkedList.prepend(3);
        myLinkedList.prepend(4);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.prepend(5);
        myLinkedList.removeFirst();
        myLinkedList.printList();
        System.out.println();

        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(1).value);
        System.out.println(myLinkedList.get(4));
        System.out.println();

        myLinkedList.set(1, 11);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.insert(1,25);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.remove(1);
        myLinkedList.printList();
        System.out.println();

        myLinkedList.append(30);
        myLinkedList.append(7);
        myLinkedList.append(24);
        myLinkedList.append(75);

        myLinkedList.printList();
        System.out.println();
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}