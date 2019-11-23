package sdaakademija.fundamentals.practicalexercises.workes;

public class Workers {

    private String name;
    private double salary;
    private int age;
    private String gender;

    public Workers(String name, double salary, int age,String gender) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
