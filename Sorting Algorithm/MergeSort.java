package SortingAlgorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] bookPrices = {450, 200, 300, 150, 400};

        System.out.println("Before Sorting:");
        printArray(bookPrices);

        mergeSort(bookPrices, 0, bookPrices.length - 1);

        System.out.println("After Sorting:");
        printArray(bookPrices);
    }

    // Recursive method to divide and sort the array
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge two sorted subarrays
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes of the two subarrays
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temp arrays
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        // Merge the temp arrays back into original array
        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements of leftArr if any
        while (i < n1)
            arr[k++] = leftArr[i++];

        // Copy remaining elements of rightArr if any
        while (j < n2)
            arr[k++] = rightArr[j++];
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int price : arr) {
            System.out.print(price + " ");
        }
        System.out.println();
    }
}