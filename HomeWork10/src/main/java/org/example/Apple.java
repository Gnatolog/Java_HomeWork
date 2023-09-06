package org.example;

public class Apple extends Fruit{

    static float weight = 1.0f;

    @Override
    public float getWeight() {
        /*
         * Имплементируем метод базового Fruit класса и возвращаем значение веса яблока
         * */
        return weight;
    }

    @Override
    public String getType() {
        /*
         * Имплементируем метод базового Fruit класса и возвращаем  тип фрукта
         * */
        return "Apple";
    }


}
