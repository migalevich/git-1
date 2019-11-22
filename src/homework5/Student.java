package homework5;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String firstName;
    private String secondName;
    private int age;

    public Student(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(firstName, student.firstName) &&
                Objects.equals(secondName, student.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        int result;
        result = firstName.compareTo(o.firstName);
        if (result != 0) return result;
        result = secondName.compareTo(o.secondName);
        if (result != 0) return result;
        result = (age == o.age ? 1 : 0);
        if (result != 0) return result;
        return result;
    }

}
