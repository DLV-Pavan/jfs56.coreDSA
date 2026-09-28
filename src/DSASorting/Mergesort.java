package DSASorting;

public class Mergesort {

    static void mergeSort(int[] a, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Divide left part
            mergeSort(a, left, mid);

            // Divide right part
            mergeSort(a, mid + 1, right);

            // Merge both parts
            merge(a, left, mid, right);
        }
    }

    static void merge(int[] a, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[right - left + 1];

        // Compare elements
        while (i <= mid && j <= right) {

            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }

            k++;
        }

        // Copy remaining left elements
        while (i <= mid) {
            temp[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining right elements
        while (j <= right) {
            temp[k] = a[j];
            j++;
            k++;
        }

        // Copy temp back to original array
        for (i = left, k = 0; i <= right; i++, k++) {
            a[i] = temp[k];
        }
    }

    public static void main(String[] args) {

        int[] a = {8, 3, 5, 2, 7, 1};

        mergeSort(a, 0, a.length - 1);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}