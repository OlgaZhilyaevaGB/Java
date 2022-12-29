package lesson2;

import java.util.HashMap;
import java.util.Map;

public class lesson5 {
    public static void main(String[] args) {
        ex1();
    }
    //Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
    //123456 Иванов
    //321456 Васильев
    //234561 Петрова
    //234432 Иванов
    //654321 Петрова
    //345678 Иванов
    //Вывести данные по сотрудникам с фамилией Иванов.
   /* private  static  void ex1() {
        String userName = "Иванов";
        Map<String, String> passport = new HashMap<>();
        passport.put("123456", "Иванов");
        passport.put("321456", "Васильев");
        passport.put("234561", "Петрова");
        passport.put("234432", "Иванов");
        passport.put("654321", "Петрова");
        passport.put("345678", "Иванов");

        for (String key : passport.keySet()) {
            if (passport.get(key).equals(userName)) {

                System.out.printf("%s-%s%n", key,passport.get(key));
            }
        }*/
        /*for(Map.Entry<String, String> entry : passport.entrySet()) {
            if (entry.getValue().equals(userName)) {
                System.out.println("%s-%s%n", entry.getKey(),entry.getValue());
            }
        }*/

    //Перевисти число из арабского в римское

    private static void ex1() {
        String userName = "Иванов";
        Map<String, String> passport = new HashMap<>();
        passport.put("123456", "Иванов");
        passport.put("321456", "Васильев");
        passport.put("234561", "Петрова");
        passport.put("234432", "Иванов");
        passport.put("654321", "Петрова");
        passport.put("345678", "Иванов");

        for (String key : passport.keySet()) {
            if (passport.get(key).equals(userName)) {

                System.out.printf("%s-%s%n", key, passport.get(key));
            }

        }
    }
}