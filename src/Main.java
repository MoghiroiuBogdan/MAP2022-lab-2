import work.container.Container;
import work.container.StackContainer;
import work.factory.Strategy;
import work.model.MessageTask;
import work.model.Task;
import work.taskRunner.StrategyTaskRunner;
import work.taskRunner.TaskRunner;

import java.time.LocalDateTime;


public class Main {
    public static void main(String[] args) {
        System.out.println("test");


        MessageTask m = new MessageTask(1,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m1 = new MessageTask(2,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m2 = new MessageTask(3,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m3 = new MessageTask(4,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m4 = new MessageTask(5,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m5 = new MessageTask(6,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m6 = new MessageTask(7,"sem map", "concepte OOP", LocalDateTime.now());
        MessageTask m7 = m4;
//        m.execute();


//        Container container  =new StackContainer();
//        container.add(m1);
//        container.add(m2);
//        container.add(m3);
//        container.add(m4);
//
//
//        while(container.isEmpty() != true){
//            Task task = container.remove();
//            task.execute();
//        }


        TaskRunner runner = new StrategyTaskRunner(Strategy.LIFO);
        runner.addTask(m1);
        runner.addTask(m2);
        runner.addTask(m3);
        runner.addTask(m4);
        runner.addTask(m5);

        runner.executeAll();
    }
}