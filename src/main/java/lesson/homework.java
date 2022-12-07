package lesson;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
public class homework {

    public static void main(String[] args) {

        zd1();
        zd2();
        zd3();
        zd4();
        zd6();
        zd7();
        zd8();
        zd9();
        zd10();
        zd11();

    }

    //Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    static void zd1() {
        System.out.print("Введите первое число: ");
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int second = scanner.nextInt();
        System.out.printf("Числа, %s, %s%n", first, second);
        int sum = first + second;
        boolean Tru = ((10 <= sum) && (sum <= 20));
        System.out.println(Tru);

    }


    //Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    static void zd2() {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 0)
            System.out.println("Число положительное");
        else
            System.out.println("Отрицательное");

    }

    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число
    // отрицательное, и вернуть false если положительное.
    static void zd3() {
        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean a = (num < 0);
        System.out.println(a);
    }

    //Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль
    // указанную строку, указанное количество раз;
    static void zd4() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.print("Введите  число: ");
        int num = scanner.nextInt();
        for (int i = 0; num > i; i++) {
            System.out.println(str);
        }
    }



    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    static void zd6() {
        Random random = new Random();
        int[] Array = new int[10];
        for (int i = 0; i < Array.length - 1; i++) {
            Array[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(Array));

        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] == 1) {
                Array[i] = 0;
            } else {
                Array[i] = 1;
            }

        }
        System.out.println(Arrays.toString(Array));
    }

    //Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    static void zd7() {

        int[] Array = new int[100];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = i + 1;
        }
        System.out.println(Arrays.toString(Array));
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    static void zd8() {
        int[] Array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] <= 6) {
                Array[i] = Array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(Array));
    }

    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе
    // сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], …, [n][n];
    static void zd9() {

        System.out.print("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int str = scanner.nextInt();
        int[][] array = new int[str][str];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, d = array[i].length - 1; j < array[i].length; j++, d--) {
                //array[i][j]=(int)(Math.random()*10);
                if (i == j || i == d) {
                    array[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

        }
    }

    //Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int
    // длиной len, каждая ячейка которого равна initialValue;
    static void zd10() {
        System.out.print("Введите размер массива (len): ");
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        System.out.print("Введите значение массива (initialValue): ");
        int initialValue = scanner.nextInt();
        int[][] array = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = initialValue;
            }
        }
        for (int i = 0; i < array.length; i++, System.out.println()) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
        }
    }


// Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    static void zd11() {
        Random random = new Random();
        int[] Array = new int[10];
        //int[] Array = {24, 7, 100, 34, 12, 110, 8};
        for (int i = 0; i < Array.length - 1; i++) {
            Array[i] = random.nextInt(1, 50);
        }

        System.out.println(Arrays.toString(Array));

        int min=Array[0];
        int max=0;
        for(int i = 0; i < Array.length; i++)
            if (Array[i] > max) {
                max = Array[i];
            } else if (Array[i] < min) {
                min = Array[i];
            }
        System.out.printf("Минимальное значение в массиве:%s%n", min);
        System.out.printf("Максимальное значение в массиве:%s%n", max);
    }
}