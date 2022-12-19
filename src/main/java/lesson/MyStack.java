package lesson;

import java.util.LinkedList;
import java.util.Stack;

public class MyStack {
    private static LinkedList<String> stack;

    public static void main(String[] args) {
        Stack st = new Stack<>();
        push_method(st, "Геральд из Ривии");
        push_method(st, "Цирилла");
        push_method(st, "Трисс Меригольд");
        push_method(st, "Ярпен Зигрид");
        push_method(st, "Йеннифер из Венгерберга");
        push_method(st, "Филиппа Эйльхарт");
        System.out.println("Карты в руке: " + st);
        System.out.println("Покажи последнюю карту, которая пришла : " + peek_method(st));
        System.out.println("Покажи и скинь последнюю карту: " + pop_method(st));
        System.out.println("Оставшиеся карты в руке: " + st);

    }

    private static void push_method(Stack st, String n) {
        st.push(new String(n));
        System.out.println("Возьми карту: (" + n + ")");

    }

    private static String peek_method(Stack st) {
        String karta = (String) st.peek();
        return karta;
    }

    private static String pop_method(Stack st) {
        String karta = (String) st.pop();
        return karta;

    }
}