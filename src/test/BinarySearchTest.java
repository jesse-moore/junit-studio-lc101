package test;

import main.BonusBinarySearch;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void numberInFirstIndexReturnsZero() {
        int[] newArray = {1,2,3,4,5};
        int result = BonusBinarySearch.binarySearch(newArray,1);
        assertEquals(0, result);
    }

    @Test
    public void numberInThirdIndexReturnsTwo() {
        int[] newArray = {1,2,3,4,5};
        int result = BonusBinarySearch.binarySearch(newArray,3);
        assertEquals(2, result);
    }

    @Test
    public void numberInFifthIndexReturnsFour() {
        int[] newArray = {1,2,3,4,5};
        int result = BonusBinarySearch.binarySearch(newArray,5);
        assertEquals(4, result);
    }

    @Test
    public void numberGreaterThanNumbersInArrayReturnsNegativeOne() {
        int[] newArray = {1,2,3,4,5};
        int result = BonusBinarySearch.binarySearch(newArray,6);
        assertEquals(-1, result);
    }


    @Test
    public void numberLessThanNumbersInArrayReturnsNegativeOne() {
        int[] newArray = {1,2,3,4,5};
        int result = BonusBinarySearch.binarySearch(newArray,0);
        assertEquals(-1, result);
    }

}
