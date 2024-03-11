import binarysearchtrees.BinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {

    @Test
    void firstValueShouldBeRoot() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        assertEquals(10, binarySearchTree.getRootValue());
    }

    @Test
    void insertShouldEqualTrue() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        assertTrue(binarySearchTree.insert(10));
    }

    @Test
    void valuesShouldBeUnique() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        assertFalse(binarySearchTree.insert(10));
    }

    @Test
    void existingValueShouldReturnTrue() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        assertTrue(binarySearchTree.contains(10));
    }

    @Test
    void nonExistingValueShouldReturnFalse() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(10);
        assertFalse(binarySearchTree.contains(20));
    }
}
