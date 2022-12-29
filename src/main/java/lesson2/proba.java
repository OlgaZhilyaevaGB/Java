/*package lesson2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class proba {

    public static void main(String[] args) {
        ex1();
    }
        private static void ex1() {
            String userName = "bobov";
            Map<String, ArrayList<String>> phoneNote = new HashMap<>();
           // ArrayList<String>number_list= new ArrayList<>();

            add ("antonyan", "1");
            phoneNote add("antonyan", "2");
            phoneNote.put("bobov", "3");
            phoneNote.put("bobov", "4");
            phoneNote.put("antonyan", "5");
            phoneNote.put("igoryan", "6");
            phoneNote.put("bobov", "7");
            phoneNote.put("smetanov", "8");
            phoneNote.put("igoryan", "9");

            for (String key : phoneNote.keySet()) {
                if (phoneNote.get(key).equals(userName)) {
                    System.out.printf("%s-%s%n", key, phoneNote.get(key));
                }
            }


        }

     public void add( String Name, String phone) {
         Map<String, ArrayList<String>> phoneNote = new HashMap<>();
         ArrayList<String>number_list= new ArrayList<>();
        if (number_list! == name) {
            number_list = phoneNote.get(Name);
            number_list.add(phone);
            phoneNote.put(Name, number_list);
        } else {
            number_list = new ArrayList<>();
            number_list.add(phone);
            phoneNote.put(Name, number_list);
        }
    }


        public ArrayList<String> get (String Name) {
            phoneNote = new HashMap<>();
            return phoneNote.get(Name);
        }

    }*/