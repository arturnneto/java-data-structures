package arrays;

/*
Arrays:
- Arrays have fixed length, so they are immutable in terms of size;
- Together in memory;
- Big O's:
  - Get: O(1);
  - Search: O(logN) for Binary Search (If Sorted), O(N) for Linear Search;
  - Insert: O(N) at beginning or middle, O(1) at the end;
  - Delete: O(N) at beginning or middle, O(1) at the end.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] carNumbers = new int[4];
        String[] carBrands = {"Subaru", "Toyota", "BMW", "Gurgel"};

        System.out.println("Print array:");
        System.out.println(Arrays.asList(carBrands));
        System.out.println();

        System.out.println("Get:");
        System.out.println(carBrands[3]);
        System.out.println();

        System.out.println("Length:");
        System.out.println(carBrands.length);
        System.out.println();

        System.out.println("Reassign value:");
        carBrands[3] = "Honda";
        System.out.println(carBrands[3]);
        System.out.println();

        System.out.println("Sort:");
        Arrays.sort(carBrands);
        System.out.println(Arrays.asList(carBrands));
        System.out.println();

        System.out.println("Copy array:");
        String[] copiedCarBrands = Arrays.copyOf(carBrands, carBrands.length);
        System.out.println(Arrays.asList(copiedCarBrands));
        System.out.println();

        System.out.println("Equals:");
        System.out.println(Arrays.equals(carBrands, copiedCarBrands));
        System.out.println();

        System.out.println("Fill:");
        Arrays.fill(carNumbers, 99);
        System.out.println(Arrays.toString(carNumbers));
        System.out.println();

        System.out.println("Binary Search:");
        System.out.println(Arrays.binarySearch(carNumbers, 50));
        System.out.println();

        System.out.println("Copy Range:");
        int[] copiedNumbers = Arrays.copyOfRange(carNumbers, 0, 2);
        System.out.println(Arrays.toString(copiedNumbers));

    }
}
