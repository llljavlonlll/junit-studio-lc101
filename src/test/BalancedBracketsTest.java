package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void bracketsWithStringsAccepted() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch Code"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void stringWithWhitespaceReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("  "));
    }

    @Test
    public void generalCheck() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("{}[]{[{}{}{}}{{()((())]}}}]["));
    }

    @Test
    public void oppositeBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void oppositeBracketsWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void singleNegativeBracket () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

}
