package lesson;
import java.util.Scanner;

public class Laptop {
    private String brandName;
    private String processor;
    private String color;
    private String  typeMemory;
    private int price;
    private int diagonal;


    public Laptop(String brandName, int diagonal, String processor, String color, int price, String typeMemory) {
        this.brandName = brandName;
        this.price = price;
        this.processor = processor;
        this.diagonal = diagonal;
        this.color = color;
        this.typeMemory = typeMemory;

    }

    public void result (int userDiagonal, String userNameBrand) {
        if (diagonal == userDiagonal&& (brandName.equals(userNameBrand) | userNameBrand == "")){
            System.out.printf("У ноутбука %s с диагональю: %s, цена %s, процессор: %s, цвет: %s, тип ОП: %s%n", brandName, diagonal, price, processor, color, typeMemory);

        }
    }


    public String toString() {
        return String.format("У ноутбука %s с диагональю: %s, цена %s, процессор: %s, цвет: %s, тип ОП: %s%n", brandName, diagonal, price, processor, color, typeMemory);
    }
}