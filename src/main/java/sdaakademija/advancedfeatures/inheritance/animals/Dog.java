package java_advanced.inheritance.animals;

public class Dog extends Animal {
    private String breed;

    public Dog(boolean mammal, String voice, String breed) {
        super(mammal, voice);
        this.breed = breed;
    }
}
