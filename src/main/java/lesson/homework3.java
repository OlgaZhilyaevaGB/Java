package lesson;
import java.util.*;
import java.util.stream.IntStream;

public class homework3 {
    public static void main(String[] args) {
        zadacha1();
        zadacha2();
    }

    //1. Пусть дан произвольный список целых чисел, удалить из него четные числа
    // (в языке уже есть что-то готовое для этого)

    private static void zadacha1() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(40));
        }
        System.out.printf("Массив:%s%n",list);
        list.removeIf(i->i%2==0);
        System.out.printf("Массив без четных:%s%n",list);
    }

    //Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
    private static void zadacha2() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(40));
        }
        System.out.printf("Массив:%s%n",list);
        int res = 0;
        int lenght = list.size();
        for (int i = 0; i < lenght; i++) {
             res = res + list.get(i);}
        System.out.printf("Минимальное значение в массиве:%s%n", Collections.min(list));
        System.out.printf("Минимальное значение в массиве:%s%n", Collections.max(list));
        System.out.printf("Среднее арифметическое значение в массиве:%s%n", res/lenght);

    }
}