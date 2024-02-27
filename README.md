This folder contains a wide range of content about data structures in Java. Additionally, this README file is also a quick review about them.

Useful website: https://www.bigocheatsheet.com/

Arrays:
- Arrays have fixed length, so they are immutable in terms of size;
- Together in memory;

Array lists:
- Array lists have dynamic length, so you do not need to bother about size at its creation;
- Together in memory;
- Although they are more flexible, they may demand more memory usage than arrays, since they do dynamic resizing.

Linked Lists:
- Lists composed by nodes, which have a pointer to the next item (node) in the list.
- It has two important nodes: Head, which is the start of the list, and Tail, which is the end of the list.
- Linked lists can kinda be compared to hash maps.
- Dynamic length;
- No indexes;
- Spreaded in memory;
- Pointers:
  - Each item have a pointer to the next item of the list;
  - Head and Tail represent the first and last item of the list;
  - The last item has a null pointer.
- Big Os:
  - Append: O(1);
  - Remove last item: O(N);
  - Prepend: O(1);
  - Remove First: O(1);
  - Insert: O(N);
  - Remove: O(N);
  - Get: O(N);
- Takes up more memory;
- Not so much optimized for iteration.


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

Stacks:
- Works like a... stack.
- We can only remove and add items at the top of the stack.
- Big Os:
  - Append: O(1);
  - Remove: O(1);
  - Get: O(N);
  - Get First: O(1).
  
Queues:
- In queues, we can only add elements at the end of the queue, and remove elements at the start of the queue.
- Big Os:
  - Append: O(1);
  - Remove: O(1);
  - Get: O(N).

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
- BSTs do not need constructors. 
- Big Os:
  - Insert: O(logN)*;
  - Delete: O(logN)*;
  - Search: O(logN)*;

Hash Tables:
- Hash tables are characterized by the use of key value pairs to store data.
- They use hashing to efficiently store and access values.
- Hashing is a method used to convert keys into hash codes, that determine where the corresponding value will be stored.
- Sometimes, we can have collisions, where different key hashes would be added in the same place.
  - We can address this problem by adding them in the next open space in our hash table, or:
  - Creating another data structure into the specific index, like a linked list, for example.
- When analyzing hash tables Big O, we need to consider:
  - It offer an average case complexity of O(1) for insertion, deletion and retrieval.
  - But it can degrade to O(N) in the worst case, if collisions are frequent and the hashing distributed keys poorly.
- Big Os:
  - Insert: O(1)*;
  - Delete: O(1)*;
  - Search: O(1)*;
