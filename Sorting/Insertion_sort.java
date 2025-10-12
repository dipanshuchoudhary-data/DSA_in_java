public class Insertion_sort {

    // Function to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];   // Current element to be inserted
            int j = i - 1;

            // Move elements greater than 'key' one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = {9, 5, 1, 4, 3};
        System.out.println("Before Sorting:");
        for (int num : arr)
            System.out.print(num + " ");

        insertionSort(arr);

        System.out.println("\n\nAfter Sorting:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
