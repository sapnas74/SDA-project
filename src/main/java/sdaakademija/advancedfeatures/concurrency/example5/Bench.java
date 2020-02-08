package sdaakademija.advancedfeatures.concurrency.example5;

public class Bench {

    private int availableSeats;

    public Bench(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void takeASeat() {
        if (availableSeats > 0) {
            System.out.println("Take a seat.");
            availableSeats--;
            System.out.println("Free seats left : " + availableSeats);
        } else {
            System.out.println("There are no available seats !! ");
        }
    }

    public synchronized void methodWithSyncedCodeBlock() {
        System.out.println("Unsynced part");
 //       synchronized (this) {
            System.out.println("Synced part");
            if (availableSeats > 0) {
                System.out.println("Take a seat.");
                availableSeats--;
                System.out.println("Free seats left : " + availableSeats);
            } else {
                System.out.println("There are no available seats !! ");
            }
//        }
    }
}
