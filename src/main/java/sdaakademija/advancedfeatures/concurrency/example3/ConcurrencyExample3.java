package sdaakademija.advancedfeatures.concurrency.example3;

import org.apache.log4j.Logger;

public class ConcurrencyExample3 {
    private static final Logger logger = Logger.getLogger(ConcurrencyExample3.class);

    public static void main(String[] args) {
        StopWatchThread stopWatchThread1 = new StopWatchThread("SW1");
        StopWatchThread stopWatchThread2 = new StopWatchThread("SW2");

        stopWatchThread1.start();
        stopWatchThread2.start();

        logger.info("Main thread starts");
        try {
            Thread.sleep(2000);
            logger.info("Main thread is still running");
            Thread.sleep(3000);
            logger.info("Main thread ends");
        } catch (InterruptedException e) {
            logger.error("Thread was interupted on sleep", e);
        }
    }
}
