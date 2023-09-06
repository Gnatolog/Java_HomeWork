package org.example;


//        a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;

//        b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
//        поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

//        c. Для хранения фруктов внутри коробки можно использовать ArrayList;

//        d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
//        вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

//        e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
//        подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//        Можно сравнивать коробки с яблоками и апельсинами;

//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
//        Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
//        Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

//        g. Не забываем про метод добавления фрукта в коробку.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        /*
        * Создаём экземпляры типа Apple
        * */
        Apple app1 = new Apple();
        Apple app2 = new Apple();
        Apple app3 = new Apple();
        Apple app4 = new Apple();
        Apple app5 = new Apple();
        Apple app6 = new Apple();
        Apple app7 = new Apple();

        /*
        * Создаём корзину под Apple и добовляем наши экземпляры в неё
        * */
        Box<Apple> apples = new Box<>(new ArrayList<>());
        apples.basket_fruit.add(app1);
        apples.basket_fruit.add(app2);
        apples.basket_fruit.add(app3);
        apples.basket_fruit.add(app4);
        apples.basket_fruit.add(app5);
        apples.basket_fruit.add(app6);
        apples.basket_fruit.add(app7);

        /*
         * Создаём экземпляры типа Orange
         * */
        Orange oran1 = new Orange();
        Orange oran2 = new Orange();
        Orange oran3 = new Orange();
        Orange oran4 = new Orange();
        Orange oran5 = new Orange();
        Orange oran6 = new Orange();
        Orange oran7 = new Orange();


        /*
         * Создаём корзину под Orange и добовляем наши экземпляры в неё
         * */
        Box<Orange> oranges = new Box<>(new ArrayList<>());
        oranges.basket_fruit.add(oran1);
        oranges.basket_fruit.add(oran2);
        oranges.basket_fruit.add(oran3);
        oranges.basket_fruit.add(oran4);
        oranges.basket_fruit.add(oran5);
        oranges.basket_fruit.add(oran6);
        oranges.basket_fruit.add(oran7);

        /*
        * Убеждаемся что ограничения на корзине и типизация работает
        * */
//        Box<Object> obj = new Box<>();     // Не возможно создать корзину если обьект не относиться к
//                                              базовому абстракттному классу Fruit

//        apples.basket_fruit.add(oran);        // в корзину с яблоками нельзя положить апельсины

//        oranges.basket_fruit.add(app3);      // в корзину с апельсинами нельзя положить яблоки

        // Выводи полученный результат  решение (a,b,c,d,g(метод добовления в список из коробки))
        System.out.println("Корзина с яблоками: ");
        System.out.println(apples);
        System.out.println("Корзина с апельсинами: ");
        System.out.println(oranges);
        System.out.printf("Равен ли Вес корзин: %b\n",oranges.compare(apples));

        // Создаём вторую корзину с апельсинами для проверки метода в деле
        Box<Orange> oranges2 = new Box<>(new ArrayList<>());
        oranges2.basket_fruit.add(oran5);
        oranges2.basket_fruit.add(oran4);
        oranges2.basket_fruit.add(oran1);

        //Запускаем метод персыпания из корзины с апельсинами в корзину апельсинов
        System.out.println(oranges.pour_over(oranges,oranges2));
        //Запускаем метод пересыпания из корзины с апельсинами в корзину с яблоками
        System.out.println(oranges.pour_over(oranges2,apples));

    }
}