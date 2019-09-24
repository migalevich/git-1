package homework1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        //  System.out.println("Мой вес на луне равен: " + myWeightOnMoon() + " Н"); // Задача1
        //  System.out.println("Массив {10, 20, 30, 40, 50, 60} увеличенный на 10%: " + java.util.Arrays.toString(increaseMassive())); // Задача2
        //  System.out.println("Палиндром? " + isPalindrome(56765)); // Задача3
        System.out.println("Четные числа от 1 до 100: "); // Задача4
        evenNumbers(); // Задача4
        System.out.println("Нечетные числа от 1 до 15: "); // Задача5
        oddNumbers(); // Задача5
        System.out.println("Четные числа от 1 до 100 (используя только цикл for): "); // Задача6
        evenNumbersFor(); // Задача6
        System.out.println("Сумма чисел от 20 до 200: " + sumOfNumbers()); // Задача7


        // System.out.println(howMuchHoursMinSecInDay()); // Advanced 2

    }

    /* 1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.*/
    public static double myWeightOnMoon() {
        double g_earth = 9.807;
        double g_moon = g_earth * 17 / 100;
        // System.out.println("g_moon="+g_moon);
        int my_weight = 52;
        double F_earth, F_moon;
        F_earth = my_weight * g_earth;
        // System.out.println("F_earth="+F_earth);
        F_moon = my_weight * g_moon;
        // System.out.println("F_moon="+F_moon);
        return F_moon;
    }

    /* 2. Напишите метод, который будет увеличивать каждый элемент массива на 10%. */
    public static int[] increaseMassive() {
        int a[] = {10, 20, 30, 40, 50, 60};
        int res[] = null;
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
    public static boolean isPalindrome(int integer) {
        int a = integer; // изначальное число запоминаем
        int reverse = 0;
        // переворачиваем число
        while (a != 0) {
            int remainder = a % 10;
            //   System.out.println("remainder="+remainder);
            reverse = reverse * 10 + remainder; // умножаем на 10 и добавляем остаток
            //   System.out.println("reverse="+reverse);
            a = a / 10;
            //  System.out.println("a="+a);
        }
        return integer == reverse;
    }

    /* 4. Вывести на экран все четные цифры от 1 до 100 (используйте остаток от деления) */
    public static void evenNumbers() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /* 5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления) */
    public static void oddNumbers() {
        for (int i = 1; i < 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /* 6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for) */
    public static void evenNumbersFor() {
        for (int i = 2; i < 100; i += 2) {
            System.out.println(i);
        }
    }

    /* 7. Посчитать сумму цифр от 20 до 200 и результат вывести на экран (используя цикл for) */
    public static int sumOfNumbers() {
        int sum = 0;
        for (int i = 20; i < 200; i++) {
            sum += i;
        }
        return sum;
    }


    /* -----------------------------------------------------------------------------------------------------------------*/
    /* Advanced 2.	Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.*/
    public static String howMuchHoursMinSecInDay() {
        int DEFAULT_HOURS_VALUE = 24;
        int DEFAULT_MINETS_VALUE = 60;
        int DEFAULT_SECONDS_VALUE = 60;
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int hours = DEFAULT_HOURS_VALUE * days;
        int minets = DEFAULT_HOURS_VALUE * days * DEFAULT_MINETS_VALUE;
        int seconds = DEFAULT_HOURS_VALUE * days * DEFAULT_MINETS_VALUE * DEFAULT_SECONDS_VALUE;
        String res = "В " + days + " д.: " + hours + " ч., " + minets + " мин., " + seconds + " сек.";
        return res;
    }
}


