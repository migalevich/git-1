package homework5;

import java.util.Comparator;
import java.util.Objects;

public class Book implements Comparable<Book> {
    private String name;
    private String authorFirstName;
    private String authorSecondName;
    private String authorThirdName;
    private int numberPages;
    private int year;

    public Book() {
    }

    public Book(String name, String authorSecondName, int numberPages, int year) {
        this.name = name;
        this.authorSecondName = authorSecondName;
        this.numberPages = numberPages;
        this.year = year;
    }

    public Book(String name, String authorFirstName, String authorSecondName, String authorThirdName, int numberPages, int year) {
        this.name = name;
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
        this.authorThirdName = authorThirdName;
        this.numberPages = numberPages;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    public void setAuthorSecondName(String authorSecondName) {
        this.authorSecondName = authorSecondName;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorThirdName() {
        return authorThirdName;
    }

    public void setAuthorThirdName(String authorThirdName) {
        this.authorThirdName = authorThirdName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        // if(o != book) {
        if (numberPages == book.numberPages &&
                year == book.year &&
                Objects.equals(name, book.name) &&
                Objects.equals(authorFirstName, book.authorFirstName) &&
                Objects.equals(authorSecondName, book.authorSecondName) &&
                Objects.equals(authorThirdName, book.authorThirdName)
        ) {
            return true;
        }
        //   }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorFirstName, authorSecondName, authorThirdName, numberPages, year);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorFirstName='" + authorFirstName + '\'' +
                ", authorSecondName='" + authorSecondName + '\'' +
                ", authorThirdName='" + authorThirdName + '\'' +
                ", numberPages=" + numberPages +
                ", year=" + year +
                '}';
    }

    @Override
    public int compareTo(Book p) {
        return authorSecondName.compareTo(p.authorSecondName);
    }


}