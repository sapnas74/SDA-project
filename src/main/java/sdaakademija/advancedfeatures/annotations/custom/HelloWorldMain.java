package sdaakademija.advancedfeatures.annotations.custom;

public class HelloWorldMain {

    @MyAnnotation(
        name = "Stanislovas",
        age = 24
    )
    public void sayHello() {
        System.out.println("Hello World !!!");
    }
}
