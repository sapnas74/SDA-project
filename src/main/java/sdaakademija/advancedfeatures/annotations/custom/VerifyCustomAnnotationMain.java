package sdaakademija.advancedfeatures.annotations.custom;

import java.lang.reflect.Method;

public class VerifyCustomAnnotationMain {
    public static void main(String[] args) {
        try {
            HelloWorldMain obj = new HelloWorldMain();
            Method method = obj.getClass().getMethod("sayHello");

            MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
            System.out.printf("Name:  %s and age:  %s", myAnnotation.name(), myAnnotation.age());
        } catch (Exception e) {
            System.out.println("Something went wrong!");
        }
    }
}
