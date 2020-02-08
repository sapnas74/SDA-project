package sdaakademija.designpatterns.creational.abstractfactory.example.factories;

import sdaakademija.designpatterns.creational.abstractfactory.example.pizza.Pizza;

public interface PizzaAbstractFactory {
    Pizza create(int size);
}
