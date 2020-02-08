package sdaakademija.advancedfeatures.concurrency.example2;

public class StopWatchThread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 10 ; i++) {
            System.out.println("Stop watch : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
