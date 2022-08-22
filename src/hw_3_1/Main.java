package hw_3_1;

import hw_3_1.frut.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1.2
        String[] arr = {"ddd", "fff", "eee"};
        ArrayProcessing <String> newarr = new ArrayProcessing<>();
        System.out.println(newarr.convertingToArrayList(arr));
        newarr.swapArrayElements(arr, 1, 2);
        //Задание 3
        //Задаём вес фруктов и их количество
        final float orangeWeight = 1.5f;
        final float appleWeight = 1.0f;
        //Создаём две коробки с указанием типов помещаемых туда фруктов
        //Заполняем коробки заданным количеством фруктов
        //Причем нельзя положить яблоко в коробку для апельсинов
        Box <Orange> orangeBox1 = new Box<>(new Orange(orangeWeight), new Orange(orangeWeight), new Orange(orangeWeight));
        Box <Apple> appleBox1 = new Box<>(new Apple(appleWeight), new Apple(appleWeight), new Apple(appleWeight));
        Box <Apple> appleBox2 = new Box<>(new Apple(appleWeight), new Apple(appleWeight));
        Box <GoldenApple> goldenAppleBox = new Box<>(new GoldenApple(appleWeight));
        //Считаем вес коробки
        System.out.println(orangeBox1.getWeight());
        System.out.println(appleBox1.getWeight());
        //Сравниваем 2 коробки
        System.out.println("Коробки равны по весу: " + orangeBox1.compare(appleBox1));
        //пересыпаем фрукты из коробки в коробку
        System.out.println("В коробке 1 до пересыпания - " + appleBox1.getWeight());
        System.out.println("В коробке 2 до пересыпания - " + appleBox2.getWeight());
        appleBox1.pourFruitAnotherBox(appleBox2);
        System.out.println("В коробке 1 после пересыпания - " + appleBox1.getWeight());
        System.out.println("В коробке 2 после пересыпания - " + appleBox2.getWeight());


    }




}
