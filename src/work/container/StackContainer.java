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
        return tasks.remove(tasks.size() - 1);
    }
}
