public class Merge_sort {

    public static void conquer(int arr[], int si, int mid, int end) {
        int merged[] = new int[end - si + 1];

        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= end) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int arr[], int si, int end) {
        if (si >= end) {
            return;
        }

        int mid = si + (end - si) / 2;
        divide(arr, si, mid);
        divide(arr, mid + 1, end);
        conquer(arr, si, mid, end);
    }

    public static void main(String[] args) {
        int[] arr = {10, 26, 73, 37, 83, 82, 20};
        int n = arr.length;

        divide(arr, 0, n - 1);

        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
