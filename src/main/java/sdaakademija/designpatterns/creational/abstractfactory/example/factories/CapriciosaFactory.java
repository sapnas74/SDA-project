package sdaakademija.designpatterns.creational.abstractfactory.example.factories;

import sdaakademija.designpatterns.creational.abstractfactory.example.pizza.Capriciosa;
import sdaakademija.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public class CapriciosaFactory implements PizzaAbstractFactory {
    @Override
    public Pizza create(int size) {
        return new Capriciosa(size);
    }
}
