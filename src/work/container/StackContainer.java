package work.container;

import work.model.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer extends SuperClass{

    public StackContainer(){
        super();
    }

    @Override
    public Task remove() {
//        int[] a = new int[3];
        return tasks.remove(tasks.size() - 1);
    }
}
