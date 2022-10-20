package work.factory;

import work.container.Container;
import work.container.QueueContainer;
import work.container.StackContainer;

public class TaskContainerFactory implements Factory{
    @Override
    public Container createContainer(Strategy strategy) {
        if (strategy == Strategy.LIFO)
            return new StackContainer();
        if (strategy == Strategy.FIFO)
            return new QueueContainer();
        return null;
    }
}
