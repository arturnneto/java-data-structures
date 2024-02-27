package hashtables;

public class Main {

    public static void main(String[] args) {
        // Table creation
        HashTable myHashTable = new HashTable();
        myHashTable.printTable();
        System.out.println();

        // Set method
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);
        myHashTable.printTable();
        System.out.println();

        // Get method
        System.out.println(myHashTable.get("lumber"));
        System.out.println(myHashTable.get("bolts"));
        System.out.println(myHashTable.get("nails"));
        System.out.println(myHashTable.get("hammers"));
        System.out.println();

        // Keys method
        System.out.println(myHashTable.keys());
        System.out.println();
    }
}
