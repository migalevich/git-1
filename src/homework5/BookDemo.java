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
        list2.add(new Book("It", "King", 432, 1986));
        list2.add(new Book("It", "King", 432, 1986));
        list2.add(new Book("It222", "King", 432, 1986));


       // list2.add(new Book("It", "King", 432, 1986));
       // list2.add(new Book("It2", "King", 432, 1986));
       // list2.add(new Book("Radiance", "King", 432, 1977));
        for (Book book : list2) {
            System.out.println(book);
        }

    } // main
}

