package JavaStringHandling;

public class CompareStrings {
    public static void main(String[] args) {
        // Declare and initialize two strings for comparison
        String str1 = "apple";
        String str2 = "banana";

        // Find the length of the shorter string to avoid index out of bounds
        int len = Math.min(str1.length(), str2.length());
        boolean found = false;

        // Compare characters one by one
        for (int i = 0; i < len; i++) {
            // If a character from str1 is smaller, it comes before str2
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2);
                found = true;
                break;
            }
            // If a character from str2 is smaller, it comes before str1
            else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str2 + " comes before " + str1);
                found = true;
                break;
            }
        }

        // If all characters were equal till the end of one string
        if (!found) {
            if (str1.length() < str2.length()) {
                // str1 is shorter, so it comes first
                System.out.println(str1 + " comes before " + str2);
            } else if (str1.length() > str2.length()) {
                // str2 is shorter, so it comes first
                System.out.println(str2 + " comes before " + str1);
            } else {
                // Both strings are completely equal
                System.out.println("Both strings are equal");
            }
        }
    }
}
