package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyStringReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void nullReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(null));
    }

    @Test
    public void onlyWhiteSpaceReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets(" "));
    }


    @Test
    public void onlyOpeningBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void mismatchBracketsWithLettersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("abc[def[qwe]"));
    }

    @Test
    public void matchingBracketsWithLettersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("abc[def][qwe]"));
    }

    @Test
    public void mismatchBracketsWithNumbersReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("123[456[789]"));
    }

    @Test
    public void matchingBracketsWithNumbersReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("123[456][789]"));
    }



}
