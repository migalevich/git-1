package homework5;

import java.util.*;

class BookDemo {
    public static void main(String[] args) {

        /* 1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book. List< Book > list = new LinkedList< Book >();
                Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах. */
        System.out.println("-------- Task 1 --------");
        //  List<Book> list = new ArrayList<Book>();
        List<Book> list = new LinkedList<Book>();
        list.add(0, new Book("Anna Karenina", "Tolstoy", 545, 1877));
        list.add(1, new Book("Idiot", "Dostoevsky", 432, 1869));
        list.add(2, new Book("Angels and Demons", "Brawn", 587, 2000));

        /* information about books*/
        System.out.println(">> Information about all books:");
        for (Book book : list) {
            System.out.println(book);
        }

        list.remove(2);

        /* information about books after removing*/
        System.out.println(">> List of books after removing second book:");
        for (Book book : list) {
            System.out.println(book);
        }

        /* 2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book, предусмотреть не менее 6 одинаковых по значению книг.
                Вывести на экран информацию о книга (содержащихся в коллекции HashSet), название которых начинается с гласной буквы. */
        System.out.println("-------- Task 2 --------");
        HashSet<Book> list2 = new HashSet<Book>();
        list2.add(new Book("It", "Steven", "King", "Edwin", 432, 1986)); // Сти́вен Э́двин Кинг
        list2.add(new Book("Insomnia", "Steven", "King", "Edwin", 526, 1994));
        list2.add(new Book("The Green Mile", "Steven", "King", "Edwin", 432, 1996));
        list2.add(new Book("Dreamcatcher", "Steven", "King", "Edwin", 256, 2001));
        list2.add(new Book("Cell", "Steven", "King", "Edwin", 256, 2006));
        list2.add(new Book("Black House", "Steven", "King", "Edwin", 256, 2001));
        list2.add(new Book("Lisey’s Story", "Steven", "King", "Edwin", 256, 2006));
        list2.add(new Book("Joyland", "Steven", "King", "Edwin", 256, 2013));
        list2.add(new Book("Revival", "Steven", "King", "Edwin", 256, 2014));
        list2.add(new Book("Revival", "Steven", "King", "Edwin", 256, 2014));
        list2.add(new Book("Revival", "Steven", "King", "Edwin", 256, 2014));
        list2.add(new Book("Revival", "Steven", "King", "Edwin", 256, 2014));
        list2.add(new Book("Revival", "Steven", "King", "Edwin", 256, 2014));
        list2.add(new Book("Revival", "Steven", "King", "Edwin", 256, 2014));
        list2.add(new Book("The Outsider", "Steven", "King", "Edwin", 256, 2018));
        list2.add(new Book("Angels & Demons", "Dan", "Brown", "", 567, 2000));
        list2.add(new Book("Deception Point", "Dan", "Brown", "", 458, 2001));
        list2.add(new Book("The Da Vinci Code", "Dan", "Brown", "", 258, 2003));
        list2.add(new Book("War and Peace", "Lev", "Tolstoy", "Nicolaevich", 1457, 1867));
        list2.add(new Book("The Gambler", "Fedor", "Dostoevsky", "Michailovich", 999, 1866));
        list2.add(new Book("The Master and Margarita", "Michail", "Bulgakov", "Afanasievich", 587, 1937));
        list2.add(new Book("And Quite Flows the Don", "Michail", "Sholohov", "Alexandrovich", 956, 1925));
        list2.add(new Book("Tom Sawyer’s Conspiracy", "Mark", "Twain", "", 784, 1967));
        list2.add(new Book("Mark Twain’s Autobiography", "Mark", "Twain", "", 787, 1924));
        list2.add(new Book("Twelve Men", "Theodore", "Dreiser", "Herman", 432, 1919));
        //    list2.add(new Book("The \"Genius\"", "Theodore", "Dreiser","Herman", 1526, 1915));
        //    list2.add(new Book("An American Tragedy", "Theodore", "Dreiser","Herman", 432, 1926));
        //    list2.add(new Book("The Stoic", "Theodore", "Dreiser","Herman", 432, 1947)); // Theodore Herman Albert Dreiser
        //    list2.add(new Book("The Angel of death", "Michail","Lermontov","Urevich", 145, 1857)); //Михаи́л Ю́рьевич Ле́рмонтов
        //    list2.add(new Book("Daemon", "Michail","Lermontov","Urevich",156, 1857));

        System.out.println(">> Books which name start from vowel letter:");
        for (Book book : list2) {
            if (book.getName().toLowerCase().substring(0, 1).matches("[aeyuio]")) {
                System.out.println(book);
            }
        }


        /* 3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги). */
        System.out.println("------ Task 3 ---------");
        System.out.println(">> SORTed collection by -> Second name, First name, Third name:");
        Set<Book> booksList = new TreeSet<>(list2);
        for (Book b : booksList) {
            System.out.println(b);
        }

     /* 4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать). Вывести на экран информацию о каждом
     чётном в списке студенте, каждого нечётного студента удалить из коллекции. */
        System.out.println("------ Task 4 ---------");
        Set<Student> studentsList = new TreeSet<>();
        studentsList.add(new Student("Pavel", "Ivanov", 28));
        studentsList.add(new Student("Anna", "Kotova", 24));
        studentsList.add(new Student("Irina", "Petrona", 29));
        studentsList.add(new Student("Artem", "Lykov", 34));
        studentsList.add(new Student("Elena", "Juk", 33));
        studentsList.add(new Student("Andrey", "Kubrick", 35));

        System.out.println(">> Information about every even student(every odd student deleted):");

        Iterator<Student> iterator = studentsList.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            if (i % 2 == 0) {
                System.out.println(iterator.next());
            } else {
                iterator.next();
                iterator.remove();
            }
            i++;
        }

