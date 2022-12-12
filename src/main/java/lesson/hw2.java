package lesson;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("а роза упала на лапу азора"));
        isText();
    }

    //1. Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
    // (возвращает boolean значение).
    //Метод 1.
    public static boolean isPalindrome(String text) {
        String newtext = text.replaceAll("\\s+", "").toUpperCase();
        //создаем нов строку, убираем все пробелы, переводим в нижний регистр
        int length = newtext.length();//длинна введенной строки
        int start = 0;
        int finish = length - 1;
        while (finish > start) {
            char startCh = newtext.charAt(start++);
            char finishCh = newtext.charAt(finish--);
            //сверяем первый и последний символ строки между собой
            if (startCh != finishCh)
                return false;
        }
        return true;
    }


    //Метод 2
    /*public static boolean isPalindrome(String text) {
         String newtext = text.replaceAll("\\s+", "");
         return newtext.equalsIgnoreCase(new StringBuilder(text).reverse().toString());
         //text.equalsIgnoreCase- сравнивает строки без учета регистра;
        //reverse(). -переворачиваем строку (реверс)

    }
*/
    //Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который запишет эту
    // строку в простой текстовый файл, обработайте исключения.

    static void isText() {
        System.out.print("Введите текст: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (count < 100) {
            sb.append(text);
            count++;
        }

        try (PrintWriter pw = new PrintWriter("src/main/resources/files/test.txt")) {
            pw.print(sb.toString());
            pw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
