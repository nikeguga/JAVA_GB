import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        if (a.length <= 1) {
            return a;
        }

        // Split the input a into two halves
        int middle = a.length / 2;
        int[] left = new int[middle];
        int[] right = new int[a.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = a[i];
        }
        for (int i = middle; i < a.length; i++) {
            right[i - middle] = a[i];
        }

        // Recursively sort both halves
        left = mergeSort(left);
        right = mergeSort(right);

        // Merge the sorted halves
        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int leftPointer = 0, rightPointer = 0, resultPointer = 0;

        // Compare elements from both halves and merge them
        while (leftPointer < left.length && rightPointer < right.length) {
            if (left[leftPointer] < right[rightPointer]) {
                result[resultPointer++] = left[leftPointer++];
            } else {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        // Copy any remaining elements from the left and right halves
        while (leftPointer < left.length) {
            result[resultPointer++] = left[leftPointer++];
        }

        while (rightPointer < right.length) {
            result[resultPointer++] = right[rightPointer++];
        }

        return result;
    }
}