package sdaakademija.advancedfeatures.concurrency.example2;

import org.apache.log4j.Logger;

public class ConcurrencyExample2 {

    private static final Logger logger = Logger.getLogger(ConcurrencyExample2.class);

    public static void main(String[] args) {
        StopWatchThread stopWatchThread = new StopWatchThread();
        stopWatchThread.start();

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
