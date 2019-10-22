package homework5;

import java.util.*;

class BookDemo {
    public static void main(String[] args) {

        /* 1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book. List< Book > list = new LinkedList< Book >();
                Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах. */
        System.out.println("-------- Task 1 --------");
        List<Book> list = new ArrayList<Book>();
        list.add(0, new Book("Anna Karenina", "Tolstoy", 545, 1877));
        list.add(1, new Book("Idiot", "Dostoevsky", 432, 1869));
        list.add(2, new Book("Angels and Demons", "Brawn", 587, 2000));
        /* information about books*/
        for (Book book : list) {
            System.out.println(book);
        }

        list.remove(2);

        /* information about books after remove*/
        System.out.println("List of books after removing:");
        for (Book book : list) {
            System.out.println(book);
        }

        /* 2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book, предусмотреть не менее 6 одинаковых по значению книг.
                Вывести на экран информацию о книга (содержащихся в коллекции HashSet), название которых начинается с гласной буквы. */
        System.out.println("-------- Task 2 --------");
        HashSet<Book> list2 = new HashSet<Book>();
        list2.add(new Book("It", "Steven", "King","Edwin", 432, 1986)); // Сти́вен Э́двин Кинг
        list2.add(new Book("Insomnia","Steven", "King","Edwin",526, 1994));
        list2.add(new Book("The Green Mile", "Steven", "King","Edwin", 432, 1996));
        list2.add(new Book("Dreamcatcher", "Steven", "King","Edwin",256, 2001));
        list2.add(new Book("Cell", "Steven", "King","Edwin", 256, 2006));
        list2.add(new Book("Black House", "Steven", "King","Edwin", 256, 2001));
        list2.add(new Book("Lisey’s Story", "Steven", "King","Edwin", 256, 2006));
        list2.add(new Book("Joyland", "Steven", "King","Edwin", 256, 2013));
        list2.add(new Book("Revival", "Steven", "King","Edwin", 256, 2014));
        list2.add(new Book("The Outsider", "Steven", "King","Edwin",256, 2018));
        list2.add(new Book("Angels & Demons","Dan", "Brown","", 567, 2000));
        list2.add(new Book("Deception Point","Dan", "Brown","", 458, 2001));
        list2.add(new Book("The Da Vinci Code","Dan", "Brown", "",258, 2003));
        list2.add(new Book("War and Peace", "Lev","Tolstoy","Nicolaevich", 1457, 1867));
        list2.add(new Book("The Gambler", "Fedor","Dostoevsky","Michailovich", 999, 1866));
        list2.add(new Book("The Master and Margarita", "Michail","Bulgakov","Afanasievich", 587, 1937));
        list2.add(new Book("And Quite Flows the Don", "Michail","Sholohov","Alexandrovich", 956, 1925));
        list2.add(new Book("Tom Sawyer’s Conspiracy","Mark", "Twain","", 784, 1967));
        list2.add(new Book("Mark Twain’s Autobiography","Mark", "Twain","", 787, 1924));
        list2.add(new Book("Twelve Men", "Theodore", "Dreiser","Herman",432, 1919));
        list2.add(new Book("The \"Genius\"", "Theodore", "Dreiser","Herman", 1526, 1915));
        list2.add(new Book("An American Tragedy", "Theodore", "Dreiser","Herman", 432, 1926));
        list2.add(new Book("The Stoic", "Theodore", "Dreiser","Herman", 432, 1947)); // Theodore Herman Albert Dreiser
        list2.add(new Book("The Angel of death", "Michail","Lermontov","Urevich", 145, 1857)); //Михаи́л Ю́рьевич Ле́рмонтов
        list2.add(new Book("Daemon", "Michail","Lermontov","Urevich",156, 1857));

        for (Book book : list2) {
            if (book.getName().toLowerCase().substring(0, 1).matches("[aeyuio]")) {
                System.out.println(book);
            }
        }

        System.out.println("------ sort ---------");
        /* 3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги). */
        List<Book> bookList = new LinkedList<Book>();
        bookList.addAll(list2);
        Collections.<Book>sort(bookList);
        for (Book b : bookList) {
            System.out.println(b);
        }
      //  Collections.sort(list2);
        //list2.sort(comparingString(Book::getAuthorFirstName));

    } // main
}

