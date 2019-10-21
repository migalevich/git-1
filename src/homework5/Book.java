package homework5;

import java.util.Objects;

public class Book {
    private String name;
    private String authorSecondName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        if(o != book) {
            if (numberPages == book.numberPages &&
                    year == book.year &&
                    Objects.equals(name, book.name) &&
                    Objects.equals(authorSecondName, book.authorSecondName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorSecondName, numberPages, year);
    }
//    @Override
//    public int hashCode()
//    {
//        int hash = 1;
//        hash = 31 * hash + numberPages;
//        hash = 31 * hash + year;
//        hash = 31 * hash + Objects.hashCode(this.name);
//        hash = 31 * hash + Objects.hashCode(this.authorSecondName);
//        return hash;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorSecondName='" + authorSecondName + '\'' +
                ", numberPages=" + numberPages +
                ", year=" + year +
                '}';
    }

}
