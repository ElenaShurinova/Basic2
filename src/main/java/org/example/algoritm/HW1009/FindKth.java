package org.example.algoritm.HW1009;

public class FindKth {

    public static class FindKthElement {

        public static void main(String[] args) {
            int[] arr1 = {100, 112, 256, 349, 770};
            int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
            int k = 7;

            System.out.println(findKthElement(arr1, arr2, k));
        }

        public static int findKthElement(int[] arr1, int[] arr2, int k) {
            int[] merged = new int[arr1.length + arr2.length];
            int i = 0, j = 0, m = 0;

            while (i < arr1.length && j < arr2.length) {
                if (arr1[i] < arr2[j]) {
                    merged[m++] = arr1[i++];
                } else {
                    merged[m++] = arr2[j++];
                }
            }

            while (i < arr1.length) {
                merged[m++] = arr1[i++];
            }

            while (j < arr2.length) {
                merged[m++] = arr2[j++];
            }

            return merged[k - 1];
        }
    }
}
