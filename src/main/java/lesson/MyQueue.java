package lesson;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {
    private static LinkedList<String> queue;

    public static void main(String[] args) {
        Queue qu = new LinkedList<Integer>();
        add(qu, "Геральд из Ривии");
        add(qu, "Цирилла");
        add(qu, "Трисс Меригольд");
        add(qu, "Ярпен Зигрид");
        add(qu, "Йеннифер из Венгерберга");
        add(qu, "Филиппа Эйльхарт");
        System.out.println("Карты в руке: " + qu);
        System.out.println("Покажи первую карту, которая пришла : " + top(qu));
        System.out.println("Покажи и скинь первую карту: " + remove(qu));
        System.out.println("Оставшиеся карты в руке: " + qu);

    }

    private static void add(Queue qu, String n) {
        qu.add(new String(n));
        System.out.println("Возьми карту: (" + n + ")");
    }

    private static String top(Queue qu) {
        String karta = (String) qu.element();
        return karta;

    }

    private static String remove(Queue qu) {
        String karta = (String) qu.remove();
        return karta;
    }
}
