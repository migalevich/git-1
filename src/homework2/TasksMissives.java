package homework2;

import java.util.*;

public class TasksMissives {
    public static void main(String[] args) {
        System.out.println("------- Task 1 -------");
        sortMassive(); // Task 1
        mySortMassive(); // Task 1
        bubbleSort(); // Task 1
        System.out.println("------- Task 2 -------");
        System.out.println(sumMassive()); // Task 2
        System.out.println("------- Task 4 -------");
        System.out.println(avgMassive()); // Task 4
        System.out.println("------- Task 5 -------");
        searchSpecificValue(); // Task 5
        System.out.println("------- Task 6 -------");
        searchIndex(); // Task 6
        System.out.println("------- Task 7 -------");
        delElement(); // Task 7
        System.out.println("------- Task 8 -------");
        copyMassive(); // Task 8
        System.out.println("------- Task 9 -------");
        insElement(); // Task 9
        System.out.println("------- Task 10 -------");
        minMaxElement(); // Task 10
        System.out.println("------- Task 11 -------");
        reverseMassive(); // Task 11
        System.out.println("------- Task 12 -------");
        findDuplicateInt(); // Task 12
        System.out.println("------- Task 13 -------");
        findDuplicateString(); // Task 13
        System.out.println("------- Task 14 -------");
        findDuplicateBetweenTwoArraysString(); // Task 14
        System.out.println("------- Task 15 -------");
        findDuplicateBetweenTwoArraysInt(); // Task 15
        System.out.println("------- Task 16 -------");
        delArrayDuplicate(); // Task 16
        System.out.println("------- Task 17 -------");
        secondMaxElement(); // Task 17
        System.out.println("------- Task 18 -------");
        secondMinElement(); // Task 18
        System.out.println("------- Task 19 -------");
        doTwoMatrices(); // Task 19
        System.out.println("------- Task 20 -------");
        arrayList(); // Task 20
    }

