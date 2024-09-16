package org.example.algoritm._10_09;

public class Task {
    private static int binarySearch(int[] sortedArray, int valueToFind, int low, int high) {
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedArray[mid] < valueToFind) {
                low = mid + 1;
            } else if (sortedArray[mid] > valueToFind) {
                high = mid - 1;
            } else if (sortedArray[mid] == valueToFind) {
                index = mid;
                break;
            }
        }
        return index;
    }
    static int binarySearchRecurs(int[] values, int valueToFind, int low, int high) {
        if (low == high) {
            return (values[low] == valueToFind) ? low : -1;
        }

        int mid = low + (high - low) / 2;

        if (valueToFind > values[mid]) {
            return binarySearchRecurs(values, valueToFind, mid + 1, high);
        } else if (values[mid] > valueToFind) {
            return binarySearchRecurs(values, valueToFind, low, mid - 1);
        }
        return mid;
    }
}
