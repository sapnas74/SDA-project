package sdaakademija.fundamentals.loop.foreach;

public class Example2 {

    public static void main(String[] args) {

        Animal dog = new Animal("Boss", "Boxer");
        Animal cat = new Animal("Dolly", "Ciau Ciau");

        Animal[] animals = {dog, cat};

        for (Animal a : animals) {
            System.out.println(a.getName());

        }
    }
}

// Animal objektas

    class Animal {

        private String name;
        private String breed;

        // KOnstruktorius
        Animal (String name, String breed) {
            this.name = name;
            this.breed = breed;

            // this sitam objektui suteikiama reiksme kuri atejo per funkcija
        }

        //Kintamojo getteris
        public String getName() {
            return name;

            // private yra tas name , todel reikia Getterio grazinti reiksme !

        }
    }


