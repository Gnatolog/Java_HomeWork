package org.example;

import java.util.List;

public class Vending_Machine {
    private List<Product> products;

    public Vending_Machine(List<Product> products) {
        this.products = products;
    }

    public BottelOfWater getBottelOfWater(String name, double volume) {
//        Метод поиска бутылки с водой в вендинг машине

        for (Product product : products) {
            if(product instanceof BottelOfWater bottelOfWater){
                if (bottelOfWater.getName().equals(name)  && bottelOfWater.getVolume() == volume){
                    return bottelOfWater;
                }

            }

        }
        return null;
    }

    public Chips getChips(String taste, int gram){
//        Метод поиска чипсов в вендинг машине

        for (Product product: products){
            if(product instanceof Chips chips){
                if(chips.getTaste().equals(taste) && chips.getGram() == gram){
                    return chips;
                }
            }
        }
        return null;
    }

    public  BottelOfMilk getMilk(int fat, double volume){
//        Метод повиска молока в вендинг машине

        for(Product product: products){
            if(product instanceof BottelOfMilk bottelOfMilk){
                if(bottelOfMilk.getFat() == fat && bottelOfMilk.getVolume() == volume){
                    return bottelOfMilk;
                }
            }
        }
        return null;
    }

}
