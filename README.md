# Data Structures - Java

This folder contains a wide range of content about data structures in Java. Additionally, this README file is also a quick review about them.

![Big O table for sorting algorithms](https://paulonteri.com/dsa/assets/images/Common_Data_Structure_Operations-9cfc3652a9e02d4b146845ad8f24f365.png)
Useful website for checking time and space complexties: https://www.bigocheatsheet.com/  
Algorithms repository: https://github.com/arturnneto/java-algorithms

---

### Arrays:
- Arrays have fixed length, so they are immutable in terms of size;
- Together in memory;
- Big O's:
  - Get: O(1);
  - Search: O(logN) for Binary Search (If Sorted), O(N) for Linear Search;
  - Insert: O(N) at beginning or middle, O(1) at the end;
  - Delete: O(N) at beginning or middle, O(1) at the end.

---

### Array lists:
- Array lists have dynamic length, so you do not need to bother about size at its creation;
- Together in memory;
- Although they are more flexible, they may demand more memory usage than arrays, since they do dynamic resizing.
- Big O's:
  - Get: O(1);
  - Search: O(logN) for Binary Search (If sorted), O(N) for Linear Search;
  - Insert: O(N) at beginning or middle, O(1) at the end;
  - Delete: O(N) at beginning or middle, O(1) at the end.


---

### Linked Lists:
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

---

### Doubly Linked Lists:
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

---

### Stacks:
- Works like a... stack.
- We can only remove and add items at the top of the stack.
- Big Os:
  - Append: O(1);
  - Remove: O(1);
  - Get: O(N);
  - Get First: O(1).
  
---

### Queues:
- In queues, we can only add elements at the end of the queue, and remove elements at the start of the queue.
- Big Os:
  - Append: O(1);
  - Remove: O(1);
  - Get: O(N).

---

### Binary Search Trees:
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

---

### Hash Tables:
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

---

### Graphs:
- Composed by vertexes(or nodes) and edges(or connections).
- The vertexes can have more than one edge.
- Edges can have values, or weights.
- Edges can be directional or bidirectional.
- Graphs can be represented as a Adjacency Matrix, or as a Adjacency List.
- Adjacency Matrices are like normal tables, where we have the axes X and Y representing the graph's vertexes and what other
vertexes it connects to.
- Adjacency lists can be represented with hash maps, where we wil have key value pairs of a vertex and it's edges, for example,
"A"=["B","C"]. Here, we are saying that the vertex A have edges with vertexes B and C.
- Big Os of Adjacency Matrices:
  - Space Complexity: O(|V|^2)
  - Insert Vertex: O(|V|^2);
  - Add Edge: O(1);
  - Delete Vertex: O(|V|^2);
  - Remove Edge: O(1);
  - Search: O(1);
- Big Os of Adjacency Lists:
  - Space Complexity: O(|V|+|E|)
  - Insert Vertex: O(1);
  - Add Edge: O(1)
  - Delete Vertex: O(|V|+|E|);
  - Remove Edge: O(|E|);
  - Search: O(1);

---

### Heaps:
- Heaps are very similar to BSTs.
- Heaps are always complete.
- Heaps can have duplicate values.
- In heaps, we can have the maximum or the minimum value at the top, and each subsequent value will be either smaller 
than the top, in a maximum heap, or bigger, in a minimum heap.
- Heaps can be represented as an Array List, where we will use indexes managed by a mathematical expression to store the
items.
- In this representation, we can use or not use the first (0) index of the list.
- We can represent the left child of a value like this: Left Child = Parent Index * 2;
- We can represent the right child of a value like this: Right Child = Parent Index * 2 + 1;
- To find a value's parent, we can just divide it's index by 2, ignoring decimal values.