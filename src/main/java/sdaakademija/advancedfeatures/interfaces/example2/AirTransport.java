package sdaakademija.advancedfeatures.interfaces.example2;

public abstract class AirTransport {

//    private int speed;
    protected int speed;

    public AirTransport(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
}
