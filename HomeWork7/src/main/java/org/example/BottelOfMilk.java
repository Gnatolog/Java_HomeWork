package org.example;

public class BottelOfMilk extends Product {
    /*
     * Класс бутылки с  молоком
     * */

    private double volume; // обьём
    private int fat; // Содержание жирности


    public BottelOfMilk(String name, String brand, double price, double volume, int fat){
        super(name,brand,price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public int getFat() {
        return fat;
    }

    @Override
    public String displayinfo() {
        return String.format("""
                    
                
                    Product: %s
                    Brand: %s
                    Price: %.2f
                    Volume: %.1f.l
                    Fat: %d%%
                """,name,brand,price,volume,fat);

    }
}
