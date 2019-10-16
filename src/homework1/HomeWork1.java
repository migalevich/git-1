package homework1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("------- Task 1 -------");
        System.out.println("My wight on the moon: " + myWeightOnMoon() + " Н"); // Task 1
        System.out.println("------- Task 2 -------");
        System.out.println("Massive {10, 20, 30, 40, 50, 60} increased 10%: " + java.util.Arrays.toString(increaseMassive())); // Task 2
        System.out.println("------- Task 3 -------");
        System.out.println("Is palindrome 56765? " + isPalindrome(56765)); // Task 3
        System.out.println("------- Task 4 -------");
        evenNumbers(); // Task 4
        System.out.println("------- Task 5 -------");
        oddNumbers(); // Task 5
        System.out.println("------- Task 6 -------");
        evenNumbersFor(); // Task 6
        System.out.println("------- Task 7 -------");
        System.out.println("Sum of numbers from 20 to 200: " + sumOfNumbers()); // Task 7
        System.out.println("------- Task 8 -------");
        namesOfMonths();  // Task 8
        System.out.println("------- Task 9 -------");
        reversParametrs(); // Task 9
        System.out.println("------- Task 10 -------");
        sumTwoNumbers(); // Task 10
        System.out.println("------- Task 11 -------");
        maxNumber(); // Task 11
        System.out.println("------- Task 12 -------");
        trueFalse(); // Task 12
        System.out.println("------- Task 13 -------");
        strConcat(); // Task 13
        System.out.println("------- Task 14 -------");
        solveTwoNumbers(); // Task 14
        System.out.println("------- Task 15 -------");
        getNumbersFor(); // Task 15 (for)
        getNumbersWhile(); // Task 15 (do while)
        System.out.println("------- Task 16 -------");
        System.out.println(rowNumbersWithStep()); // Task 16
        System.out.println("------- Task 17 -------");
        System.out.println(java.util.Arrays.toString(divisionMassive())); // Task 17
        System.out.println("------- Task 18 -------");
        getDollars(); // Task 18
        System.out.println("------- Task Advanced 2 -------");
        System.out.println(howMuchHoursMinSecInDay()); // Task Advanced 2

    }

    /* 1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.*/
    private static double myWeightOnMoon() {
        double gEarth = 9.807;
        double gMoon = gEarth * 16 / 100;
        int myWeight = 52;
        return myWeight * gMoon;
    }

    /* 2. Напишите метод, который будет увеличивать каждый элемент массива на 10%. */
    private static int[] increaseMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int[] res = null;
        if (a != null) {
            res = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                res[i] = a[i] + a[i] * 10 / 100;
                // System.out.println("res_i="+res[i]);
            }
        }
        // System.out.println("res="+java.util.Arrays.toString(res));
        return res;
    }

    /* 3. Напишите метод, который будет проверять является ли число палиндромом (одинаково читающееся в обоих направлениях). */
    private static boolean isPalindrome(int integer) {
        int a = integer;
        int reverse = 0;
        // revers
        while (a != 0) {
            int remainder = a % 10;
            //   System.out.println("remainder="+remainder);
            reverse = reverse * 10 + remainder;
            //   System.out.println("reverse="+reverse);
            a = a / 10;
            //  System.out.println("a="+a);
        }
        return integer == reverse;
    }

    /* 4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления) */
    private static void evenNumbers() {
        System.out.println("Even numbers from 1 to 100: ");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /* 5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления) */
    private static void oddNumbers() {
        System.out.println("Odd numbers from 1 to 15: ");
        for (int i = 1; i < 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /* 6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for) */
    private static void evenNumbersFor() {
        System.out.println("Even numbers from 1 to 100 (used only for): ");
        for (int i = 2; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    /* 7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for) */
    private static int sumOfNumbers() {
        int sum = 0;
        for (int i = 20; i < 200; i++) {
            sum += i;
        }
        return sum;
    }

    /* 8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else) */
    private static void namesOfMonths() {
        for (int i = 1; i <= 12; i++) {
            if (i == 1) System.out.println(i + " January");
            else if (i == 2) System.out.println(i + " February");
            else if (i == 3) System.out.println(i + " March");
            else if (i == 4) System.out.println(i + " April");
            else if (i == 5) System.out.println(i + " May");
            else if (i == 6) System.out.println(i + " June");
            else if (i == 7) System.out.println(i + " July");
            else if (i == 8) System.out.println(i + " August");
            else if (i == 9) System.out.println(i + " September");
            else if (i == 10) System.out.println(i + " October");
            else if (i == 11) System.out.println(i + " November");
            else System.out.println(i + " December");
        }
    }

    /*9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.*/
    private static void reversParametrs() {
        int a = 5;
        int b = 6;
        System.out.println("Переменные до реверса:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temp = b;
        b = a;
        a = temp;
        System.out.println("Переменные после реверса:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    /* 10. Напишите программу с тремя переменными целого типа, первым двум присвойте значения, а третьей переменной присвойте их сумму. Выведете значение третей переменной на экран. */
    private static void sumTwoNumbers() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    /* 11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее. */
    private static void maxNumber() {
        int a = 5;
        int b = 6;
        int c = 11;
        int max;
        if (a > b && a > c) {
            max = a;
        } else {
            if (b > a && b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        System.out.println("max from: " + a + ", " + b + ", " + c + " = " + max);
    }

    /* 12. Напишите программу, в которой используются две переменные логического типа (boolean), присвойте им значения и выведете для каждой переменной на экран строку "истина",
     если переменная имеет значение true и "ложь", если переменная имеет значение false. */
    private static void trueFalse() {
        boolean a = true;
        boolean b = false;
        if (a) {
            System.out.println("a (" + a + ") = истина");
        } else {
            System.out.println("a (" + a + ")= ложь");
        }
        if (b) {
            System.out.println("b (" + b + ") = истина");
        } else {
            System.out.println("b (" + b + ") = ложь");
        }
    }

    /* 13. Напишите программу, где двум строковым переменным присваиваются значения, третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
    Затем напечатайте значение третьей строковой переменной. */
    private static void strConcat() {
        String a = "Hello, ";
        String b = "World!!!";
        String c = a + b;
        System.out.println(c);
    }

    /*14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8.
    В конце программы выведите значения обоих чисел на экран.*/
    private static void solveTwoNumbers() {
        int a = 5;
        int b = 6;
        if (a > b) {
            a += 3;
        } else {
            b += 8;
        }
        System.out.println("a = " + a + "; b = " + b);
    }

    /* 15. Выведете на экран все числа от 1 до 100 с помощью цикла (можно все три варианта в одной программе):
    for
    while
    do while
    */
    private static void getNumbersFor() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }

    private static void getNumbersWhile() {
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
    }

    private static void getNumbersDoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 100);
    }

    /* 16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
    Минимум, максимум и шаг указываются пользователем (можно захардкодить). */

    private static String rowNumbersWithStep() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minimum number: ");
        int min = scan.nextInt();
        System.out.println("Enter the maximum number: ");
        int max = scan.nextInt();
        System.out.println("Enter the step: ");
        int step = scan.nextInt();
        String res = "";
        for (int i = min; i <= max; i += step) {
            res += i + " ";
        }
        return "Result: " + res;
    }

    /* 17. Все элементы массива поделить на значение наибольшего элемента этого массива. */
    private static int[] divisionMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int max = a[0];
        int[] res = null;
        for (int value : a) {
            if (max < value) {
                max = value;
            }
        }
        res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] += a[i] / max;
        }
        return res;
    }

    /* 18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс. */
    private static void getDollars() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rubles: ");
        int rubles = scan.nextInt();
        double rate = 2.10;
        double res = Math.round(rubles / rate);
        System.out.println("It is " + res + " dollars");
    }

    /* -----------------------------------------------------------------------------------------------------------------*/
    /* Advanced 2.	Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.*/
    private static String howMuchHoursMinSecInDay() {
        int defHours = 24;
        int defMins = 60;
        int defSecs = 60;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the numbers of days: ");
        int days = scan.nextInt();
        int hours = defHours * days;
        int minutes = defHours * days * defMins;
        int seconds = defHours * days * defMins * defSecs;
        return "In " + days + " days: " + hours + " hours, " + minutes + " minutes, " + seconds + " secs";
    }
}


