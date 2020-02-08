package sdaakademija.namudarbai.nd19012020.deliveries;

public class Distributor {

    private String name;
    private String deliveredFrom;
    private String deliveryDate;

    public Distributor(String name, String deliveredFrom, String deliveryDate) {
        this.name = name;
        this.deliveredFrom = deliveredFrom;
        this.deliveryDate = deliveryDate;
    }

    public String getName() {
        return name;
    }

    public String getDeliveredFrom() {
        return deliveredFrom;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }
}
