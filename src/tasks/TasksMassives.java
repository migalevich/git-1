package tasks;
// много заданий по инициализации массивов на тесте

import com.sun.deploy.security.SelectableSecurityManager;

public class TasksMassives {
    public static void main(String[] args) {
        sortMassive();
//        System.out.println(sumMassive());
//        System.out.println(avgMassive());
    }

    //Task 1. Write a Java program to sort a numeric array and a string array.

    private static void sortMassive() {
        int[] numericArray = {20, 40, 30, 10, 70, 60};
        int[] sortArray = new int[numericArray.length];
        int min = numericArray[0];
        for (int j = 0; j < numericArray.length; j++) {
            min = numericArray[j];
            System.out.println("min1 = " + min);
            for (int i = 0; i < numericArray.length; i++) {
                System.out.println("numericArray[i] = " + numericArray[i]);
                if (min > numericArray[i]) {
                    System.out.println("<<<<<<<<<<<<<<<< IF >>>>>>>>>>>>>>>>>>");
                    System.out.println("numericArray[i] = " + numericArray[i]);
                    min = numericArray[i];
                    System.out.println("min2 = " + min);
                    numericArray[i] = 1000;
                }
                }
            sortArray[j] = min;
            System.out.println("sortArray = " + java.util.Arrays.toString(sortArray));
            System.out.println("numericArray = " + java.util.Arrays.toString(numericArray));
        }
//       for (int s : numericArray) {
//           System.out.println(s);
//       }
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

}


//Task 5.  Write a Java program to test if an array contains a specific value.
//Task 6.  Write a Java program to find the index of an array element.
//Task 7.  Write a Java program to remove a specific element from an array.
//Task 8.  Write a Java program to copy an array by iterating the array.
//Task 9.  Write a Java program to insert an element (specific position) into an array.
//Task 10. Write a Java program to find the maximum and minimum value of an array.
//Task 11. Write a Java program to reverse an array of integer values.
//Task 12. Write a Java program to find the duplicate values of an array of integer values.
//Task 13. Write a Java program to find the duplicate values of an array of string values.

//Task 14. Write a Java program to find the common elements between two arrays (string values).

//Task 15. Write a Java program to find the common elements between two arrays of integers.

//Task 16. Write a Java program to remove duplicate elements from an array.

//Task 17. Write a Java program to find the second largest element in an array.

//Task 18. Write a Java program to find the second smallest element in an array.

//Task 19. Write a Java program to add two matrices of the same size.

//Task 20. Write a Java program to convert an array to ArrayList.