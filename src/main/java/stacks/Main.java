package stacks;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(4);

        myStack.getTop();
        myStack.getHeight();
        myStack.printStack();
        System.out.println();

        System.out.println("Push");
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.printStack();
        System.out.println();

        System.out.println("Pop");
        myStack.pop();
        myStack.pop();
        myStack.printStack();
        System.out.println();
    }
}
