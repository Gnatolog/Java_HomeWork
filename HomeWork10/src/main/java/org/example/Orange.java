package org.example;

public class Orange extends Fruit{

    static float weight = 1.5f;

    @Override
    public float getWeight() {
        /*
         * Имплементируем метод базового класса Fruit и возвращаем значение веса апельсина
         * */
        return weight;
    }

    @Override
    public String getType() {
        /*
         * Имплементируем метод базового Fruit класса и возвращаем  тип фрукта
         * */
        return "Orange";
    }
}
