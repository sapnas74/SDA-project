package sdaakademija.advancedfeatures.concurrency.example4;

public class ConcurrencyExample4{

    public static void main(String[] args) {
        Thread stopWatchThread = new Thread(new StopWatchThread());
        stopWatchThread.start();
    }
}