    //Task 1. Write a Java program to sort a numeric array and a string array.
    /* my own algorithm */
    private static void mySortMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 60};
        System.out.println("Array before sorting = " + Arrays.toString(numericArray));
        for (int j = 0; j < numericArray.length; j++) {
            int min = numericArray[j];
            int minIndex = j;
            for (int i = j + 1; i < numericArray.length; i++) {
                if (min > numericArray[i]) {
                    min = numericArray[i];
                    minIndex = i;
                }
            }
            numericArray[minIndex] = numericArray[j];
            numericArray[j] = min;
        }
        System.out.println("Array after sorting = " + Arrays.toString(numericArray));
    }

    /* bubble sort */
    private static void bubbleSort() {
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
        System.out.println("Array after sorting bubble sort = " + Arrays.toString(numericArray));
    }

    /* using sort method class Arrays */
    private static void sortMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 60};
        String[] stringArray = {"as", "ff", "gh", "hy", "gi", "ar"};
        System.out.println("numericArray before sorting = " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("numericArray after sorting = " + Arrays.toString(numericArray));
        System.out.println("stringArray before sorting = " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("stringArray after sorting = " + Arrays.toString(stringArray));
    }


    //Task 2. Write a Java program to sum values of an array.
    private static int sumMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum;
    }

    //Task 4.  Write a Java program to calculate the average value of array elements.
    private static int avgMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int sum = 0;
        for (int value : a) {
            sum += value;
        }
        return sum / a.length;
    }

    //Task 5.  Write a Java program to test if an array contains a specific value.
    private static void searchSpecificValue() {
        int[] a = {10, 20, 30, 40, 50, 60, 34, 5};
        boolean temp = false;
        for (int value : a) {
            if (value == 50) {
                temp = true;
                break;
            }
        }
        if (temp) {
            System.out.println("Array contains the number 50");
        } else {
            System.out.println("Array does not contain the number 50");
        }
    }

    //Task 6.  Write a Java program to find the index of an array element.
    private static void searchIndex() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 60};
        int index = -1;
        for (int i = 0; i < numericArray.length; i++) {
            if (numericArray[i] == 50) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("Index = " + index);
        } else {
            System.out.println("Array does not contain the number 50");
        }
    }

    //Task 7.  Write a Java program to remove a specific element from an array.
    private static void delElement() {
        String[] stringArray = {"aa", "b", "g", "ff", "er", "n", "t"};
        System.out.println("Array before deleting element er = " + Arrays.toString(stringArray));
        int index = -1;
        String[] stringArrayDel = new String[stringArray.length - 1];
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals("er")) {
                stringArray[i] = null;
                index = i;
            }
        }
        if (index != -1) {
            for (int i = 0; i < stringArrayDel.length; i++) {
                if (i < index) {
                    stringArrayDel[i] = stringArray[i];
                }
                if (i >= index) {
                    stringArrayDel[i] = stringArray[i + 1];
                }
            }
        }
        System.out.println("Array after deleting element er = " + Arrays.toString(stringArrayDel));
    }


    //Task 8.  Write a Java program to copy an array by iterating the array.
    private static void copyMassive() {
        String[] stringArray = {"aa", "b", "g", "ff", "er", "n", "t"};
        String[] stringArrayCopy = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            stringArrayCopy[i] = stringArray[i];
        }
        System.out.println("stringArrayCopy=" + Arrays.toString(stringArrayCopy));
    }

    //Task 9.  Write a Java program to insert an element (specific position) into an array.
    private static void insElement() {
        String[] stringArray = {"aa", "b", "g", "ff", "er", "n", "t"};
        int position = 5;
        String[] stringArrayIns = new String[stringArray.length + 1];
        for (int i = 0; i < stringArrayIns.length; i++) {
            if (i < position) {
                stringArrayIns[i] = stringArray[i];
            }
            if (i == position) {
                stringArrayIns[i] = "ins";
            }
            if (i > position) {
                stringArrayIns[i] = stringArray[i - 1];
            }
        }
        System.out.println("Array before inserting element ins on " + (position+1) + " position = " + Arrays.toString(stringArray));
        System.out.println("Array after inserting element ins on "+ (position+1) +" position = " + Arrays.toString(stringArrayIns));
    }

    //Task 10. Write a Java program to find the maximum and minimum value of an array.
    private static void minMaxElement() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 60};
        int min = numericArray[0];
        int max = numericArray[0];
        for (int value : numericArray) {
            if (min > value) {
                min = value;
            }
            if (max < value) {
                max = value;
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }

    //Task 11. Write a Java program to reverse an array of integer values.
    private static void reverseMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 60, 54};
        System.out.println("Before revers = " + Arrays.toString(numericArray));
        for (int i = 0; i < numericArray.length / 2; i++) {
            int temp = numericArray[numericArray.length - i - 1];
            numericArray[numericArray.length - i - 1] = numericArray[i];
            numericArray[i] = temp;
        }
        System.out.println("After revers = " + Arrays.toString(numericArray));
    }

    //Task 12. Write a Java program to find the duplicate values of an array of integer values.
    private static void findDuplicateInt() {
        int[] numericArray = {20, 40, 40, 30, 50, 10, 70, 50, 60, 54};
        for (int i = 0; i < numericArray.length; i++) {
            for (int j = 0; j < numericArray.length; j++) {
                if (numericArray[i] == numericArray[j] && i != j) {
                    System.out.println("Duplicate = " + numericArray[i]);
                }
            }
        }
    }

    //Task 13. Write a Java program to find the duplicate values of an array of string values.
    private static void findDuplicateString() {
        String[] stringArray = {"d", "t", "y", "e", "d", "h", "t", "a", "j", "x"};
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray.length; j++) {
                if ((stringArray[i].equals(stringArray[j])) && (i != j)) {
                    System.out.println("Duplicate = " + stringArray[i]);
                }
            }
        }
    }

    //Task 14. Write a Java program to find the common elements between two arrays (string values).
    private static void findDuplicateBetweenTwoArraysString() {
        String[] stringArray1 = {"d", "t", "y", "e", "d", "h", "t", "a", "j", "x"};
        String[] stringArray2 = {"j", "k", "l", "r", "s", "m", "z", "q", "l", "y"};
        for (String value : stringArray1) {
            for (String s : stringArray2) {
                if ((value.equals(s))) {
                    System.out.println("Duplicate = " + value);
                }
            }
        }
    }

    //Task 15. Write a Java program to find the common elements between two arrays of integers.
    private static void findDuplicateBetweenTwoArraysInt() {
        int[] stringArray1 = {1, 5, 6, 88, 100, 56, 2, 5, 10, 33};
        int[] stringArray2 = {17, 77, 7, 99, 2, 33, 1, 10};
        for (int value : stringArray1) {
            for (int i : stringArray2) {
                if ((value == i)) {
                    System.out.println("Duplicate = " + value);
                }
            }
        }
    }

    //Task 16. Write a Java program to remove duplicate elements from an array.
    private static void delArrayDuplicate() {
        String[] stringArray = {"aa", "b", "g", "ff", "aa", "n", "t", "b"};
        int len = stringArray.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (stringArray[i].equals(stringArray[j])) {
                    stringArray[j] = stringArray[len - 1];
                    len--;
                    j--;
                }
            }
        }
        System.out.println("len without dubls = " + len);
        System.out.println("Array after deleting duplicates = " + Arrays.toString(Arrays.copyOf(stringArray, len)));
    }

    //Task 17. Write a Java program to find the second largest element in an array.
    private static void secondMaxElement() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 11, 60};
        int min = numericArray[0];
        int max = numericArray[0];
        for (int value : numericArray) {
            if (min > value) {
                min = value;
            }
        }
        for (int i = 0; i < numericArray.length; i++) {
            if (max < numericArray[i]) {
                max = numericArray[i];
                numericArray[i] = min;
            }
        }
        System.out.println("First max value = " + max);
        max = numericArray[0];
        for (int value : numericArray) {
            if (max < value) {
                max = value;
            }
        }
        System.out.println("Second max value = " + max);
    }

    //Task 18. Write a Java program to find the second smallest element in an array.
    private static void secondMinElement() {
        int[] numericArray = {20, 40, 30, 10, 70, 50, 11, 60};
        int min = numericArray[0];
        int max = numericArray[0];
        for (int value : numericArray) {
            if (max < value) {
                max = value;
            }
        }
        for (int i = 0; i < numericArray.length; i++) {
            if (min > numericArray[i]) {
                min = numericArray[i];
                numericArray[i] = max;
            }
        }
        System.out.println("First min value = " + min);
        min = numericArray[0];
        for (int value : numericArray) {
            if (min > value) {
                min = value;
            }
        }
        System.out.println("Second min value = " + min);
    }

    //Task 19. Write a Java program to add two matrices of the same size.
    private static <matrix> void doTwoMatrices() {
        int[][] matrix = new int[3][2];
        int b = 10;
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * b);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int[][] matrixClone = (int[][]) matrix.clone();
        System.out.println("Clone matrix: ");
        for (int[] ints : matrixClone) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }


    //Task 20. Write a Java program to convert an array to ArrayList.
    private static void arrayList() {
        String[] array = {"a", "b", "c", "d", "e"};

        //Method 1
        List<String> list = Arrays.asList(array);
        System.out.println(list);

        //Method 2
        List<String> list1 = new ArrayList<String>();
        Collections.addAll(list1, array);
        System.out.println(list1);

        //Method 3
        List<String> list2 = new ArrayList<String>();
        for (String text : array) {
            list2.add(text);
        }
        System.out.println(list2);

    }

}

