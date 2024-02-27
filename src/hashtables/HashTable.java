package hashtables;
import java.util.ArrayList;
import java.util.Objects;

/*
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
 */

public class HashTable {
    // This is the number of spaces our hash table will have. When our number of spaces is a prime number, our hash table will have fewer collisions.
    private int size = 7;
    private Node[] dataMap;

    public class Node {
        private String key;
        private int value;
        private Node next;

        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public HashTable() {
        dataMap = new Node[size];
    }

    public void printTable() {
        // Iterates through the hash table.
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            // Then iterates through the linked list in the specific space, printing the values inside it.
            while (temp != null) {
                System.out.println("   {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        // The int we will return that is the index where we will store data.
        int hash = 0;
        // Transforms the key into a char array.
        char[] keyChars = key.toCharArray();
        // Iterates through the char array.
        for (int i = 0; i < keyChars.length; i++) {
            int asciiValue = keyChars[i];
            // Calculation to define where it will be returned. It will always be a index in bounds of the hash table size.
            // We multiply it by a prime number to make numbers more random, decreasing the number of collisions.
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        // Defines where it will be stored using the hash method.
        int index = hash(key);
        // Creates node that will be added.
        Node newNode = new Node(key, value);
        // If at the particular list the list is empty, we set the node to be the first of the list.
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            // We create a temporary node at the index of the list (that actually is the list's head).
            Node temp = dataMap[index];
            // Then we iterate through the list until we reach the last node (temp.next = null).
            while (temp.next != null) {
                temp = temp.next;
            }
            // Then we add the node at the end of the linked list.
            temp.next = newNode;
        }
    }

    public int get(String key) {
        // Gets the index that we need to look at.
        int index = hash(key);
        // Creates a temporary node at the list index (which equals to the list's head).
        Node temp = dataMap[index];
        // Then iterates through the list, and returns the desired object value by comparing their keys.
        while (temp != null) {
            if (Objects.equals(temp.key, key)) {
                return temp.value;
            }
            temp = temp.next;
        }
        // If we couldn't find the desired key, we return 0.
        return 0;
    }

    public ArrayList<String> keys() {
        // Creates an array list to store the hash map's keys.
        ArrayList<String> allKeys = new ArrayList<>();
        // Iterates through the hash table
        for (int i = 0; i < dataMap.length; i++) {
            // Creates a temporary node to iterate through it.
            Node temp = dataMap[i];
            while (temp != null) {
                // Adds the actual key to the array list.
                allKeys.add(temp.key);
                // Then goes to the next index.
                temp = temp.next;
            }
        }
        // Returns the array list, that now contains all the keys of the hash table.
        return allKeys;
    }
}
