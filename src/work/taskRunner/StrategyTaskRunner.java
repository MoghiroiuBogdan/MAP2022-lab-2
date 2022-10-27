package work.taskRunner;

import work.container.Container;
import work.factory.Strategy;
import work.factory.TaskContainerFactory;
import work.model.Task;

public class StrategyTaskRunner implements TaskRunner{
    private Container container;

    public StrategyTaskRunner(Strategy strategy) {
        this.container =TaskContainerFactory.getInstance().createContainer(strategy);
        // creat Factory as a singleton object
    }

    @Override
    public void executeOneTask() {
        if (container.isEmpty() != true)
            container.remove().execute();
    }

    @Override
    public void executeAll() {
        while(container.isEmpty() != true)
            executeOneTask();
    }

    @Override
    public void addTask(Task t) {
        container.add(t);
    }

    @Override
    public boolean hasTask() {
        return !container.isEmpty();
    }
}
