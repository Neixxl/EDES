package com.example.junit;

import org.junit.Test;
import org.junit.Assert;

public class PalindromeCheckerTest {
    private final PalindromeChecker checker = new PalindromeChecker();

    @Test
    public void testIsPalindromeTrue() {
        Assert.assertTrue("ana es un palíndromo", checker.isPalindrome("ana"));
        Assert.assertTrue("Palíndromo con espacios y mayúsculas", checker.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testIsPalindromeFalse() {
        Assert.assertFalse("hola no es un palíndromo", checker.isPalindrome("hola"));
        Assert.assertFalse("Un valor nulo no debería ser un palíndromo", checker.isPalindrome(null));
    }
}
