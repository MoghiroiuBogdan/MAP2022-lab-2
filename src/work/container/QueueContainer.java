package work.container;

import work.model.Task;

import java.util.ArrayList;
import java.util.List;

public class QueueContainer extends SuperClass {

    public QueueContainer() {
        super();
    }


    @Override
    public Task remove() {
        return tasks.remove(0);
    }

}
