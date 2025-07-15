package SortingAlgorithms;

public class HeapSort {
    public static void main(String[] args) {
        int[] salaries = {30000, 25000, 40000, 22000, 50000};

        System.out.println("Before Sorting:");
        printArray(salaries);

        heapSort(salaries);

        System.out.println("After Sorting:");
        printArray(salaries);
    }

    // Heap Sort function
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Extract elements from heap one by one
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Heapify reduced heap
            heapify(arr, i, 0);
        }
    }

    // To heapify a subtree rooted at index i
    public static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;       // Initialize largest as root
        int left = 2 * i + 1;  // left child
        int right = 2 * i + 2; // right child

        // If left child is larger than root
        if (left < heapSize && arr[left] > arr[largest])
            largest = left;

        // If the right child is larger than the largest so far
        if (right < heapSize && arr[right] > arr[largest])
            largest = right;

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected subtree
            heapify(arr, heapSize, largest);
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int salary : arr) {
            System.out.print(salary + " ");
        }
        System.out.println();
    }
}