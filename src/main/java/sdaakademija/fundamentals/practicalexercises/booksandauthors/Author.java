package sdaakademija.fundamentals.practicalexercises.booksandauthors;

public class Author {

    private String name;
    private String email;
    private int phoneNumber;

    public Author(String name, String email, int phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return String.format("Autoriaus vardas : %s, emailas : %s", name, email);
    }
}
