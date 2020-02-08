package sdaakademija.namudarbai.nd19012020.oop;

public class OopMain {
    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal animal = new Animal();

        cat.setAnimalName("Vikas");
        dog.setAnimalName("Pinkis");

        System.out.println(dog.getAnimalName());
        System.out.println(cat.getAnimalName());

        System.out.println(animal.animalVoice());
        System.out.println(cat.animalVoice());
        System.out.println(dog.animalVoice());
    }
}
