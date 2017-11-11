package com.mycompany.app.puzzlers;

public class PalindromeTest {

    public static void main(String[] args) {

        System.out.println("hannah should be a palindrome : " + palindromeTest("hannah"));
        System.out.println("hanna shouldn't be a palindrome : " + palindromeTest("hanna"));

    }

    private static boolean palindromeTest(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);

        String reversed = stringBuilder.reverse().toString();

        if (reversed.equals(input)) {
            return true;
        }
        else {
            return false;
        }
    }
}
