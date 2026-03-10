package com.example.junit;

public class PalindromeChecker {
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }
        String clean = text.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        for (int i = 0; i < length / 2; i++) {
            if (clean.charAt(i) != clean.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
