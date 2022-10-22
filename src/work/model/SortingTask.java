package work.model;

import java.util.Arrays;

public class SortingTask extends Task{
    @Override
    public void execute() {
        BubbleSort(a);
        System.out.println(Arrays.toString(a));
    }
    private int a[];

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public SortingTask(long id, String description, int[] a) {
        super(id, description);
        this.a = a;
    }

    public void BubbleSort(int[] a){
        for(int i=0;i<a.length - 1;i++)
            for(int j=0;j<a.length - i - 1;j++)
                if(a[j] > a[j + 1]){int aux = a[j];
                                    a[j] = a[j+1];
                                    a[j+1] = aux;
                }
    }

    public void ArraySort(int[] a){
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }

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

        System.out.println(Arrays.toString(a));
    }

}
