package lesson;

import java.util.*;

public class hw6 {
    public static void main(String[] args) {


        Laptop laptop1 = new Laptop("Samsung", 17, "Intel Corei7", "White", 76000, "DDR3");
        Laptop laptop2 = new Laptop("MSI", 15, "Intel Core i7", "Black", 66000, "DDR3");
        Laptop laptop3 = new Laptop("VAIO", 16, "Intel Core i5 ", "Silver", 43000, "DDR4");
        Laptop laptop4 = new Laptop("MSI", 18, "Intel AMD Ryzen5", "Black", 89000, "DDR5");
        Laptop laptop5 = new Laptop("Acer", 17, "Intel Core i5", "Grey", 56000, "DDR4");
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        laptopArrayList.add(laptop1);
        laptopArrayList.add(laptop2);
        laptopArrayList.add(laptop3);
        laptopArrayList.add(laptop4);
        laptopArrayList.add(laptop5);

        for (Laptop laptop : laptopArrayList) {
            laptop.result(0, "");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите диагональ ноутбука: ");
        int userDiagonal = scanner.nextInt();

        if (userDiagonal < 15 && userDiagonal > 18) {
            System.out.println("такой диагонали нет!");
        } else  for (Laptop laptop : laptopArrayList) {
                laptop.result(userDiagonal, "");
            }

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Выберите марку из представленного списка: ");
        String userNameBrand = scanner1.nextLine();

        for (Laptop laptop : laptopArrayList) {
            laptop.result(0, userNameBrand);
        }

        System.out.println("\nРезультат:");
        for (Laptop laptop : laptopArrayList) {
            laptop.result(userDiagonal, userNameBrand);
        }

    }
}