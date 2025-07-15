package SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] scores = {78, 92, 60, 85, 74};

        System.out.println("Before Sorting:");
        printArray(scores);

        selectionSort(scores);

        System.out.println("After Sorting:");
        printArray(scores);
    }

    // Selection Sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in unsorted array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int score : arr) {
            System.out.print(score + " ");
        }
        System.out.println();
    }
}