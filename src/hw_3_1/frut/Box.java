package hw_3_1.frut;

import java.util.*;

public class Box <T extends Fruit> {
    public List<T> fruitBox;

    public Box(T ... fruit){
        this.fruitBox = new  ArrayList<>(Arrays.asList(fruit));
    }

    public float getWeight(){
        float summ = 0.0F;
        for (int i = 0; i < fruitBox.size(); i++) {
            summ = fruitBox.get(i).getWeight() + summ;
        }
        return summ;
    }

    public boolean compare(Box <?> anyBox){
        return Math.abs(this.getWeight() - anyBox.getWeight()) < 0.0001;
    }

    private void addAll(List <? extends T> fruitList){
        fruitBox.addAll(fruitList);
    }

    public  void pourFruitAnotherBox(Box <? super T> boxFruits) {
       boxFruits.addAll(fruitBox);
       fruitBox.clear();
    }

}
