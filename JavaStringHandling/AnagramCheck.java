package JavaStringHandling;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        // Declare and initialize two input strings
        String str1 = "listen";
        String str2 = "silent";

        // Convert both strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        if (Arrays.equals(arr1, arr2)) {
            // If arrays are equal, the strings are anagrams
            System.out.println("Strings are anagrams.");
        } else {
            // If arrays are not equal, the strings are not anagrams
            System.out.println("Strings are not anagrams.");
        }
    }
}
