package hw_3_1;

import hw_3_1.frut.Apple;
import hw_3_1.frut.Box;
import hw_3_1.frut.Fruit;
import hw_3_1.frut.Orange;

public class Main {
    public static void main(String[] args) {
        //Задание 1.2
        String[] arr = {"ddd", "fff", "eee"};
        ArrayProcessing <String> newarr = new ArrayProcessing<>();
        System.out.println(newarr.convertingToArrayList(arr));
        newarr.swapArrayElements(arr, 1, 2);
        //Задание 3
        //Задаём вес фруктов
        final float orangeWeight = 1.5f;
        final float appleWeight = 1.0f;
        //Создаём две коробки с указанием типов помещаемых туда фруктов
        Box <Orange> orangeBox1 = new Box<>();
        Box <Apple> appleBox1 = new Box<>();
        //Заполняем коробки фруктами, аргументы amountOrange и amountApple указывают, сколько фруктов мы положим в коробку
        //Причем нельзя положить яблоко в коробку для апельсинов
        int amountOrange = 4;
        int amountApple = 6;


        for (int i = 0; i < 3 ; i++) {
            orangeBox1.fruitArray(amountOrange, orangeWeight);
            appleBox1.addingFruitToBox(new Apple(appleWeight));
        }
        //Считаем вес коробки
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.getWeight());
        //Сравниваем 2 коробки
        System.out.println(orangeBox1.compare(appleBox1));
        //пересыпаем фрукты из коробки в коробку












    }
}
