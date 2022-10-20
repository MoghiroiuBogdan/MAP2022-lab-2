package work.factory;

import work.container.Container;

public interface Factory {
    Container createContainer(Strategy startegy);


}
