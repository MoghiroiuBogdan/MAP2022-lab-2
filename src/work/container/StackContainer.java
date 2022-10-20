package work.container;

import work.model.Task;

import java.util.ArrayList;
import java.util.List;

public class StackContainer implements Container{

    List<Task> tasks;

    public StackContainer(){
        tasks = new ArrayList<>();
    }

    @Override
    public Task remove() {
//        int[] a = new int[3];
        return tasks.remove(tasks.size() - 1);
    }

    @Override
    public void add(Task task) {
        tasks.add(task);
    }

    @Override
    public int size() {
        return tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
