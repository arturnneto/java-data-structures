package arraylists;

import java.util.ArrayList;
import java.util.Arrays;

/*
Array lists:
- Array lists have dynamic length, so you do not need to bother about size at its creation;
- Together in memory;
- Although they are more flexible, they may demand more memory usage than arrays, since they do dynamic resizing.
- Big O's:
  - Get: O(1);
  - Search: O(logN) for Binary Search (If sorted), O(N) for Linear Search;
  - Insert: O(N) at beginning or middle, O(1) at the end;
  - Delete: O(N) at beginning or middle, O(1) at the end.
 */

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> carNumbers = new ArrayList<>(10);
        ArrayList<String> carBrands = new ArrayList<>(Arrays.asList("Subaru", "Toyota", "BMW", "Gurgel"));

        System.out.println("Get:");
        System.out.println(carBrands.get(3));
        System.out.println();

        System.out.println("Length:");
        System.out.println(carBrands.size());
        System.out.println();

        System.out.println("Insert:");
        carBrands.add("Honda");
        System.out.println(carBrands);

        System.out.println("Set:");
        System.out.println(carBrands.get(3));
        carBrands.set(3, "Chevrolet");
        System.out.println(carBrands.get(3));
        System.out.println();

        System.out.println("Remove:");
        carBrands.remove(1);
        carBrands.remove("Subaru");
        System.out.println(carBrands);
        System.out.println();

        System.out.println("Size:");
        carNumbers.add(7);
        carNumbers.add(12);
        carNumbers.add(24);
        carNumbers.add(39);
        System.out.println(carNumbers.size());
        System.out.println();

        System.out.println("Is Empty:");
        System.out.println(carNumbers.isEmpty());
        System.out.println();

        System.out.println("Contains:");
        System.out.println(carBrands.contains("Honda"));
        System.out.println();

        System.out.println("Index Of:");
        System.out.println(carBrands.indexOf("Honda"));
        System.out.println();

        System.out.println("Last Index Of:");
        System.out.println(carNumbers.lastIndexOf(24));
        System.out.println();

        System.out.println("For Each:");
        carNumbers.forEach((number) -> {
            carNumbers.set(carNumbers.indexOf(number), number * 2);
        });
        System.out.println(carNumbers);
        System.out.println();
    }
}
