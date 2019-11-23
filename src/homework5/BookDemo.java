package homework5;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

class BookDemo {
    public static void main(String[] args) {

        /* 1. Создать экземпляр класса LinkedList, разместить в нём 3 ссылки на объекты класса Book. List< Book > list = new LinkedList< Book >();
                Вывести информацию о всех книгах. Программно удалить из коллекции вторую книгу, вывести на экран информацию о оставшихся книгах. */
        System.out.println("-------- Task 1 --------");

        List<Book> list = new LinkedList<>();
        addBooksToCollection(list, 3);


        /* information about books*/
        System.out.println(">> Information about all books:");
        printCollection(list);

        list.remove(1);

        /* information about books after removing*/
        System.out.println(">> List of books after removing second book:");
        printCollection(list);


        /* 2. Создать экземпляр класса HashSet, добавить в него 25 ссылок на экземпляры класса Book, предусмотреть не менее 6 одинаковых по значению книг.
                Вывести на экран информацию о книга (содержащихся в коллекции HashSet), название которых начинается с гласной буквы. */
        System.out.println("-------- Task 2 --------");
        HashSet<Book> list2 = new HashSet<>();
        addBooksToCollection(list2, 25);

        System.out.println(">> Books which name start from vowel letter:");
        for (Book book : list2) {
            if (book.getName().toLowerCase().substring(0, 1).matches("[aeyuio]")) {
                System.out.println(book);
            }
        }


        /* 3. Отсортировать коллекцию из задания 2 по фамилии, затем по имени, по отчеству (эти поля надо добавить в класс Book для автора книги). */
        System.out.println("------ Task 3 ---------");
        sortCollection(list2);

         /* 4. Создать экземпляр класса TreeSet, поместить в него объекты класса Student(надо его спроектировать). Вывести на экран информацию о каждом
         чётном в списке студенте, каждого нечётного студента удалить из коллекции. */
        System.out.println("------ Task 4 ---------");
        createTreeSet();

        /* 5. Создать экземпляр класса HashMap, разместить в нём следующую информацию: в качестве ключа  - категория товара в каталоге (catalog.onliner.by) в качестве значения - количество товаров
         в данной категории. Сортировать коллекцию по количеству товаров в каждой категории, найти категорию в которой содержится максимальное количество товаров, удалить все категории в которых
         нет ни одного товара (предусмотреть такие категории при заполнении коллекции) */
        System.out.println("------ Task 5 ---------");

        Map<String, Integer> catalogMap = new HashMap<>();
        createCatalog(catalogMap);

        System.out.println(catalogMap);

        System.out.println(">> Find the category with max value:");
        findCatalogWithMaxValue(catalogMap);


        System.out.println(">> Deleting the category with value = 0:");
        deleteEmptyCatalogs(catalogMap);

        System.out.println(">> Sorted catalog:");
        sortCatalog(catalogMap);


    } // main

    private static void addBooksToCollection(Collection<Book> list, int quantity) {
        ResourceBundle myResources2 = ResourceBundle.getBundle("homework5.MyResources", new Locale("info"));
        ResourceBundle myResources1 = ResourceBundle.getBundle("homework5.MyResources", new Locale("names"));
        for (int j = 0; j < quantity; j++) {
            String bookInfo = myResources2.getString(myResources1.getString(String.valueOf(j)));
            String[] bookInfoArray = parseBookInfo(bookInfo);

            list.add(new Book(myResources1.getString(String.valueOf(j)), bookInfoArray[0], bookInfoArray[1], bookInfoArray[2], Integer.parseInt(bookInfoArray[3]), Integer.parseInt(bookInfoArray[4])));

        }

    }

    private static void printCollection(Collection<Book> list) {

        for (Book book : list) {
            System.out.println(book);
        }

    }

    private static String[] parseBookInfo(String infoBook) {
        String authorFirstName = "";
        String authorSecondName = "";
        String authorThirdName = "";
        String year = "2000";
        String pages = "0";
        String[] word = infoBook.split(" ");
        for (int i = 0; i < 5; i++) {
            switch (i) {
                case 0:
                    authorFirstName = word[i];
                    break;
                case 1:
                    authorSecondName = word[i];
                    break;
                case 2:
                    authorThirdName = word[i].replaceAll("_", "");
                    break;
                case 3:
                    year = word[i];
                    break;
                case 4:
                    pages = word[i];
                    break;
            }
        }
        return new String[]{authorFirstName, authorSecondName, authorThirdName, year, pages};
    }

    private static void sortCollection(Set<Book> list2) {
        System.out.println(">> SORTed collection by -> Second name, First name, Third name:");
        Set<Book> booksList = new TreeSet<>(list2);
        for (Book b : booksList) {
            System.out.println(b);
        }
    }

    private static void createTreeSet() {
        Set<Student> studentsList = new TreeSet<>();
        createStudentsList(studentsList);

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
    }


    private static void createStudentsList(Set<Student> studentsList) {

        String[] firstNameArray = {"Pavel", "Anna", "Irina", "Artem", "Elena", "Andrey"};
        String[] secondNameArray = {"Ivanov", "Kotova", "Petrona", "Lykov", "Juk", "Kubrick"};
        int a = 20;
        int b = 30;
        int len = firstNameArray.length;
        int[] ageArray = new int[len];
        for (int i = 0; i < len; i++) {
            ageArray[i] = a + (int) (Math.random() * b);
        }
        for (int i = 0; i < len; i++) {
            studentsList.add(new Student(firstNameArray[i], secondNameArray[i], ageArray[i]));
        }
    }

    private static void createCatalog(Map<String, Integer> catalogMap) {
        String[] catalogNameArray = {"Electronics", "Beauty", "Sport", "Computers and Nets", "Household Appliances", "Construction and Repair", "Work and Office"};
        int a = 1000;
        int b = 1000;
        int len = catalogNameArray.length;
        int[] quantityGoodsArray = new int[len];
        for (int i = 0; i < len - 1; i++) {
            quantityGoodsArray[i] = a + (int) (Math.random() * b);
        }
        for (int i = 0; i < len; i++) {
            catalogMap.put(catalogNameArray[i], quantityGoodsArray[i]);
        }
    }

    private static void sortCatalog(Map<String, Integer> catalogMap) {
        Map<String, Integer> catalogMapTree = new TreeMap<>(catalogMap);
        SortedSet<Map.Entry<String, Integer>> sortedSet = new TreeSet<>(
                (e1, e2) -> {
                    if (e1.getValue() < e2.getValue()) {
                        return -1;
                    } else if ((int) e1.getValue() == e2.getValue()) {
                        return e1.getKey().compareTo(e2.getKey());
                    } else {
                        return 1;
                    }
                });

        sortedSet.addAll(catalogMapTree.entrySet());
        System.out.println(sortedSet);
    }

    private static void deleteEmptyCatalogs(Map<String, Integer> catalogMap) {

        catalogMap.values().removeIf(o -> (int) o == 0);
        System.out.println(catalogMap);
    }


    private static void findCatalogWithMaxValue(Map<String, Integer> catalogMap) {
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
    }

}


