package sdaakademija.advancedfeatures.interfaces.example1;

public interface Shape {

    double getArea();
    double getPerimeter();

    default void print() {
        System.out.println("Shape : " + getPerimeter());
        System.out.println("Shape : " + getArea());
    }
}
