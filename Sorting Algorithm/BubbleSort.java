package SortingAlgorithms;
public class BubbleSort {

    //This method sorts an array using Bubble Sort algorithm.
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        // Traverse the array n-1 times
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Compare adjacent elements and swap if the left one is greater than the right one
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap marks[j] and marks[j + 1]
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps were made during the inner loop, the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    //main method to run the Bubble Sort program.
    public static void main(String[] args) {
        // Sample array of student marks
        int[] studentMarks = {85, 67, 90, 55, 76, 95, 62};

        System.out.println("Original Marks:");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }

        // Call bubble sort method
        bubbleSort(studentMarks);

        System.out.println("\n\nSorted Marks (Ascending Order):");
        for (int mark : studentMarks) {
            System.out.print(mark + " ");
        }
    }
}