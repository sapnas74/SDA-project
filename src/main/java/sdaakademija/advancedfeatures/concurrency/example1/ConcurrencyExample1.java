package sdaakademija.advancedfeatures.concurrency.example1;


import org.apache.log4j.Logger;

public class ConcurrencyExample1 {

    private static final Logger logger = Logger.getLogger(ConcurrencyExample1.class);

    public static void main(String[] args) {
        logger.info("Main thread starts");

        try {
            Thread.sleep(2000);
            logger.info("Main thread is still running");
            Thread.sleep(3000);
            logger.info("Main thread ends");
        } catch(InterruptedException e) {
            logger.error("Thread was interuped on sleep", e);
        }
    }
}
