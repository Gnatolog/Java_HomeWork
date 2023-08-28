package org.example;


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        Product product1 = new Product("s", "d");
        System.out.println(product1.displayinfo());

        BottelOfMilk bottelOfMilk = new BottelOfMilk("Молоко", "ООО Молоко",
                200, 1.5, 5);


        Product bottelOfWater1 = new BottelOfWater("Бутылка с водой", "ООО Источник",
                250, 2.5);
        Product bottelOfWater2 = new BottelOfWater("Бутылка с водой", "ООО Источник",
                350, 1.5);
        Product bottelOfWater3 = new BottelOfWater("Бутылка с водой", "ООО Источник",
                450, 3.0);


        Product chips1 = new Chips("Чипсы","Lay`s",  // Создаём экземпляр класса чипсы1
                150,50,"Ches","Potato");

        Product chips2 = new Chips("Чипсы","Lay`s", // Создаём экземпляр класса чипсы2
                200,90,"Paprika","Potato");

        Product chips3 = new Chips("Чипсы","Lay`s", // Создаём экземпляр класса чипсы3
                250,150," Green onions","Potato");

        Product chips4 = new Chips("Чипсы","Lay`s", // Создаём экземпляр класса чипсы4
                350,225,"Beacon","Potato");

        List<Product> products = new ArrayList<>();
        products.add(bottelOfMilk);
        products.add(bottelOfWater1);
        products.add(bottelOfWater2);
        products.add(bottelOfWater3);
        products.add(chips1);   // добавляем чипсы 1 в автомат
        products.add(chips2);   // добавляем чипсы 2 в автомат
        products.add(chips3);   // добавляем чипсы 3 в автомат
        products.add(chips4);   // добавляем чипсы 4 в автомат


        Vending_Machine vendingMachine = new Vending_Machine(products);
        BottelOfWater bottelOfWater = vendingMachine.getBottelOfWater("Бутылка с водой",1.5);
        if(bottelOfWater != null){
            System.out.printf("\nВот товар который вы купили: %s",bottelOfWater.displayinfo());
        }
        else {
            System.out.println("К сожалению такого товара в автомате нет");
        }

        // Ищем товар чипсы

        Chips chips = vendingMachine.getChips("Ches", 50);
        if(chips!=null){
            System.out.printf("\nВот товар который вы купили: %s", chips.displayinfo());
        }
        else {
            System.out.println("К сожалению такого товара в атвтомате нет");
        }

        // Ищем товар молоко

        BottelOfMilk bottelOfMilk1 = vendingMachine.getMilk(5,1.5);
            if(bottelOfMilk1!=null){
                System.out.printf("\nВот товар который вы купили: %s", bottelOfMilk1.displayinfo());
            }
            else {
                System.out.println("К сожалению такого товара в атвтомате нет");
            }
    }
}
