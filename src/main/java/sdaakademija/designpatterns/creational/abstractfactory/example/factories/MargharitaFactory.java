package sdaakademija.designpatterns.creational.abstractfactory.example.factories;

import sdaakademija.designpatterns.creational.abstractfactory.example.pizza.Margharita;
import sdaakademija.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class MargharitaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return new Margharita(size);
    }
}
