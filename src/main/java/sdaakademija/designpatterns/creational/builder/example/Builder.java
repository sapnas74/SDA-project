package sdaakademija.designpatterns.creational.builder.example;

public class Builder {
    public static void main(String[] args) {
        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 50)
                .addCheese(true)
                .addSauce(true)
                .takeAway(true)
                .build();

        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 32)
                .addSauce(true)
                .build();
        System.out.println(margharita);
        System.out.println(capriciosa);
    }
}
