import work.container.Container;
import work.container.StackContainer;
import work.factory.Strategy;
import work.model.MessageTask;
import work.model.Task;
import work.taskRunner.StrategyTaskRunner;
import work.taskRunner.TaskRunner;
import work.model.SortingTask;
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

//        runner.executeAll();

        TaskRunner runner1 = new StrategyTaskRunner(Strategy.FIFO);
        runner1.addTask(m1);
        runner1.addTask(m2);
        runner1.addTask(m3);
        runner1.addTask(m4);
        runner1.addTask(m5);

//        runner1.executeAll();

        SortingTask a = new SortingTask(1,"map", new int[]{4, 3, 2, 1});
        SortingTask a1 = new SortingTask(2,"map", new int[]{7,6,5,4});
        SortingTask a2 = new SortingTask(3,"map", new int[]{9,8,7,6});
        SortingTask a3 = new SortingTask(4,"map", new int[]{9,5,6,1});

//        a.BubbleSort(a2.getA());
        a.ArraySort(a3.getA());
        a.execute();
        a2.quickSort(a2.getA(), 0, 3);

    }
}