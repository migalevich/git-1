package homeworkStream;



import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {
         /*   Сгенерировать несколько объектов данного класса, вывести список человек 1) в возрасте старше 20 лет;
        2) посчитать средний возраст всех людей с именми, начинающимися на гласную букву
        3) отфильтровать и вывести уникальные объекты в взрасте превышающий средний возраст всех людей */

        Person person1 = new Person("Anna", 28);
        Person person2 = new Person("Alex", 33);
        Person person3 = new Person("Irina", 15);
        Person person4 = new Person("Olga", 20);
        Person person5 = new Person("Egor", 11);

        Collection<Person> listPersons = new ArrayList<>();

        listPersons.add(person1);
        listPersons.add(person2);
        listPersons.add(person3);
        listPersons.add(person4);
        listPersons.add(person5);

        /* Task 1 (вывести список человек в возрасте старше 20 лет) */
        Stream<Person> streamFromCollection = listPersons.stream();
        streamFromCollection.filter(person -> person.getAge() > 20).forEach(System.out::println);

        /* Task 2 (посчитать средний возраст всех людей с именми, начинающимися на гласную букву)*/
        String letters = "AEUIOY";
        List<Character> charList = new ArrayList<Character>();

        for (char c : letters.toCharArray()) {
            charList.add(c);
        }

        listPersons.stream().filter(person -> charList.toString().contains(person.getName().substring(0,1))).forEach(System.out::println);

        /* Task 3 (отфильтровать и вывести уникальные объекты в взрасте превышающий средний возраст всех людей)*/
        double averAge = listPersons.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("averAge = " + averAge);

        listPersons.stream().filter(person -> person.getAge() > averAge ).distinct().forEach(System.out::println);

    }
}
