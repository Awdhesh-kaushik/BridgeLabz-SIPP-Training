package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 110, 101, 108};

        System.out.println("Before Sorting:");
        printArray(employeeIDs);

        insertionSort(employeeIDs);

        System.out.println("After Sorting:");
        printArray(employeeIDs);
    }

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Traverse from the second element to the last
        for (int i = 1; i < n; i++) {
            int key = arr[i]; // Current element to insert into sorted part
            int j = i - 1;

            // Shift elements greater than key to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at its correct position
            arr[j + 1] = key;
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int id : arr) {
            System.out.print(id + " ");
        }
        System.out.println();
    }
}