package sdaakademija.designpatterns.creational;

import sdaakademija.designpatterns.creational.abstractfactory.example.factories.PizzaFactory;
import sdaakademija.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class AbstractFactory {
    public static void main(String[] args) {
        Pizza margharita = PizzaFactory.createPizza("Margharita", 32);
        Pizza capriciosa = PizzaFactory.createPizza("Capriciosa", 32);
        Pizza fruttidimare = PizzaFactory.createPizza("FruttiDiMare", 32);

        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(fruttidimare);
    }
}
