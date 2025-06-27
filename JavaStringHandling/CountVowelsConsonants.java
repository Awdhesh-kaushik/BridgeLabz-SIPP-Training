package JavaStringHandling;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Efficient way to check vowels using HashSet
        Set<Character> vowelsSet = new HashSet<>();
        vowelsSet.add('a');
        vowelsSet.add('e');
        vowelsSet.add('i');
        vowelsSet.add('o');
        vowelsSet.add('u');

        // Prompting user for input
        System.out.print("Enter a string: ");
        String str = sc.nextLine(); // Accepts full sentence

        int vowels = 0, consonants = 0;

        // Convert string to lowercase to simplify vowel comparison
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (vowelsSet.contains(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        // Display results
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}
