package work.model;

import work.Sorter.AbstractSorter;
import work.Sorter.BubbleSort;
import work.Sorter.QuickSort;
import work.Sorter.SortingStrategy;

import java.util.Arrays;

public class SortingTask extends Task{
    @Override
    public void execute() {
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
    private int a[];
    private AbstractSorter sorter;
    SortingStrategy sortingStrategy;
    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public SortingTask(long id, String description, SortingStrategy sortingStrategy, int[] a) {
        super(id, description);
        this.a = a;
        this.sortingStrategy = sortingStrategy;
        if(this.sortingStrategy == SortingStrategy.QuickSort)
            this.sorter = new QuickSort();
        else if(this.sortingStrategy == SortingStrategy.BubbleSort)
            this.sorter = new BubbleSort();
    }

}
