/*
package sdaakademija.fundamentals.practicalexercises.booksandauthors;

import sdaakademija.fundamentals.practicalexercises.booksandauthors.Author;
import sdaakademija.fundamentals.practicalexercises.booksandauthors.Book;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BooksAndAuthorsMain {

    private static final String FILE_LOCATION_BOOKS_DATA = "C:\\Users\\stkas\\IdeaProjects\\ManoAsmeniniaiDarbai\\src\\main\\java\\sdaakademija\\fundamentals\\practicalexercises\\BooksData.txt";

    public static void main(String[] args) {

         List<Book> bookList = readDataFromFile();

    }

    private static List<Book> readDataFromFile() {
        List<Book> bookList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION_BOOKS_DATA))) {

            String line = br.readLine();

            while (line != null) {                  //iskaidem i masiva
                bookList.add(mapBookData(line));
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
        return bookList;

    }



    private static Book mapBookData(String[] bookData) {
        return new Book(bookData[0], bookData[0], bookData[0], bookData[0]);

    }

    private static List<Author> mapAuthorData(String[] authorData) {
        return new Author(authorData[0], authorData[0], authorData[0]);

    }

    /*private static String mapDataBooksAndAuthor(String[] bookAndAuthorData) {
        return new Author(bookAndAuthorData[0], bookAndAuthorData[0], bookAndAuthorData[0]);

    }

}

*/