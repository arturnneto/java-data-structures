This folder contains a wide range of content about data structures in Java. Additionally, this README file is also a quick review about them, where i will elencate where, and for what, each one of them should be used.

Useful website: https://www.bigocheatsheet.com/

Arrays:
- Fixed length;
- Together in memory;

Array lists:
- Dynamic length;
- Together in memory;

Linked Lists:
Lists composed by nodes, which have a pointer to the next item (node) in the list.
It has two important nodes: Head, which is the start of the list, and Tail, which is the end of the list.
Linked lists can kinda be compared to hash maps.
- Dynamic length;
- No indexes;
- Spreaded in memory;
- Pointers:
  - Each item have a pointer to the next item of the list;
  - Head and Tail represent the first and last item of the list;
  - The last item has a null pointer;
- Big Os:
  - Adding an item to the end: O(1);
  - Removing item at the end: O(N);
  - Adding an item on the start: O(1);
  - Removing an item on the start: O(1);
  - Adding an item in the middle of the list: O(N);
  - Removing an item in the middle of the list: O(N);
  - Looking for a specific item, even using its index: O(N);
- Takes up more memory;
- Not so much optimized for iteration.


Doubly Linked Lists:
The same as linked lists, but this one has pointers to the previous node as well.
