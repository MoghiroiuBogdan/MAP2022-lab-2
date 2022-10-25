package work.Sorter;

import java.util.Arrays;

public class QuickSort extends AbstractSorter {
    private int partition(int a[], int begin, int end) {
        int pivot = a[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (a[j] <= pivot) {
                i++;

                int swapTemp = a[i];
                a[i] = a[j];
                a[j] = swapTemp;
            }
        }

        int swapTemp = a[i+1];
        a[i+1] = a[end];
        a[end] = swapTemp;

        return i+1;
    }

    public void quickSort(int a[], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(a, begin, end);

            quickSort(a, begin, partitionIndex-1);
            quickSort(a, partitionIndex+1, end);
        }

    }

    @Override
    public void sort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }
}
