package sdaakademija.namudarbai.nd19012020.deliveries;

public class Person {
    private String name;
    private String deliveryAddress;
    private String gadgetType;
    private String deliverUntil;

    public Person(String name, String deliveryAddress, String gadgetType, String deliverUntil) {
        this.name = name ;
        this.deliveryAddress = deliveryAddress;
        this.gadgetType = gadgetType;
        this.deliverUntil = deliverUntil;
    }

    public String getName() {
        return name;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getGadgetType() {
        return gadgetType;
    }

    public String getDeliverUntil() {
        return deliverUntil;
    }
}
