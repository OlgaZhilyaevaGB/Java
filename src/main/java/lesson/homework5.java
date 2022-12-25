package lesson;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class homework5 {
    public static Map<String, ArrayList<String>> phoneNote = new HashMap<>();
    public static ArrayList<String> number_list;
    public static void main(final String[] args) {


        add("Иванов", "8-021-345-67-23");
        add("Петров", "8-950-333-56-78");
        add("Иванов", "8-911-013-45-65");
        add("Сидоров", "8-921-456-67-89");
        add("Соколов", "8-911-237-45-90");
        add("Васильев", "8-921-345-12-31");
        add("Петров", "8-950-345-51-57");
        add("Иванов", "8-921-342-78-09");
        add("Соколов", "8-911-561-56-89");
        add("Соколов", "8-913-459-20-00");

        String phone_list=String.join(",", phoneNote.get("Иванов"));
        System.out.println("Иванов: " + phone_list +  "");
        String phone_list2 =String.join(",", phoneNote.get("Петров"));
        System.out.printf("Петров: %s", phone_list2);

    }


    public static void add (String surname, String phone_number) {

        if (phoneNote.containsKey(surname)) {
            number_list = phoneNote.get(surname);
            number_list.add(phone_number);
            phoneNote.put(surname, number_list);
        } else {
            number_list = new ArrayList<>();
            number_list.add(phone_number);
            phoneNote.put(surname, number_list);
        }
    }

}

