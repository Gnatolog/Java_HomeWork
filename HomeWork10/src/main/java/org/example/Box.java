package org.example;
import java.util.ArrayList;
import java.util.Objects;

public class Box<T extends Fruit> {

    /*
    * Задаёём обобщенну корзину под конкретный тип фрукта который мы будем загружать в неё
    * */
    ArrayList<T> basket_fruit;

    public Box(ArrayList<T> basket_fruit) {
        this.basket_fruit = basket_fruit;
    }

    @Override
    public String toString() {
        /*
        * Переопределение метода To String
        * */
        {
            try {
                // Проводим проверку на пустоту если корзина пуста то выводим это иначе выводим содержимое корзины

                String type = basket_fruit.get(0).getType();
                float only_weight = basket_fruit.get(0).getWeight();
                int quantity = basket_fruit.size();
                float total_weight = quantity * only_weight;
                return String.format("Всего в корзине: %d %s | Вес одного %s равен %.2f.f | " +
                                "Общий вес корзины составляет: %.2f.f\n",
                        quantity, type, type,only_weight, total_weight);

            }catch ( RuntimeException e){
                return "Корзина из которой пересыпали пуста";
            }
        }
    }

    private float getWight(){
        /*
        * Внктренний метод получения сухих чисел веса корзины
        * */
        return basket_fruit.size() * basket_fruit.get(0).getWeight();
    }

    public boolean compare(Box<?> basket){
        /*
        * Метод возвращает равенство(true) или не равество(false) корзин по весу используем постановочный знак
        * для снятия привязки по типу обьекта
        * */
        return getWight()==basket.getWight();
    }


    public Box<?> pour_over(Box<?> basket1, Box<?> basket2){
        /*
        * Метод иметирующий пересыпания обьектов из одной корзины в другую
        * */
        try{
            // обработка исключения в случае если корзина пуста не зачем пересыпать
            // берем первую иначе пытаемя пересыпать и если в корзинах обьекты одинаковые то делаем это
            // иначе пересыпать не получиться

            if(Objects.equals(basket1.basket_fruit.get(0).getType(), basket2.basket_fruit.get(0).getType())){
                System.out.println("\nКорзина в которую пересыпали до пересыпания");
                System.out.println(basket2);
                System.out.println("\nКорзина из которой пересыпали до пересыпания");
                System.out.println(basket1);
                basket2 = new Box<>(new ArrayList<>(basket1.basket_fruit));
                basket1.basket_fruit=new ArrayList<>();
                System.out.println(basket1);
                System.out.println("\nКорзина в которую пересыпали после ппроцесса пересыпания");
                return basket2;
            }

        }catch (RuntimeException e){
            return basket1;
        }

        System.out.printf("Корзиный разные мы не смогли пересыпать поменяйте корзины " +
                "что бы они были равны Вот ваша корзина из которой вы хотели пересыпать:\n%s",basket1);
        System.out.println("Это корзина в которую вы хотели пересыпать ");
        return basket2;
    }
}
















