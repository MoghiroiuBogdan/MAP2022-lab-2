package work.container;

import work.model.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class SuperClass implements Container {
    List<Task> tasks;

    public SuperClass() {
        tasks = new ArrayList<>();
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
