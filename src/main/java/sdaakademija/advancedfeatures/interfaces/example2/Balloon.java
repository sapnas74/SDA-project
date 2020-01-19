package sdaakademija.advancedfeatures.interfaces.example2;

import java.util.Random;

public class Balloon extends AirTransport implements Fly {

    public Balloon(int speed) {
        super(speed);
    }

    @Override
    public int maxSpeed() {
        return 100 / super.getSpeed() * new Random().nextInt();
    }

    @Override
    public boolean canFly(String condition) {
        return condition.equals("good");
    }

    // Pasidarem protected AirTransporte neberiekia sito
/*
    @Override
    public int getSpeed() {
        return super.getSpeed();
    }

 */
}

