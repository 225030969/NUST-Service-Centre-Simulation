import java.util.Arrays;

public class InsertionSortDemo {

    public static void insertionSort(int[] array) {
        int n = array.length;
        int comparisonCount = 0;
        int shiftCount = 0;

        System.out.println("Initial Array: " + Arrays.toString(array) + "\n");

        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0) {
                comparisonCount++;
                if (array[j] > key) {
                    array[j + 1] = array[j];
                    shiftCount++;
                    j--;
                } else {
                    break; // Found correct position
                }
            }
            array[j + 1] = key;

            if (i <= 3) {
                System.out.printf("After Pass %d (Inserted %2d): %s%n", i, key, Arrays.toString(array));
            }
        }

        System.out.println("\nFinal Sorted Array: " + Arrays.toString(array));
        System.out.println("Total Comparisons: " + comparisonCount);
        System.out.println("Total Shifts: " + shiftCount);
    }

    public static void main(String[] args) {
        int[] serviceTimes = {17, 5, 23, 8, 14, 3, 11, 20, 6, 9};
        insertionSort(serviceTimes);
    }
}