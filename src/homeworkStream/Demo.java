package homeworkStream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;


public class Demo {
    public static void main(String[] args) {

        Collection<Person> listPersons = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listPersons.add(createPerson(i));
        }

        /* Task 1 */
        personsUnder20(listPersons);

        /* Task 2 */
        namesBeginVowel(listPersons);

        /* Task 3 */
        ageGreaterAverageAge(listPersons);
    }

    private static Person createPerson(int i) {

        int[] ageArray = {28, 33, 15, 20, 11, 45, 22};
        String[] nameArray = {"Alex", "Irina", "Anna", "Ivan", "Mark", "Pavel", "Kate"};

        return new Person(nameArray[i], ageArray[i]);
    }

    private static void personsUnder20(Collection<Person> listPersons) {
        System.out.println("List of persons whose age is greater than 20:");
        Stream<Person> streamFromCollection = listPersons.stream();
        streamFromCollection.filter(person -> person.getAge() > 20).forEach(System.out::println);
    }

    private static void namesBeginVowel(Collection<Person> listPersons) {
        System.out.println("List of persons whose name begins with a vowel:");

        String letters = "AEUIOY";
        List<Character> charList = new ArrayList<>();

        for (char c : letters.toCharArray()) {
            charList.add(c);
        }

        listPersons.stream().filter(person -> charList.toString().contains(person.getName().substring(0, 1))).forEach(System.out::println);
    }

    private static void ageGreaterAverageAge(Collection<Person> listPersons) {
        double averAge = listPersons.stream().mapToInt(Person::getAge).average().getAsDouble();
        System.out.println("List of persons whose age is greater than the average age (" + averAge + "):");

        listPersons.stream().filter(person -> person.getAge() > averAge).distinct().forEach(System.out::println);
    }

}
