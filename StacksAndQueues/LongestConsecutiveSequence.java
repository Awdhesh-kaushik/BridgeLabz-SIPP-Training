package StacksAndQueues;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    //Method
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        // Add all numbers to set
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Try to start sequence only at sequence start
        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Count how many numbers follow consecutively
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + result);
    }
}