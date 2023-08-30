package ait.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenTest {
    Integer[] array;


    @BeforeEach
    void setUp() {
        array = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3 };

    }

    @Test
    void test() {
        Comparator<Integer> oddEvenComparator = new OddEvenComparator();
        Arrays.sort(array, oddEvenComparator);
        Integer[] expected = new Integer[] { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
        assertArrayEquals(expected, array);
    }
}