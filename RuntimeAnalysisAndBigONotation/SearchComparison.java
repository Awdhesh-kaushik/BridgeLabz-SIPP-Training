package RuntimeAnalysisAndBigONotation;

import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    // Linear Search: O(N)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    // Binary Search: O(log N)
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    // Generate random array of size N
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10); // Ensures wide range
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000, 1000000};
        for (int size : datasetSizes) {
            int[] data = generateRandomArray(size);
            int target = data[new Random().nextInt(size)]; // Pick a random existing target

            // Linear Search Timing
            long start = System.nanoTime();
            linearSearch(data, target);
            long linearTime = System.nanoTime() - start;

            // Sort before Binary Search
            Arrays.sort(data);
            start = System.nanoTime();
            binarySearch(data, target);
            long binaryTime = System.nanoTime() - start;

            System.out.printf("Dataset Size: %,d\n", size);
            System.out.printf("Linear Search Time: %.4f ms\n", linearTime / 1e6);
            System.out.printf("Binary Search Time: %.4f ms\n\n", binaryTime / 1e6);
        }
    }
}