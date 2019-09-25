package homework1;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Мой вес на луне равен: " + myWeightOnMoon() + " Н"); // Задача1
        System.out.println("Массив {10, 20, 30, 40, 50, 60} увеличенный на 10%: " + java.util.Arrays.toString(increaseMassive())); // Задача2
        System.out.println("Палиндром? " + isPalindrome(56765)); // Задача3
        evenNumbers(); // Задача4
        oddNumbers(); // Задача5
        evenNumbersFor(); // Задача6
        System.out.println("Сумма чисел от 20 до 200: " + sumOfNumbers()); // Задача7
        namesOfMounth();  // Задача8
        reversParametrs(); // Задача 9
        sumTwoNumbers(); // Задача 10
        maxNumber(); // Задача 11
        truefalse(); // Задача 12
        strConcat(); // Задача 13
        solveTwoNumbers(); // Задача 14
        getNumbersFor(); // Задача 15 (вариант for)
        getNumbersWhile(); // Задача 15 (вариант while)
        getNumbersDoWhile(); // Задача 15 (вариант do while)
        System.out.println(rowNumbersWithStep()); // Задача 16
        System.out.println(java.util.Arrays.toString(divisionMassive())); // Задача 17
        getDolars(); // Задача 18
        System.out.println(howMuchHoursMinSecInDay()); // Advanced 2

    }

    /* 1. Напишите программу, которая вычисляет ваш вес на Луне с учетом того, что сила тяжести равна 16% от силы тяжести на Земле.*/
    public static double myWeightOnMoon() {
        double gEarth = 9.807;
        double gMoon = gEarth * 17 / 100;
        int myWeight = 52;
        double fMoon;
        fMoon = myWeight * gMoon;
        return fMoon;
    }

    /* 2. Напишите метод, который будет увеличивать каждый элемент массива на 10%. */
    public static int[] increaseMassive() {
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
        System.out.println("Четные числа от 1 до 100: ");
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    /* 5. Вывести на  экран все нечетные цифры от 1 до 15 (используйте остаток от деления) */
    public static void oddNumbers() {
        System.out.println("Нечетные числа от 1 до 15: ");
        for (int i = 1; i < 15; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    /* 6. Вывести на  экран все четные цифры от 1 до 100 не используя остаток от деления (используя только цикл for) */
    public static void evenNumbersFor() {
        System.out.println("Четные числа от 1 до 100 (используя только цикл for): ");
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

    /* 8. Пройти циклом по числам от 1 до 12 и вывести название месяца, соответствующее каждому числу (используя цикл и оператор if else) */
    public static void namesOfMounth() {
        for (int i = 1; i <= 12; i++) {
            if (i == 1) {
                System.out.println(i + " January");
            } else {
                if (i == 2) {
                    System.out.println(i + " February");
                } else {
                    if (i == 3) {
                        System.out.println(i + " March");
                    } else {
                        if (i == 4) {
                            System.out.println(i + " April");
                        } else {
                            if (i == 5) {
                                System.out.println(i + " May");
                            } else {
                                if (i == 6) {
                                    System.out.println(i + " June");
                                } else {
                                    if (i == 7) {
                                        System.out.println(i + " July");
                                    } else {
                                        if (i == 8) {
                                            System.out.println(i + " August");
                                        } else {
                                            if (i == 9) {
                                                System.out.println(i + " September");
                                            } else {
                                                if (i == 10) {
                                                    System.out.println(i + " October");
                                                } else {
                                                    if (i == 11) {
                                                        System.out.println(i + " November");
                                                    } else {
                                                        System.out.println(i + " December");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /*9 Объявить 2 переменных целого типа. Необходимо поменять значения переменных так, чтобы значение первой оказалось во второй, а второй - в первой.*/
    public static void reversParametrs() {
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
    public static void sumTwoNumbers() {
        int a = 5;
        int b = 6;
        int sum = a + b;
        System.out.println("sum = " + sum);
    }

    /* 11. Напишите программу с тремя переменными целого типа. Определить какое из них наибольшее. */
    public static void maxNumber() {
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
    public static void truefalse() {
        boolean a = true;
        boolean b = false;
        if (a == true) {
            System.out.println("a (" + a + ") = истина");
        } else {
            System.out.println("a (" + a + ")= ложь");
        }
        if (b == true) {
            System.out.println("b (" + b + ") = истина");
        } else {
            System.out.println("b (" + b + ") = ложь");
        }
    }

    /* 13. Напишите программу, где двум строковым переменным присваиваются значения, третей же строковой переменных присвойте объединение (конкатенацию) двух предыдущих строк.
    Затем напечатайте значение третьей строковой переменной. */
    public static void strConcat() {
        String a = "Hello, ";
        String b = "World!!!";
        String c = a + b;
        System.out.println(c);
    }

    /*14. Создайте программу с двумя переменными целого типа, присвойте им значения, если первая переменная больше второй, то увеличьте её значение на 3, иначе увеличьте значение второй переменной на 8.
    В конце программы выведите значения обоих чисел на экран.*/
    public static void solveTwoNumbers() {
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
    public static void getNumbersFor() {
        for (int i = 1; i < 100; i++) {
            System.out.println(i);
        }
    }

    public static void getNumbersWhile() {
        int i = 1;
        while (i < 100) {
            System.out.println(i);
            i++;
        }
    }

    public static void getNumbersDoWhile() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 100);
    }

    /* 16. Вывести на экран ряд натуральных чисел от минимума до максимума с шагом. Например, если минимум 10, максимум 35, шаг 5, то вывод должен быть таким: 10 15 20 25 30 35.
    Минимум, максимум и шаг указываются пользователем (можно захардкодить). */

    public static String rowNumbersWithStep() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите минимальное число: ");
        int min = scan.nextInt();
        System.out.println("Введите максимальное число: ");
        int max = scan.nextInt();
        System.out.println("Введите шаг: ");
        int step = scan.nextInt();
        String res = "";
        for (int i = min; i <= max; i += step) {
            res += i + " ";
        }
        return "Результат: " + res;
    }

    /* 17. Все элементы массива поделить на значение наибольшего элемента этого массива. */
    public static int[] divisionMassive() {
        int[] a = {10, 20, 30, 40, 50, 60};
        int max = a[0];
        int[] res = null;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            res[i] += a[i] / max;
        }
        return res;
    }

    /* 18. Напишите метод переводящий рубли в доллары по заданному курсу. В качестве аргументов укажите кол-во рублей и курс. */
    public static void getDolars() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите колличество рублей: ");
        int rubls = scan.nextInt();
        double kurs = 2.10;
        double res = rubls * kurs;
        System.out.println("Колличество долларов: " + res);
    }

    /* -----------------------------------------------------------------------------------------------------------------*/
    /* Advanced 2.	Напишите программу, которая будет считать количество часов, минут и секунд в n-ном количестве суток.*/
    public static String howMuchHoursMinSecInDay() {
        int defhours = 24;
        int defmins = 60;
        int defsecs = 60;
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int hours = defhours * days;
        int minets = defhours * days * defmins;
        int seconds = defhours * days * defmins * defsecs;
        String res = "В " + days + " д.: " + hours + " ч., " + minets + " мин., " + seconds + " сек.";
        return res;
    }
}


