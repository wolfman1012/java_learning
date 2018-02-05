package palindome;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class PalindromeTest extends TestCase {
//
//    public PalindromeTest(String name){
//
//    }

    @Test
    public void testConstructor() {
        Palindrome initializeObject = new Palindrome();
        assertNotNull(initializeObject);
        assertNotNull(initializeObject.getString());
        initializeObject.setString("pasta");
        assertEquals(initializeObject.getString(), "pasta");
    }

    @Test
    public void testIsPalindrome() {
        Palindrome pTest = new Palindrome();
        pTest.setString("tacocat");
        assertTrue(pTest.isPalindrome());

    }

    @Test
    public void testNotIsPalindrome() {
        Palindrome pTest = new Palindrome();
        pTest.setString("taco");
        assertTrue(pTest.isPalindrome());

    }

    @Test
    public void testEmptyIsPalindrome() {
        Palindrome pTest = new Palindrome();
        pTest.setString("");
        assertTrue(pTest.isPalindrome());

    }
}