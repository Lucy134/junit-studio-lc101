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
    public void mismatchBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void extraCharsEffect(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[asdfasdasdfadfa[asdfasd]asdfasdf]"));
    }
    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("nobrackets"));
    }
    @Test
    public void flippedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void singleLBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void singleRBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void unorderedBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void nestedReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
}
