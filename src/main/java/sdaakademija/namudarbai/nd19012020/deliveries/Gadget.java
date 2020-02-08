package sdaakademija.namudarbai.nd19012020.deliveries;

public class Gadget {
    private String gadgetType;
    private int price;
    private Distributor distributor;

    public Gadget(String gadgetType, int price, Distributor distributor) {
        this.gadgetType = gadgetType;
        this.price = price;
        this.distributor = distributor;
    }

    public String getGadgetType() {
        return gadgetType;
    }

    public int getPrice() {
        return price;
    }

    public Distributor getDistributor() {
        return distributor;
    }
}
