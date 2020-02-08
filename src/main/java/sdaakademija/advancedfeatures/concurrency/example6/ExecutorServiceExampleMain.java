package sdaakademija.advancedfeatures.concurrency.example6;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExampleMain {

    static final int MAX_T = 3;

    public static void main(String[] args) {

        Runnable r1 = new Task("Task 1");
        Runnable r2 = new Task("Task 2");
        Runnable r3 = new Task("Task 3");
        Runnable r4 = new Task("Task 4");
        Runnable r5 = new Task("Task 5");

        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);

        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);

        pool.shutdown();

    }
}
