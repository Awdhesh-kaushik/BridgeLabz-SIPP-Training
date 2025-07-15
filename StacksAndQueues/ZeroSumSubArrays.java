package StacksAndQueues;

import java.util.*;

public class ZeroSumSubArrays {

    public static List<int[]> findZeroSumSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> sumMap = new HashMap<>();

        int sum = 0;
        sumMap.put(0, new ArrayList<>());
        sumMap.get(0).add(-1);  // handle subarrays starting at index 0

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If this sum was seen before, all subarrays from those indices+1 to i have 0 sum
            if (sumMap.containsKey(sum)) {
                for (int start : sumMap.get(sum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            // Add current index to the list of this sum
            sumMap.putIfAbsent(sum, new ArrayList<>());
            sumMap.get(sum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4, -2, -2};

        List<int[]> subarrays = findZeroSumSubarrays(arr);
        System.out.println("Subarrays with zero sum:");
        for (int[] pair : subarrays) {
            System.out.println("From index " + pair[0] + " to " + pair[1]);
        }
    }
}