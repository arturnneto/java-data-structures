import binarysearchtrees.BinarySearchTree;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumingThat;
import static utils.TestUtils.errorMsg;

@Tags({@Tag("tree")})
class BinarySearchTreeTest {

    private static final BinarySearchTree TEST_BINARYTREE = new BinarySearchTree();
    @BeforeAll
    static void setUp(){
        IntStream.rangeClosed(1, 50).forEach(TEST_BINARYTREE::insert);
    }

    @Tag("binarytree")
    @ParameterizedTest(name = "Binary Tree Test type {0} for scenario {1} and description {4} with arguments {2}")
    @CsvFileSource(resources = "binarysearchtree.csv", numLinesToSkip = 1)
    void binaryTreeTest(String type, String scenario, String argument, String expected, String description){


        assumingThat(type.equalsIgnoreCase("success"), () -> {

            var number = Integer.parseInt(argument);
            var expect = Boolean.valueOf(expected);
            var res = scenario.contains("insert") ? TEST_BINARYTREE.insert(number) :TEST_BINARYTREE.contains(number);

            var randomNumber = new Random().nextInt(1, 50);

            assertAll(scenario + " with " + description, ()  -> {
                assertEquals(expect, res, errorMsg);
                assertTrue(TEST_BINARYTREE.contains(randomNumber), errorMsg);
            });

        });

        assumingThat(type.equalsIgnoreCase("fail"), () -> {

            var number = failArgument.apply(argument);
            var exceptionMsg = scenario.contains("overflow") ?
                    assertThrows(java.lang.ArithmeticException.class, () -> TEST_BINARYTREE.insert(number.get())):
                    assertThrows(java.lang.NumberFormatException.class, () -> TEST_BINARYTREE.insert(number.get()));

            assertAll(scenario + " with " + description, () -> {
                assertTrue(exceptionMsg.getMessage().contains(expected), errorMsg);
            });

        });
    }

    Function<String, Supplier<Integer>> failArgument = argument ->
            switch (argument){
                case "MAX_VALUE" -> () -> Math.addExact(Integer.MAX_VALUE, 1);
                case "MIN_VALUE" -> () -> Math.subtractExact(Integer.MIN_VALUE, 1);
                case "abc" -> () -> Integer.valueOf("abc");
                default -> () -> Integer.valueOf("");
            };
}
