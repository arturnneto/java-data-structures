package binarysearchtrees;

/*
Binary Search Trees:
- BSTs are composed by nodes, which have two pointers: Left and Right.
- In a BST, when we are analyzing the value of a node, all nodes to the left of this node will be smaller than it, and
all values to the right, bigger.
- To search and insert a value in a BST, we start from the root, which is the first node of the tree.
- The bottom nodes of a tree are called leafs.
- Deletion in a BST is more complex than usual, because we can not have a null value between nodes in a BST.
- There are many ways to traverse a BST.
- We need to be careful when assigning Big Os to a BST, because at the average case, we will have a O(logN) to search, insert
and delete, but in worst cases, it becomes O(N).
- There are different tree data structures that can mitigate this, such as AVL trees and red-black trees.
- Big Os:
  - Insert: O(logN)*;
  - Delete: O(logN)*;
  - Search: O(logN)*;
 */

public class BinarySearchTree {

    private Node root;

    class Node {
        int value;
        // In a BST, the nodes point to the next node at the right or the left
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public int getRootValue() {
        return root.value;
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        // If the BST is empty, the new node becomes the root of the tree
        if (root == null) {
            root = newNode;
            return true;
        }
        // Creates a temporary node at the root, to start checking for a place to insert the new node
        Node temp = root;
        // Iterates through the BST until the node is inserted
        while (true){
            // Checks if the value is already at the tree, if it is, returns false and breaks the loop
            if (newNode.value == temp.value) { return false; }
            // If the node that will be inserted have a lower value than the node we are checking, we will go left
            if (newNode.value < temp.value) {
                // If the position we went is null, the new node get inserted there, we break the loop and return true
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                // Else, continues to the next node, and repeats the checking
                temp = temp.left;
            } else { // Else, we will go right
                // Repeats the process, if the position we went is empty, the node gets added there, the loop breaks and we return true
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                // Else, we move on to the next node
                temp = temp.right;
            }
        }
    }

    public boolean contains(int value) {
        // Creates a temporary node at the rood, to start the iteration on the BST
        Node temp = root;
        // Iterates until temp equals to null, which means we reached the bottom of the tree
        while (temp != null) {
            // If the node we are checking is bigger than the value we are searching, we go left
            if (value < temp.value) {
                temp = temp.left;
            } else if (value > temp.value) { // Else, we go right
                temp = temp.right;
            } else { // If the value is neither bigger nor smaller than the value we are searching, it means we found it
                return true;
            }
        }
        // If the value couldn't be found, returns false
        return false;
    }

}
