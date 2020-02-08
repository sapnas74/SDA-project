package sdaakademija.advancedfeatures.concurrency.example7;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicInt implements Runnable {
    private AtomicInteger atomicInteger = new AtomicInteger(0);
    private int simpleInt = 0;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            processSomething();
            System.out.println("Simple int: " + simpleInt++);
            System.out.println("Atomic int: " + atomicInteger.incrementAndGet());
        }
    }

    private void processSomething() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
