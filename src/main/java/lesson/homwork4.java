package lesson;

import java.util.LinkedList;

public class homwork4 {
    public static void main(String[] args) {
        ex0();
    }

    //  Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
    private static void ex0() {
        int[] listArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        LinkedList<Integer> ll = new LinkedList<>();
        for (Integer temp : listArr) {
            ll.add(temp);
        }
        int count = 0;
        while (count != ll.size() - 1) {
            ll.add(ll.size() - count, ll.getFirst());
            ll.removeFirst();
            count++;
        }
        System.out.println("Перевернутый список: " + ll);

    }


}