        /* 5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товаров
         в данной категории. Сортировать коллекцию по количеству товаров в каждой категории, найти категорию в которой содержится максимальное количество товаров, удалить все категории в которых
         нет ни одного товара (предусмотреть такие категории при заполнении коллекции) */
        System.out.println("------ Task 5 ---------");

        Map<String, Integer> catalogMap = new HashMap<String, Integer>();
        catalogMap.put("Electronics", 3586);
        catalogMap.put("Beauty and Sport", 2423);
        catalogMap.put("Beauty and Sport2", 2423);
        catalogMap.put("Computers and Nets", 5782);
        catalogMap.put("Household Appliances", 67423);
        catalogMap.put("Construction and Repair", 4532);
        catalogMap.put("Work and Office", 0);

        System.out.println(catalogMap);

        System.out.println(">> Find the category with max value:");
        int max = 0;
        String categoryMaxValue = null;
        for (Map.Entry<String, Integer> entry : catalogMap.entrySet()) {
            // System.out.println(entry);
            if (entry.getValue() > max) {
                categoryMaxValue = entry.getKey();
                max = entry.getValue();
            }
        }
        System.out.println(categoryMaxValue);


        System.out.println(">> Deleting the category with value = 0:");
        Iterator iteratorMap = (Iterator) catalogMap.values().iterator();

        while (iteratorMap.hasNext()) {
            if ((int) iteratorMap.next() == 0) {
                iteratorMap.remove();
            }
        }
        System.out.println(catalogMap);

        System.out.println(">> Sorted catalog:");

        Map<String, Integer> catalogMapTree = new TreeMap<>(catalogMap);
        SortedSet<Map.Entry<String, Integer>> sortedSet = new TreeSet<>(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> e1,
                                       Map.Entry<String, Integer> e2) {
                        if (e1.getValue() < e2.getValue()) {
                            return -1;
                        } else if ((int)e1.getValue()== e2.getValue()) {
                            return e1.getKey().compareTo(e2.getKey());
                        } else {
                            return 1;
                        }
                    }
                });

        sortedSet.addAll(catalogMapTree.entrySet());
        System.out.println(sortedSet);


    } // main

}

