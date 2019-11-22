package homeworkStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {

        Collection<Person> listPersons = new ArrayList<>();

        listPersons.add(new Person("Anna", 28));
        listPersons.add(new Person("Alex", 33));
        listPersons.add(new Person("Irina", 15));
        listPersons.add(new Person("Olga", 20));
        listPersons.add(new Person("Mark", 11));

        /* Task 1 */
        System.out.println("List of persons whose age is greater than 20:");
        Stream<Person> streamFromCollection = listPersons.stream();
        streamFromCollection.filter(person -> person.getAge() > 20).forEach(System.out::println);

        /* Task 2 */
        System.out.println("List of persons whose name begins with a vowel:");

        String letters = "AEUIOY";
        List<Character> charList = new ArrayList<Character>();

        for (char c : letters.toCharArray()) {
            charList.add(c);
        }

        listPersons.stream().filter(person -> charList.toString().contains(person.getName().substring(0, 1))).forEach(System.out::println);

        /* Task 3 */

        double averAge = listPersons.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("List of persons whose age is greater than the average age (" + averAge + ") of all people:");

        listPersons.stream().filter(person -> person.getAge() > averAge).distinct().forEach(System.out::println);

    }
}
