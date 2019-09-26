package tasks;
// много заданий по инициализации массивов на тесте

import java.util.*;

public class TasksMissives {
    public static void main(String[] args) {
        sortMassive(); // Task 1
//        mySortMassive(); // Task 1
//        bubbleSort(); // Task 1
//        System.out.println(sumMassive()); // Task 2
//        System.out.println(avgMassive()); // Task 4
//        searchSpecificValue(); // Task 5
//        searchIndex(); // Task 6
//        delElement(); // Task 7
//        copyMassive(); // Task 8
//        insElement(); // Task 9
//        minmaxElement(); // Task 10
//        reverseMassive(); // Task 11
//        findDublicateInt(); // Task 12
        findDublicateString(); // Task 13
    }

    //Task 1. Write a Java program to sort a numeric array and a string array.
    public static void mySortMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 60};
        System.out.println("Массив до сортировки = " + Arrays.toString(numericArray));
        for (int j = 0; j < numericArray.length; j++) {
            int min = numericArray[j];
            int min_i = j;
            for (int i = j + 1; i < numericArray.length; i++) {
                if (min > numericArray[i]) {
                    min = numericArray[i];
                    min_i = i;
                }
            }
            numericArray[min_i] = numericArray[j];
            numericArray[j] = min;
        }
        System.out.println("Массив после сортировки = " + Arrays.toString(numericArray));
    }


    public static void bubbleSort() {
        int[] numericArray = {20, 40, 30, 10, 70, 60};
        for (int i = numericArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numericArray[j] > numericArray[j + 1]) {
                    int tmp = numericArray[j];
                    numericArray[j] = numericArray[j + 1];
                    numericArray[j + 1] = tmp;
                }
            }
        }
        System.out.println("Массив после сортировки = " + Arrays.toString(numericArray));
    }


    private static void sortMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 60};
        String[] stringArray = {"as", "ff", "gh", "hy", "gi", "ar"};
        System.out.println("numericArray до сортировки = " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("numericArray после сортировки = " + Arrays.toString(numericArray));
        System.out.println("stringArray до сортировки = " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("stringArray после сортировки = " + Arrays.toString(stringArray));
    }


    //Task 2. Write a Java program to sum values of an array.
    public static int sumMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }

    //Task 4.  Write a Java program to calculate the average value of array elements.
    public static int avgMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

    //Task 5.  Write a Java program to test if an array contains a specific value.
    public static void searchSpecificValue() {
        int[] a = {10, 20, 30, 40, 50, 60, 34, 5};
        boolean temp = false;
        for (int value : a) {
            if (value == 50) {
                temp = true;
            }
        }
        if (temp == true) {
            System.out.println("Массив содержит значение 50");
        } else {
            System.out.println("Массив не содержит значение 50");
        }
        ;
    }

    //Task 6.  Write a Java program to find the index of an array element.
    public static void searchIndex() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 60};
        int index = -1;
        for (int i = 0; i < numericArray.length; i++) {
            if (numericArray[i] == 50) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Индекс = " + index);
        } else {
            System.out.println("Массив не содержит значение 50");
        }
    }

    //Task 7.  Write a Java program to remove a specific element from an array.
    public static void delElement() {
        String[] stringArray = {"aa", "b", "g", "ff", "er", "n", "t"};
        System.out.println("Массив до удаления эллемента er = " + Arrays.toString(stringArray));
        int index = -1;
        String[] stringArraydel = new String[stringArray.length - 1];
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i] == "er") {
                stringArray[i] = null;
                index = i;
            }
        }
        if (index != -1) {
            for (int i = 0; i < stringArraydel.length; i++) {
                if (i < index) {
                    stringArraydel[i] = stringArray[i];
                }
                if (i >= index) {
                    stringArraydel[i] = stringArray[i + 1];
                }
            }
        }
        System.out.println("Массив после удаления эллемента er = " + Arrays.toString(stringArraydel));
    }



    //Task 8.  Write a Java program to copy an array by iterating the array.
    public static void copyMassive() {
        String[] stringArray = {"aa", "b", "g", "ff", "er", "n", "t"};
        String[] stringArraycopy = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArraycopy[i] = stringArray[i];
        }
        System.out.println("stringArraycopy=" + Arrays.toString(stringArraycopy));
    }

    //Task 9.  Write a Java program to insert an element (specific position) into an array.
    public static void insElement() {
        String[] stringArray = {"aa", "b", "g", "ff", "er", "n", "t"};
        int position = 5;
        String[] stringArrayins = new String[stringArray.length + 1];
        for (int i = 0; i < stringArrayins.length; i++) {
            if (i < position) {
                stringArrayins[i] = stringArray[i];
            }
            if (i == position) {
                stringArrayins[i] = "ins";
            }
            if (i > position) {
                stringArrayins[i] = stringArray[i - 1];
            }
        }
        System.out.println("Массив до вставки эллемента ins на 5-ю позицию = " + Arrays.toString(stringArray));
        System.out.println("Массив после вставки эллемента ins на 5-ю позицию = " + Arrays.toString(stringArrayins));
    }

    //Task 10. Write a Java program to find the maximum and minimum value of an array.
    public static void minmaxElement() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 60};
        int min = numericArray[0];
        int max = numericArray[0];
        for (int i = 0; i < numericArray.length; i++) {
            if (min > numericArray[i]) {
                min = numericArray[i];
            }
            if (max < numericArray[i]) {
                max = numericArray[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    //Task 11. Write a Java program to reverse an array of integer values.
    public static void reverseMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 60, 54};
        System.out.println("Befor revers = " + Arrays.toString(numericArray));
        for (int i = 0; i < numericArray.length / 2; i++) {
            int temp = numericArray[numericArray.length - i - 1];
            numericArray[numericArray.length - i - 1] = numericArray[i];
            numericArray[i] = temp;
        }
        System.out.println("After revers = " + Arrays.toString(numericArray));
    }

    //Task 12. Write a Java program to find the duplicate values of an array of integer values.
    public static void findDublicateInt() {
        int[] numericArray = {20, 40, 40, 30, 50, 10, 70, 50, 60, 54};
        for (int i = 0; i < numericArray.length; i++) {
            for (int j = 0; j < numericArray.length; j++) {
                if (numericArray[i] == numericArray[j] && i != j) {
                    System.out.println("Дубликат = " + numericArray[i]);
                }
            }
        }
    }

    //Task 13. Write a Java program to find the duplicate values of an array of string values.
    public static void findDublicateString() {
        String[] stringArray = {"d", "t", "y", "e", "d", "h", "t", "a", "j", "x"};
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                if( (stringArray[i].equals(stringArray[j])) && (i != j) ) {
                //if (stringArray[i] == stringArray[j] && i != j) {
                    System.out.println("Дубликат = " + stringArray[i]);
                }
            }
        }
    }

} // main end


//Task 14. Write a Java program to find the common elements between two arrays (string values).

//Task 15. Write a Java program to find the common elements between two arrays of integers.

//Task 16. Write a Java program to remove duplicate elements from an array.

//Task 17. Write a Java program to find the second largest element in an array.

//Task 18. Write a Java program to find the second smallest element in an array.

//Task 19. Write a Java program to add two matrices of the same size.

//Task 20. Write a Java program to convert an array to ArrayList.