package hw_3_1.frut;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {
    List<T> fruitBox = new ArrayList<>();

    public List<T> getFruitBox() {
        return fruitBox;
    }

    public void addingFruitToBox(T ... fruit){
        fruitBox.add(fruit);
    }

    public void fruitArray(int amountFruit, float weight){
        Fruit[] arrayFruit = new Fruit[amountFruit];
        for (int i = 0; i < arrayFruit.length; i++) {
            arrayFruit[i] = new Fruit(weight);
        }
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

    public void PourFruitAnotherBox(){

    }
}
